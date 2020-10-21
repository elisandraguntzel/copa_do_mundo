/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coelhocorrida;

/**
 *
 * @author elisa
 */
public class CoelhoCorrida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
       //criação das threads
      Thread c1 = new Thread(new Coelho("1"));
      Thread c2 = new Thread(new Coelho("2"));
      Thread c3 = new Thread(new Coelho("3"));
      Thread c4 = new Thread(new Coelho("4"));
      Thread c5 = new Thread(new Coelho("5"));
      Thread c6 = new Thread(new Coelho("6"));
      Thread c7 = new Thread(new Coelho("7"));
      Thread c8 = new Thread(new Coelho("8"));
      Thread c9 = new Thread(new Coelho("9"));
      Thread c10 = new Thread(new Coelho("10"));
      
      //inicia elas
      c1.start();
      c2.start();
      c3.start();
      c4.start();
      c5.start();
      c6.start();
      c7.start();
      c8.start();
      c9.start();
      c10.start();
      
      //faz elas se juntar pra dps executar o restante
      c1.join();
      c2.join();
      c3.join();
      c4.join();
      c5.join();
      c6.join();
      c7.join();
      c8.join();
      c9.join();
      c10.join();
      
        System.out.println("\n\nFim!");
    }
    
}
