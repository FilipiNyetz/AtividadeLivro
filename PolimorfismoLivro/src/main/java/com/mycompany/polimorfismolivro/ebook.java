/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismolivro;

/**
 *
 * @author filipi.stein
 */
public class ebook extends Livro {
    public double tamanhoArquivo;
    public ebook(String livro, String Autor, double valor, double tamanhoArquivo) {
        super(livro, Autor, valor);
        this.tamanhoArquivo = tamanhoArquivo;
    }
    @Override 
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.print("O tamanho do arquivo e:"+tamanhoArquivo);
    }
}
