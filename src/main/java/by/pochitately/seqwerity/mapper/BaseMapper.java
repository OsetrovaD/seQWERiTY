package by.pochitately.seqwerity.mapper;

import by.pochitately.seqwerity.model.BaseEntity;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

public interface BaseMapper<Entity extends BaseEntity, Request, Response> { //NOSONAR Generic names

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    Entity map(Request request);

    Response map(Entity entity);

    Entity update(@MappingTarget Entity entity, Request updateRequest);
}
