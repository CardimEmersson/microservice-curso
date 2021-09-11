package com.ms.course.models;

import com.ms.course.enums.StatusCurso;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

//com o lombok não preciso utilizar os métodos get/set
@Data
//definindo essa classe como uma entidade
@Entity
//passando o nome da tabela que vai ser gerado no banco com base na entidade
@Table(name = "TB_COURSE")
public class CursoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    //anotando essa variavel como id
    @Id
    //ele é gerado automaticamente
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoCurso;
    private String nomeCurso;
    private String qtdPeriodo;
    private String cargaHoraria;
    //o texto pode passar de 255 caracteres
    @Column(columnDefinition = "TEXT")
    private String descricaoCurso;
    private LocalDateTime dataEnvioCurso;
    private StatusCurso statusCurso;
}
