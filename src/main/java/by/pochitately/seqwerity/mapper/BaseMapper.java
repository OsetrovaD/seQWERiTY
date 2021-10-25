package by.pochitately.seqwerity.mapper;

import by.pochitately.seqwerity.model.BaseEntity;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

public abstract class BaseMapper<Entity extends BaseEntity, Request, Response> {

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    public abstract Entity map(Request request);

    public abstract Response map(Entity entity);

    public abstract Entity update(@MappingTarget Entity entity, Request updateRequest);
}
