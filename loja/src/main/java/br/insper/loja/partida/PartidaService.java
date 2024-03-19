package br.insper.loja.partida;

import org.springframework.stereotype.Service;

import br.insper.loja.campeonato.Campeonato;
import br.insper.loja.campeonato.CampeonatoService;
import br.insper.loja.time.Time;
import br.insper.loja.time.TimeService;

import java.util.ArrayList;

@Service
public class PartidaService {

    private ArrayList<Partida> partidas = new ArrayList<>();
    private TimeService timeService = new TimeService();
    private CampeonatoService campeonatoService = new CampeonatoService();

    public Partida cadastrarPartida(Partida partida) {

        Campeonato campeonato = campeonatoService.getId(partida.getCampeonato().getId());

        Time timeMandante = timeService.getId(partida.getTimeMandante().getId());
        Time timeVisitante = timeService.getId(partida.getTimeVisitante().getId());

        partida.setTimeMandante(timeMandante);
        partida.setTimeVisitante(timeVisitante);

        if (partida.getPlacarMandante() > partida.getPlacarVisitante()){
            int vitorias = partida.getTimeMandante().getVitorias();
            vitorias++;
            partida.getTimeMandante().setVitorias(vitorias);
        }else if (partida.getPlacarMandante() < partida.getPlacarVisitante()){
            int vitorias = partida.getTimeVisitante().getVitorias();
            vitorias++;
            partida.getTimeVisitante().setVitorias(vitorias);
        }

        partidas.add(partida);
        return partida;

    }

    public ArrayList<Partida> listarPartidas() {
        return partidas;
    }

    public Partida getTimeMandante(int id) {
        for (Partida partida : partidas) {
            if (partida.getTimeMandante().equals(timeService.getId(id))) {
                return partida;
            }
        }
        return null;
    }

    public ArrayList<Partida> listarPartidasCampeonato(int id) {
        ArrayList<Partida> lista = new ArrayList<>();

        for (Partida partida : partidas) {
            if (partida.getCampeonato().getId() == id) {
                lista.add(partida);
            }
        }
        return lista;
    }

    public int getVitorias(int id){
        Time time = timeService.getId(id);
        return time.getVitorias();
    }

}