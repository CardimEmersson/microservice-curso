package com.ms.course.dtos;

import com.ms.course.models.RequisitoModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class MateriaDto {

    @NotBlank
    private String nomeMateria;
    @NotBlank
    private String cargaHoraria;
    @NotBlank
    private String descricaoMateria;
    @NotEmpty
    private List<RequisitoDto> listaRequisitos;
    @NotBlank
    private String creditos;
    @NotBlank
    private String ementa;
}
