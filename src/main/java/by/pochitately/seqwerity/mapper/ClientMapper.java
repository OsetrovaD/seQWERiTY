package by.pochitately.seqwerity.mapper;

import by.pochitately.seqwerity.dto.request.ClientRequest;
import by.pochitately.seqwerity.dto.response.ClientResponse;
import by.pochitately.seqwerity.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ClientMapper extends BaseMapper<Client, ClientRequest, ClientResponse> {
}
