package by.pochitately.seqwerity.service.impl;

import by.pochitately.seqwerity.dto.request.UserRequest;
import by.pochitately.seqwerity.dto.response.UserResponse;
import by.pochitately.seqwerity.mapper.UserMapper;
import by.pochitately.seqwerity.model.User;
import by.pochitately.seqwerity.repository.UserRepository;
import by.pochitately.seqwerity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Override
    public List<UserResponse> getAll() {
        return userRepository.findAll().stream()
                .map(userMapper::map)
                .toList();
    }

    @Override
    public UserResponse getById(UUID id) {
        return userRepository.findById(id)
                .map(userMapper::map)
                .orElseThrow();
    }

    @Override
    public UserResponse create(UserRequest userRequest) {
        User createdUser = userMapper.map(userRequest);
        return userMapper.map(userRepository.save(createdUser));
    }

    @Override
    public UserResponse update(UUID id, UserRequest updateRequest) {
        User user = userRepository.findById(id).orElseThrow();
        User updatedUser = userRepository.save(userMapper.update(user, updateRequest));
        return userMapper.map(updatedUser);
    }

    @Override
    public void deleteById(UUID id) {
        if (!userRepository.existsById(id)) {
            throw new NoSuchElementException(String.format("There is no user with id %s", id));
        }
        userRepository.deleteById(id);
    }
}
