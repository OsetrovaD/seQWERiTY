package by.pochitately.seqwerity.controller;

import by.pochitately.seqwerity.dto.request.ClientRequest;
import by.pochitately.seqwerity.dto.response.ClientResponse;
import by.pochitately.seqwerity.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<List<ClientResponse>> getAll() {
        return ResponseEntity.ok(clientService.getAll());
    }

    @PostMapping
    public ResponseEntity<ClientResponse> create(@RequestBody ClientRequest clientRequest) {
        return new ResponseEntity<>(clientService.create(clientRequest), CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientResponse> getById(@PathVariable UUID id) {
        return ResponseEntity.ok(clientService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientResponse> update(@PathVariable UUID id,
                                                 @RequestBody ClientRequest updateRequest) {
        return ResponseEntity.ok(clientService.update(id, updateRequest));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteById(@PathVariable UUID id) {
        clientService.deleteById(id);
    }
}
