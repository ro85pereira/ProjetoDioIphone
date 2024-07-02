/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto;

/**
 *
 * @author note
 */
public class Projeto {

    public static void main(String[] args) {
        System.out.println("Este é o sistema projeto Iphone");
        Iphone celular = new Iphone();
        celular.realizarPesquisa();
        celular.selecionarContato();
        celular.realizarLigacao(" Call to Salazar + Hands of fire");
        System.out.println("Estas foram algumas operações com Interfaces para projeto de POO");
       
    }
}
