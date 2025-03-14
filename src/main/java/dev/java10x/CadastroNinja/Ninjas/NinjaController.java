package dev.java10x.CadastroNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Primeira mensagem nessa rota";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostras os Ninjas (READ)
    @GetMapping("/todos")
    public String mostrarNinjas() {
        return "Mostrar Ninja";
    }

    // Mostras Ninjas por ID (READ)
    @GetMapping("/todosID")
    public String mostrarNinjasPorID() {
        return "Mostrar Ninja por ID";
    }

    // Alterar dados do ninja(UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID() {
        return "Ninja alterado";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID() {
        return "Ninja deletado";
    }

}
