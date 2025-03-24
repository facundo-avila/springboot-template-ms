package com.template.project.services;

import com.template.project.dtos.DictamenDataResponseDto;

import java.util.List;

public interface DictamenDataService {
    public DictamenDataResponseDto getById(Long id);
    public List<DictamenDataResponseDto> getAll();
}
