package dev.java10x.CadastroDeNinjas.Missoes;


import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_missoes") 

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomedaMissao;
    private String dificuldade;
    private NinjaModel ninja;

    @OneToMany(mappedBy = "missoes")
    @JoinColumn(name = "missoes_id") // Foreign Key ou Chave estrangeira
    private List<NinjaModel> ninjas;

    public MissoesModel(Long id, String nomedaMissao, String dificuldade, NinjaModel ninja) {
        this.id = id;
        this.nomedaMissao = nomedaMissao;
        this.dificuldade = dificuldade;
        this.ninja = ninja;
    }
}
