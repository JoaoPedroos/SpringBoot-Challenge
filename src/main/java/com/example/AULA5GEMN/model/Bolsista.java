package com.example.AULA5GEMN.model;

public class Bolsista extends Aluno{

    private double desconto;

    public Bolsista(String nome, double valor) {
        super(nome);
        this.desconto = valor;
    }


}
