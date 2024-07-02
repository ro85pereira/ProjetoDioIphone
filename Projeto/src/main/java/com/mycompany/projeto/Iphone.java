/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;
import Navegador.Navegador;
import ReprodutorMusical.ReprodutorMusical;
import Telefone.Telefone;

/**
 *
 * @author note
 */
public class Iphone implements Navegador, ReprodutorMusical, Telefone{
    
   @Override
   public void tocarMusica(){
        System.out.println("Tocar música");
    }

    @Override
    public    void pausarMusica(){
        System.out.println("Pausar música");
    }
   @Override
    public void pararMusica(){
        System.out.println("Parar música");
    }
    
    
   @Override
    public void abrirPagina(){
        System.out.println("Abrir página");
    }
   @Override
    public void realizarPesquisa(){
        System.out.println("Realizar pesquisa");}

    @Override
    public void realizarLigacao(String contato) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Realizando ligação" + contato);
    }

    @Override
    public void selecionarContato() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Selecionando o contato");
    }
   
}
