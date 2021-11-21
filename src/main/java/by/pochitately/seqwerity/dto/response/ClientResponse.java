package by.pochitately.seqwerity.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class ClientResponse {
    private UUID id;
    private String name;
    private String secret;
    private List<String> redirectionUris;
}
