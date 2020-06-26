/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalTime;

/**
 *
 * @author manha
 */
public class BanhoPredefinido extends PerfilBanho {
    private String nomePerfil;


    /**
     *
     * @param nomePerfil
     * @param temperatura
     * @param tempoBanho
     * @param vazaoAgua
     * @param estacao
     */
    public BanhoPredefinido(String nomePerfil,float temperatura,float tempoBanho,double vazaoAgua, String estacao) {
        super(temperatura,tempoBanho,vazaoAgua, estacao);        
        this.nomePerfil=nomePerfil;

    }
   

}
