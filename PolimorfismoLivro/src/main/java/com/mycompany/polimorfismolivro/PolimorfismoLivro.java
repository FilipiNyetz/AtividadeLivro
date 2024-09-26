/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismolivro;

/**
 *
 * @author filipi.stein
 */
import java.util.ArrayList;
import java.util.List;

public class PolimorfismoLivro {

    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        
        livros.add(new Livro("Java: Como Programar", "Deitel", 200.00));
        livros.add(new Livro("Clean Code", "Robert C. Martin", 150.00));

        livros.add(new ebook("Effective Java", "Joshua Bloch", 180.00, 2.5));
        livros.add(new ebook("Introduction to Algorithms", "Thomas H. Cormen", 250.00, 5.0));

        for (Livro titulo : livros) {
            titulo.exibirInformacoes();  
            System.out.println(); 
        }
    }
}
