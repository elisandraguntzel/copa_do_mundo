/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coelhocorrida;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elisa
 */
public class Coelho implements Runnable{
    Random tempoSleep = new Random(); // variavel pra fazer o numero aleatorio do tempo que o coelho dorme
    private String nome; // variavel pro nome
    
    public Coelho(String nome) { //metodo construtor
        this.nome = nome; // variavel que recebe o nome que vem quando cria o coelho na outra classe
    }
    
    /**
     *
     * @throws InterruptedException
     */
    @Override
    public void run(){ // metodo que executa as threads
        for (int i = 0; i < 100; i++) { // 100 metros
            int x = tempoSleep.nextInt((50) + 10);  // numero random sendo gerado no intervalo de 10 a 50
            
            try {
                Thread.sleep(x);  // coloca a thread pra dormir no tempo aleatorio que pegar na variavel x ali em cima
            } catch (InterruptedException ex) {
                Logger.getLogger(Coelho.class.getName()).log(Level.SEVERE, null, ex);
            }
        } // tem que ser dentro de try catch
        
        System.out.println("Cheguei Coelho " + nome); // aqui mostra o nome conforme o coelho chega
    }

    
    
}
