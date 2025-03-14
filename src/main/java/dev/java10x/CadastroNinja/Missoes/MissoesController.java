package dev.java10x.CadastroNinja.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/listar")
    public String mostrarMissoes() {
        return "Missoes listada com sucesso";
    }

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão Criada";
    }

    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão Alterada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missão Deletada";
    }

}
