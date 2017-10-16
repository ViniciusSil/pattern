/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto;
import java.util.Random;
/**
 *
 * @author VINICIUS
 */
public class BuscaFilial extends BuscaProduto{
    public BuscaFilial (BuscaProduto proximo){
        super(proximo);
    }
    
    @Override
    public Boolean buscarProdutos(){
        System.out.println("Nao achei");
        return true;
    }
    
    
}
