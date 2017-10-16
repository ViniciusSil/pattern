/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promocao;

/**
 *
 * @author VINICIUS
 */
public class InfoPromo implements PromocaoNV{

    public void notificar() {
        System.out.println("Ha uma nova Promoçao Disponivel ");
    }

   
    public void notificar(Object novaPromocao) {
        System.out.println("A Nova promoçao e:"+novaPromocao);
    }
}
