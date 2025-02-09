package entities;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Funcionario extends Pessoa {
    @Id
    private Integer id;
    private String ctps;
    private Date dataNasc;
    // private String endereco -puxar do Pessoa

    public Funcionario(String nome, String cpf, String email, String tel, Integer id, String ctps, Date dataNasc,
            LocalDate dataCadastro) {
        super(nome, cpf, email, tel, dataCadastro);
        this.id = id;
        this.ctps = ctps;
        this.dataNasc = dataNasc;
    }
}
