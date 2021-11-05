package by.pochitately.seqwerity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("clients")
public class Client extends BaseEntity {
    private String name;
    private String secret;
    private List<String> redirectionUris;
}
