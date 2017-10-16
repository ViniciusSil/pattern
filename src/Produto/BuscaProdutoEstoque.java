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
public class BuscaProdutoEstoque extends BuscaProduto{
    public BuscaProdutoEstoque(BuscaProduto proximo){
        super(proximo);
    }
    
    public Boolean buscarProdutos(){
        System.out.println("Nao achei");
        return false;
    }

    
}
