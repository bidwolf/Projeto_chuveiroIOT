
package Classes;

import java.sql.Time;


public class Pessoa {
    private String nome;
    private PerfilBanho perfil;
    private Time horarioBanho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PerfilBanho getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilBanho perfil) {
        this.perfil = perfil;
    }

    public Time getHorarioBanho() {
        return horarioBanho;
    }

    public void setHorarioBanho(Time horarioBanho) {
        this.horarioBanho = horarioBanho;
    }
    
}
