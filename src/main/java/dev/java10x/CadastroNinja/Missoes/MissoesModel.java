package dev.java10x.CadastroNinja.Missoes;

import dev.java10x.CadastroNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //OneToMany: Relacionamento entre tabelas: Nesse caso 1 -> N
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
