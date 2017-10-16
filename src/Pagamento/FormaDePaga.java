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
public class FormaDePaga {
    private MeioPagar pagamento;
    
    /**
     *
     */
    public void FormaPaga(){
        pagamento.FormaPagar();
    
    }
    
    public void setPagamento(MeioPagar novoPagamento){
        pagamento = novoPagamento;
        
    }
}


