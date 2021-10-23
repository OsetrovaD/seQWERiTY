package by.pochitately.seqwerity.repository;

import by.pochitately.seqwerity.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ClientRepository extends MongoRepository<Client, UUID> {
}
