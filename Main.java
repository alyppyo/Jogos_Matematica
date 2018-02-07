/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica_aula1_1;

import java.util.Scanner;

/**
 *
 * @author Alyppyo Coutinho
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaração de variáveis
        double xc, yc;  // Coordenadas do centro do círculo
        double xp, yp;  // Coordenadas o ponto a ser verificado
        double raio;    // Raio do círculo
        double distancia; // Distância entre o ponto e o contro do círculo
        Scanner leitor = new Scanner(System.in);
        
        // Apresentação do programa
        System.out.println("-- Ponto & Círculo --");
        
        // Solicitar valores ao usuário
        System.out.println("- Entre com a coordenada x do centro do círculo: ");
        xc = leitor.nextDouble();
        
        System.out.println("- Entre com a coordenada y do centro do círculo: ");
        yc = leitor.nextDouble();
        
        System.out.println("- Entre com o raio do círculo: ");
        raio = leitor.nextDouble();
        
        System.out.println("- Entre com a coordenada x do ponto a ser verificado: ");
        xp = leitor.nextDouble();
        
        System.out.println("- Entre com a coordenada y do ponto a ser verificado: ");
        yp = leitor.nextDouble();
        
        // Calcular a distância entre o ponto e o centro do círculo
        //distancia = Math.sqrt( Math.pow(xc-xp, 2) + Math.pow(yc-yp, 2));
        distancia = Math.sqrt((xc-xp)*(xc-xp) + (yc-yp)*(yc-yp));
        
        // Verificar posição do ponto com relação ao círculo
        if(distancia > raio) System.out.println("> O ponto está fora do círculo!");
        else if(distancia < raio) System.out.println("> O ponto está dentro do círculo");
        else System.out.println("> O ponto está na borda do círculo!");
    }
}
