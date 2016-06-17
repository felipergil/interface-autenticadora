/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOTFELIPE
 */
public class GerenteAutenticador implements IAutenticador {

    @Override
    public boolean autenticar(String login, String senha) {
        if(login.equals("geren") && senha.equals("geren@123")) {
            return true;
        } else {
            return false;
        }
    }
    
}
