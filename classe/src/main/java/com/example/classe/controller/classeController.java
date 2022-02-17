package com.example.classe.controller;

import com.example.classe.service.ClasseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Swagger2DemoRestController Classe", description = "REST Apis related to Student Entity!!!!")
@RestController
public class classeController {

    @Autowired
    ClasseService classeService;

    @Operation(description = "get les etudiants par classe", tags = "Swagger2DemoRestController",
        responses = @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = String.class))))
    @GetMapping(value = "/classe/{schoolname}")
    public String getLesClasses(@PathVariable String schoolname) {
        return classeService.getStudentFromHTTP(schoolname);
    }
}
