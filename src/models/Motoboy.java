package models;

import java.util.List;

public class Motoboy {

    private String nome;
    private String moto;

    public Motoboy(String nome, String moto) {
        this.nome = nome;
        this.moto = moto;
    }

    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

        public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }


}
