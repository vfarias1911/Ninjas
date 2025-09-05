package dev.java10x.CadastroDeNinjas.Ninjas;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// JPA = Java Persistence API
// Entity transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    // o @Id é a anotação responsável pela geração de IDs
    @Id
    // O GenationValue é responsável pela geração sequencial do ID acima.
    // As duas anotações devem estar logo acima da variável que será incrementada no DB, neste caso a "Long id;"
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // Um ninja tem uma única missão
    @ManyToOne
    private MissoesModel missoes;


}
