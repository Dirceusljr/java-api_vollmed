package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco dados) {

        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
        this.complemento = dados.complemento();
        this.numero = dados.numero();
    }

    public void atualizarEndereco(DadosEndereco dados) {
        if (this.logradouro != null) {
            this.logradouro = dados.logradouro();
        }
        if (this.bairro != null) {
            this.bairro = dados.bairro();
        }
        if (this.cep != null) {
            this.cep = dados.cep();
        }
        if (this.cidade != null) {
            this.cidade = dados.cidade();
        }
        if (this.uf != null) {
            this.uf = dados.uf();
        }
        if (this.complemento != null) {
            this.complemento = dados.complemento();
        }
        if (this.numero != null) {
            this.numero = dados.numero();
        }
    }
}
