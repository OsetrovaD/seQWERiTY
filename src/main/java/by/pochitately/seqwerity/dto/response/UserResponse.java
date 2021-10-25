package by.pochitately.seqwerity.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class UserResponse {
    private UUID id;
    private String name;
    private String email;
}
