package com.template.project.mappers;

import com.template.project.dtos.DictamenDataResponseDto;
import com.template.project.models.DictamenData;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DictamenDataMapper {
    DictamenDataMapper INSTANCE = Mappers.getMapper(DictamenDataMapper.class);

    DictamenDataResponseDto toResponse(DictamenData modelExample);

    List<DictamenDataResponseDto> toResponses(List<DictamenData> dictamenDatas);

}
