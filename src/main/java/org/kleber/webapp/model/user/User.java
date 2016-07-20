package org.kleber.webapp.model.user;

import org.kleber.webapp.model.Model;
import java.util.List;
import org.kleber.webapp.model.credential.Credential;

public class User extends Model {
    private Integer id;

    private String login;

    private String senha;

    private String nome;

    private String sobrenome;

    private String email;

    private List<Credential> credenciais;

    public Integer getId() {
      return this.id;
    }

    public void setId(Integer value) {
      this.id = value;
    }

    public String getLogin() {
      return this.login;
    }

    public void setLogin(String value) {
      this.login = value;
    }

    public String getSenha() {
      return this.senha;
    }

    public void setSenha(String value) {
      this.senha = value;
    }

    public String getNome() {
      return this.nome;
    }

    public void setNome(String value) {
      this.nome = value;
    }

    public String getSobrenome() {
      return this.sobrenome;
    }

    public void setSobrenome(String value) {
      this.sobrenome = value;
    }

    public String getEmail() {
      return this.email;
    }

    public void setEmail(String value) {
      this.email = value;
    }

    public List<Credential> getCredenciais() {
      return this.credenciais;
    }

    public void setCredenciais(List<Credential> value) {
      this.credenciais = value;
    }

    public String toString() {
      return nome + " " + sobrenome;
    }
}
