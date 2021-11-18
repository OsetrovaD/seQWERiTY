package by.pochitately.seqwerity.service.impl;

import by.pochitately.seqwerity.dto.request.ClientRequest;
import by.pochitately.seqwerity.dto.response.ClientResponse;
import by.pochitately.seqwerity.mapper.ClientMapper;
import by.pochitately.seqwerity.model.Client;
import by.pochitately.seqwerity.repository.ClientRepository;
import by.pochitately.seqwerity.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientMapper clientMapper;
    private final ClientRepository clientRepository;

    @Override
    public List<ClientResponse> getAll() {
        return clientRepository.findAll().stream()
                .map(clientMapper::map)
                .toList();
    }

    @Override
    public ClientResponse getById(UUID id) {
        return clientRepository.findById(id)
                .map(clientMapper::map)
                .orElseThrow();
    }

    @Override
    public ClientResponse create(ClientRequest clientRequest) {
        Client createdClient = clientMapper.map(clientRequest);
        createdClient.setSecret(generateClientSecret());
        return clientMapper.map(clientRepository.save(createdClient));
    }

    private String generateClientSecret() {
        SecureRandom random;
        try {
            random = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No strong SecureRandom instance available to generate strong secret", e); // NOSONAR using Runtime until Exception Handling is implemented
        }

        byte[] bytes = new byte[32];
        random.nextBytes(bytes);

        StringBuilder builder = new StringBuilder();
        for (byte singleByte : bytes) {
            builder.append("%02x".formatted(singleByte));
        }
        return builder.toString();
    }

    @Override
    public ClientResponse update(UUID id, ClientRequest updateRequest) {
        Client client = clientRepository.findById(id).orElseThrow();
        Client updatedClient = clientRepository.save(clientMapper.update(client, updateRequest));
        return clientMapper.map(updatedClient);
    }

    @Override
    public void deleteById(UUID id) {
        if (!clientRepository.existsById(id)) {
            throw new NoSuchElementException("There is no client with id " + id);
        }
        clientRepository.deleteById(id);
    }
}
