package by.pochitately.seqwerity.service;

import by.pochitately.seqwerity.dto.request.ClientRequest;
import by.pochitately.seqwerity.dto.response.ClientResponse;

import java.util.List;
import java.util.UUID;

public interface ClientService {

    List<ClientResponse> getAll();

    ClientResponse getById(UUID id);

    ClientResponse create(ClientRequest clientRequest);

    ClientResponse update(UUID id, ClientRequest clientRequest);

    void deleteById(UUID id);
}
