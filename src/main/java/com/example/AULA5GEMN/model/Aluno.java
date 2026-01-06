package com.example.AULA5GEMN.model;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;

    /* construtor */
    public Aluno(String nome){
        this.nome = nome;
    }

    public String setNota1(double nota){
        if(nota >=0 && nota <=10){
            this.nota1 = nota;
            return "Nota salva";
        }
        else{
            return "Nota inválida ou excedente.";
        }
    }

    public String setNota2(double nota){
        if(nota >=0 && nota <=10){
            this.nota2 = nota;
            return "Nota salva";
        }
        else{
            return "Nota inválida ou excedente.";
        }
    }

    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public String getNome(){
        return nome;
    }
}
