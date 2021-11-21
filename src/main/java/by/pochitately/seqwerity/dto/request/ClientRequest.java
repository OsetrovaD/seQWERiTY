package by.pochitately.seqwerity.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClientRequest {
    private String name;
    private List<String> redirectionUris;
}
