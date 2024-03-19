package br.insper.loja.time;

public class Time {

    private String nome;
    private int id;
    private String estadio;
    private String estado;
    private int vitorias;

    public Time(int id,String nome, String estadio, String estado) {
        this.id = id;
        this.nome = nome;
        this.estadio = estadio;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
}
