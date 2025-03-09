package dev.java10x.CadastroNinja.Ninjas;

import dev.java10x.CadastroNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
* Entity transforma uma classe em uma entidade no Banco de Dados
* Table cria uma tabela no meu BD dessa classe
* */
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    // ManyToOne: Relacionamento entre tabelas: Nesse caso N -> 1
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Chave Estrangeira
    private MissoesModel missoes;

}
