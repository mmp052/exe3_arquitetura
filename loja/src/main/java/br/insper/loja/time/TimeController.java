package br.insper.loja.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping("/time")
    public ArrayList<Time> getTimes(@RequestParam(required = false) String nome) {
        return timeService.listarTimes(nome);
    }

    @GetMapping("/time/{estado}")
    public Time getTime(@PathVariable String estado) {
        return timeService.getTime(estado);
    }

    @GetMapping("/time/{id}")
    public Time getId(@PathVariable int id) {
        return timeService.getId(id);
    }

    @PostMapping("/time")
    public Time salvarTime(@RequestBody Time time) {
        return timeService.cadastrarTime(time);
    }

}
