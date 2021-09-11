package com.ms.course.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

//class que receberá as informações do método POST
@Data
public class CursoDto {
    //quando recebermos o objeto a biblioteca fará a validação
    //caso receba vazio, ele já envia uma bad request pro usuário
    @NotBlank
    private String nomeCurso;
    @NotBlank
    private String qtdPeriodo;
    @NotBlank
    private String cargaHoraria;
    @NotBlank
    private String descricaoCurso;
}
