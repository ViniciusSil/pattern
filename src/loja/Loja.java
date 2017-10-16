/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import AutenticaUsuario.RequiscaoUser;
import AutenticaUsuario.User;

import Produto.BuscaFilial;
import Produto.BuscaProduto;
import Produto.BuscaProdutoEstoque;

import Promocao.InfoPromo;
import Promocao.NovasPromocao;
import Promocao.PromocaoNV;

import Pagamento.Cartao;
import Pagamento.Cheque;
import Pagamento.Dinheiro;
import Pagamento.MeioPagar;
import Pagamento.FormaDePaga;
        
/**
 *
 * @author VINICIUS
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Usuario nao cadastrado");
        User banco = new RequiscaoUser("Hacker", "1234");
        System.out.println(banco.getUsuario());
        System.out.println(banco.getSenha());

        System.out.println("\nAdministrador acessando");
        banco = new RequiscaoUser("admin", "1234");
        System.out.println(banco.getUsuario());
        System.out.println(banco.getSenha());
        
        FormaDePaga Forma = new FormaDePaga();
        MeioPagar dinheiro = new Dinheiro();
        Forma.setPagamento(dinheiro);
        Forma.FormaPaga();
        
        
        PromocaoNV Info = new InfoPromo();
        NovasPromocao novas = new NovasPromocao();
        novas.inscrever(Info);
        novas.setNome("PC");
        novas.setPromo("Apenas 15.00");
        
        
      
      
                
                
                
                
                    
    }
    
}
