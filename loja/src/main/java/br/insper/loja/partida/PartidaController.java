package br.insper.loja.partida;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    @GetMapping("/partida")
    public ArrayList<Partida> getPartidas() {
        return partidaService.listarPartidas();
    }

    @GetMapping("/partida/{id_mandante}")
    public Partida getTimeMandante(@PathVariable int id_mandante) {
        return partidaService.getTimeMandante(id_mandante);
    }

    @GetMapping("/partida/{nome_campeonato}")
    public Partida getTimeMandante(@PathVariable String nome_campeonato) {
        return partidaService.getTimeMandante(nome_campeonato);
    }

    @GetMapping("/vitorias/{id_time}")
    public Vitorias getTime(@PathVariable int id_time) {
        return new Vitorias(partidaService.getVitorias(id_time));
    }

    @PostMapping("/partida")
    public void salvarPartida(@RequestBody Partida partida) {
        partidaService.cadastrarPartida(partida);
    }

}
