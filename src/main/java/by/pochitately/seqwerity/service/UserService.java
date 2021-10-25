package by.pochitately.seqwerity.service;

import by.pochitately.seqwerity.dto.request.UserRequest;
import by.pochitately.seqwerity.dto.response.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {

    List<UserResponse> getAll();

    UserResponse getById(UUID id);

    UserResponse create(UserRequest userRequest);

    UserResponse update(UUID id, UserRequest updateRequest);

    void deleteById(UUID id);
}
