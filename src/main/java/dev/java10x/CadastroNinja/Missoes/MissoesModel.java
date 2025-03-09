package dev.java10x.CadastroNinja.Missoes;

import dev.java10x.CadastroNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //OneToMany: Relacionamento entre tabelas: Nesse caso 1 -> N
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }
}
