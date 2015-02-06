package br.com.bilac.Pooiii;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Work on 06/02/2015.
 */
public class Cliente {

    String nome, email, endereco;
    List<Itens>listaFilmes = new ArrayList<Itens>();

    public Cliente(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    

}
