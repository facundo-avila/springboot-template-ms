package com.template.project.services;

import com.template.project.dtos.ExampleResponseDto;
import com.template.project.mappers.ExampleMapper;
import com.template.project.models.ModelExample;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {
    @Override
    public ExampleResponseDto helloThere() {
        return ExampleMapper.INSTANCE.toResponse(
                ModelExample.builder()
                        .exampleString("Hello there!")
                        .build()
        );
    }
}
