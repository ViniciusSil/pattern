/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pagamento;

/**
 *
 * @author VINICIUS
 */
public class Cheque implements MeioPagar{
    @Override
    public void FormaPagar(){
        System.out.println("Forma de Pagamento Cheque");
    }
}
