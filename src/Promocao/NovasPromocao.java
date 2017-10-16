/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promocao;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author VINICIUS
 */
public class NovasPromocao {
    private List<PromocaoNV> listaPromocao = new ArrayList<>();
    private String promo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        notifcarTodos(nome);
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
        notifcarTodos(promo);
    }
    /*opcional*/

    private void notifcarTodos(Object novaPromocao) {
        for (PromocaoNV promocaoNV  : listaPromocao) {
            promocaoNV .notificar();
            promocaoNV .notificar(novaPromocao);
        }
    }

    public void inscrever(PromocaoNV promocaoNV) {
        listaPromocao.add(promocaoNV);
    }
}
