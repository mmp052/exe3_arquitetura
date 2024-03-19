package br.insper.loja.time;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TimeService {

    private ArrayList<Time> times = new ArrayList<>();
    private int id = 0;

    public Time cadastrarTime(Time time) {

        if (time.getNome().equals("")
                || time.getEstado().equals("")
                || time.getEstadio().equals("")) {
            throw  new RuntimeException("Dados invalidos");
        } else {
            this.id++;
            time.setId(this.id);
            times.add(time);
            return time;
        }

    }

    public ArrayList<Time> listarTimes(String nome) {
        if (nome != null) {
            ArrayList<Time> lista = new ArrayList<>();
            for (Time time : times) {
                if (time.getNome().startsWith(nome)) {
                    lista.add(time);
                }
            }
            return lista;
        }
        return times;
    }

    public void excluirTimes(String nome) {
        Time timeRemover = null;
        for (Time time : times) {
            if (nome.equalsIgnoreCase(time.getNome())) {
                timeRemover = time;
            }
        }
        if (timeRemover != null) {
            times.remove(timeRemover);
        } else {
            return;
        }
    }

    public Time getTime(String estado) {
        for (Time time : times) {
            if (time.getEstado().equals(estado)) {
                return time;
            }
        }
        return null;
    }

    public Time getId(int id) {
        for (Time time : times) {
            if (time.getId() == id) {
                return time;
            }
        }
        return null;
    }

}