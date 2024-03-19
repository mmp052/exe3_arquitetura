package br.insper.loja.campeonato;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CampeonatoService {

    private ArrayList<Campeonato> campeonatos = new ArrayList<>();
    private int id = 0;

    public void cadastrarCampeonato(Campeonato campeonato) {

        campeonato.setId(id);
        campeonatos.add(campeonato);
        this.id++;

    }

    public Campeonato getId(int id) {
        for (Campeonato campeonato : campeonatos) {
            if (campeonato.getId() == id) {
                return campeonato;
            }
        }
        return null;
    }

}