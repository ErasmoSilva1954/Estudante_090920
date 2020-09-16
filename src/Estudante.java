/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erasmo
 */
public class Estudante {
    
    int registroMatricula;
    String nome;
    char nota; // B= bom; R = Regular; I = Insuficiente;
    double frequencia;
    boolean matriculaTrancada;
    
    public void apresentarEstudante(){
        System.out.println("RM:"+registroMatricula);
        System.out.println("nome:"+nome);
        System.out.println("nota:"+nota);
        System.out.println("frequencia:"+frequencia);
        System.out.println(matriculaTrancada?"Matricula Trancada":"Matricula Ativa");
    }
    
}
