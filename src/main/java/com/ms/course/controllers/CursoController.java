package com.ms.course.controllers;

import com.ms.course.dtos.CursoDto;
import com.ms.course.models.CursoModel;
import com.ms.course.services.CursoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

//é um controller que vai utilizar de API's REST
@RestController
public class CursoController {

    @Autowired
    CursoService cursoService;

    /*
        Método abaixo... Funções:
        - Receber o DTO de entrada
        - fazer a validação
        - passar do dto para o model
        - para salvar-mos o dto
    */

    /*
        sempre que um usuário/serviço enviar uma requisição via POST para enviando-curso
        o método enviandoCurso será disparado.
    */
    @PostMapping("/enviando-curso")
    //recebendo como parâmentros o CursoDto
    //para que as validações do DTO tenham efeito, é necessário usar o @Valid
    public ResponseEntity<CursoModel> enviandoCurso(@RequestBody @Valid CursoDto cursoDto) {
        //criar uma instancia de curso model
        CursoModel cursoModel = new CursoModel();
        //converter cursodto para cursomodel com copyPorperties
        BeanUtils.copyProperties(cursoDto, cursoModel);
        //passar para o método que fará o save dos dados
        cursoService.enviarCurso(cursoModel);
        //retornar o model salvo e o status http
        return new ResponseEntity<>(cursoModel, HttpStatus.CREATED);
    }
}
