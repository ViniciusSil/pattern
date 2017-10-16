/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutenticaUsuario;
/**
 *
 * @author VINICIUS
 */
public class RequiscaoUser extends User{
   protected String usuario;
   protected String senha;
   
    
    public  RequiscaoUser(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    
   @Override
    public String getUsuario() {
        if (temPermissaoDeAcesso()) {
            return usuario;
        }
        return null;
    }
 
 
   @Override
    public String getSenha() {
        if (temPermissaoDeAcesso()) {
            return senha;
        }
        return null;
    }
 
    private boolean temPermissaoDeAcesso() {
        return usuario == "admin" && senha == "1234";
    }

}
