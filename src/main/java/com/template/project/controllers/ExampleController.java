package com.template.project.controllers;

import com.template.project.dtos.ExampleResponseDto;
import com.template.project.services.ExampleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example-project")
@AllArgsConstructor
public class ExampleController {

    private ExampleService exampleService;

    @Operation(summary = "Obtiene un mensaje de saludo", description = "Este endpoint retorna un objeto simple de saludo.")
    @ApiResponse(responseCode = "200", description = "Operación exitosa")
    @GetMapping()
    public ResponseEntity<ExampleResponseDto> hello() {
        return ResponseEntity.ok(exampleService.helloThere());
    }
}
