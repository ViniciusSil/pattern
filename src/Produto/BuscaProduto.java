/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;

/**
 *
 * @author VINICIUS
 */
public abstract class BuscaProduto {
    private BuscaProduto proximo;
    
    public BuscaProduto(BuscaProduto proximo){
        this.proximo = proximo;
    }
    
    public abstract Boolean buscarProdutos();   
    public void buscaCompleta(){
    boolean achei = buscarProdutos();
        if (!achei){
            proximo.buscaCompleta();
        }
    }
}
