package br.insper.loja.partida;

import br.insper.loja.campeonato.Campeonato;
import br.insper.loja.time.Time;

public class Partida {

    private Time timeMandante;
    private Time timeVisitante;
    private int placarMandante;
    private int placarVisitante;
    private Campeonato campeonato;

    public Partida(Time timeMandante, Time timeVisitante, int placarMandante, int placarVisitante) {
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
    }

    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }
    
    public void setPlacarMandante(int placarMandante) {
        this.placarMandante = placarMandante;
    }
    
    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public void setCampeonato(Campeonato campeonato){
        this.campeonato = campeonato;
    }
    
    public Time getTimeMandante() {
        return this.timeMandante;
    }

    public Time getTimeVisitante() {
        return this.timeVisitante;
    }

    public int getPlacarMandante() {
        return this.placarMandante;
    }

    public int getPlacarVisitante() {
        return this.placarVisitante;
    }

    public Campeonato getCampeonato(){
        return this.campeonato;
    }
}
