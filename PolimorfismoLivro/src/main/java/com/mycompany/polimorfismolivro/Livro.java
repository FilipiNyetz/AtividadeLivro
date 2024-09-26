/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismolivro;

/**
 *
 * @author filipi.stein
 */
public class Livro {
    public String livro;
    public String Autor;
    public double valor;

    public Livro(String titulo, String Autor, double valor) {
        this.livro = titulo;
        this.Autor = Autor;
        this.valor = valor;
    }

    
    public String getLivro() {
        return livro;
    }

    public String getAutor() {
        return Autor;
    }

    public double getValor() {
        return valor;
    }
    
    public void exibirInformacoes(){
        System.out.print(getLivro()+ getAutor() + getValor());
    }
        
    
}
