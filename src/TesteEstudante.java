/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erasmo
 */
public class TesteEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
            
            estudante.registroMatricula = 18046;
            estudante.nome = "Erasmo B. Silva";
            estudante.nota = 'B';
            estudante.frequencia = 100;
            estudante.matriculaTrancada =  false;
            
            System.out.println("\n\t\t\t --- Estudante ---\n");
            estudante.apresentarEstudante();
        }
      }
    
    

