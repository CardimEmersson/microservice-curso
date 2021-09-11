package com.ms.course.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Data
public class MateriaDto {

    @NotBlank
    private String nomeMateria;
    @NotBlank
    private String cargaHoraria;
    @NotBlank
    private String descricaoMateria;
    @NotBlank
    private String requisitos;
    @NotBlank
    private String creditos;
    @NotBlank
    private String ementa;
}
