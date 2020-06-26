/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


/**
 *
 * @author Henrique 
 */
public  abstract class PerfilBanho {

    private float temperatura;
    private float tempoBanho;
    private double vazaoAgua;
    private String estacao;

    /**
     *
     * @param temperatura
     * @param tempoBanho
     * @param vazaoAgua
     * @param estacao
     */
    public PerfilBanho( float temperatura, float tempoBanho, double vazaoAgua,String estacao) {
        this.temperatura = temperatura;
        this.tempoBanho = tempoBanho;
        this.vazaoAgua = vazaoAgua;
        this.estacao=estacao;
    }

   


    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getTempoBanho() {
        return tempoBanho;
    }

    public void setTempoBanho(float tempoBanho) {
        this.tempoBanho = tempoBanho;
    }

    public double getVazaoAgua() {
        return vazaoAgua;
    }

    public void setVazaoAgua(double vazaoAgua) {
        this.vazaoAgua = vazaoAgua;
    }
//COMO OS ATRIBUTOS SÃO PRIVADOS, So PODEMOS ACESSa-LOS PELO Metodo GET
}
