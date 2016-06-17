/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOTFELIPE
 */
public class FuncionarioAutenticador implements IAutenticador {

    @Override
    public boolean autenticar(String login, String senha) {
         if(login.equals("func") && senha.equals("func@123")) {
             return true;
         } else {
             return false;
         }
    }
    
    
    
}
