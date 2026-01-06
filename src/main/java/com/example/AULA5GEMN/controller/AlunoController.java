package com.example.AULA5GEMN.controller;

import com.example.AULA5GEMN.model.Aluno;
import com.example.AULA5GEMN.model.Bolsista;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlunoController {

    @GetMapping("/status")
    public String verificarStatus(){
        return ("API de Gestão de Alunos rodando com sucesso!");
    }

    @GetMapping("/teste-aluno")
    public Aluno listarAlunos(){
        Aluno a = new Aluno("João");
        a.setNota1(10);
        a.setNota2(10);

        return a;
    }

    @GetMapping("/listar-alunos")
    public List<Aluno> listarTodos(){

        List<Aluno> lista = new ArrayList<>();

        Aluno aluno1 = new Aluno("Maria");
        Bolsista bolsista1 = new Bolsista("Felix", 100.00);

        lista.add(aluno1);
        lista.add(bolsista1);

        return lista;
    }
}
