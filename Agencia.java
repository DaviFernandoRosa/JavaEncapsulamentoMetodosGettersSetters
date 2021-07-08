/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agencia;

/**
 *
 * @author Davi
 */
public class Agencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          Carro gol = new Carro();
         
          gol.setMarca("Volksvagem");
          gol.setMarca("Fiat");
          gol.setNumPassageiros(5);

          //System.out.println(gol.getNumPassageiros());
          //System.out.println(gol.getMarca);
          System.out.println("O numero de passageiros é: "+ gol.getNumPassageiros());


    }

}
