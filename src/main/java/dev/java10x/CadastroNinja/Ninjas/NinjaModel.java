package dev.java10x.CadastroNinja.Ninjas;

import dev.java10x.CadastroNinja.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

/*
* Entity transforma uma classe em uma entidade no Banco de Dados
* Table cria uma tabela no meu BD dessa classe
* */
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // ManyToOne: Relacionamento entre tabelas: Nesse caso N -> 1
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Chave Estrangeira
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
