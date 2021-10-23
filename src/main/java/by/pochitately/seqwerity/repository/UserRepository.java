package by.pochitately.seqwerity.repository;

import by.pochitately.seqwerity.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepository extends MongoRepository<User, UUID> {
}
