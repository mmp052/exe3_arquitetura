// package br.insper.loja.time;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.ArrayList;

// @RestController
// public class CampeonatoController {

//     @Autowired
//     private CampeonatoService timeService;

//     @GetMapping("/time")
//     public ArrayList<Campeonato> getTimes(@RequestParam(required = false) String nome) {
//         return timeService.listarTimes(nome);
//     }

//     @GetMapping("/time/{estado}")
//     public Campeonato getTime(@PathVariable String estado) {
//         return timeService.getTime(estado);
//     }

//     @GetMapping("/time/{id}")
//     public Campeonato getTime(@PathVariable int id) {
//         return timeService.getTime(id);
//     }

//     @PostMapping("/time")
//     public Campeonato salvarTime(@RequestBody Campeonato time) {
//         return timeService.cadastrarTime(time);
//     }

// }
