package com.template.project.mappers;

import com.template.project.dtos.ExampleResponseDto;
import com.template.project.models.ModelExample;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ExampleMapper {
    ExampleMapper INSTANCE = Mappers.getMapper(ExampleMapper.class);

    ExampleResponseDto toResponse(ModelExample modelExample);

}
