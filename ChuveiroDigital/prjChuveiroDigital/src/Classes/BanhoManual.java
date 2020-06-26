/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

public class BanhoManual extends PerfilBanho {

    private float temperaturaMinima;
    private float temperaturaMaxima;
    private float tempoMinimo;
    private float tempoMaximo;
    
    public BanhoManual( float temperatura, float tempoBanho, double vazaoAgua, String estacao) {
        super( 36, 5, vazaoAgua, estacao);
        if (temperatura <= temperaturaMaxima && temperatura >= temperaturaMinima) 
        {
            this.setTemperatura(temperatura);
        }
        if(tempoBanho<=tempoMaximo&&tempoBanho>=tempoMinimo)
        {
            this.setTempoBanho(tempoBanho);
        }
    }
   
    public float getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(float temperaturaMinima) {
        
        this.temperaturaMinima = temperaturaMinima;
    }

    public float getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(float temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public float getTempoMinimo() {
        return tempoMinimo;
    }

    public void setTempoMinimo(float tempoMinimo) {
        this.tempoMinimo = tempoMinimo;
    }

    public float getTempoMaximo() {
        return tempoMaximo;
    }

    public void setTempoMaximo(float tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }
}
