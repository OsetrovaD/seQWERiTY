package by.pochitately.seqwerity.mapper;

import by.pochitately.seqwerity.dto.request.UserRequest;
import by.pochitately.seqwerity.dto.response.UserResponse;
import by.pochitately.seqwerity.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public abstract class UserMapper extends BaseMapper<User, UserRequest, UserResponse> {
}
