package org.kleber.webapp.model.credential;

import org.kleber.webapp.model.Model;
import java.util.List;
import org.kleber.webapp.model.authority.Authority;

public class Credential extends Model {
      private Integer id;

      private String nome;

      private List<Authority> permissoes;

      public Integer getId() {
        return this.id;
      }

      public void setId(Integer value) {
        this.id = value;
      }

      public String getNome() {
        return this.nome;
      }

      public void setNome(String value) {
        this.nome = value;
      }

      public List<Authority> getPermissoes() {
        return this.permissoes;
      }

      public void setPermissoes(List<Authority> value) {
        this.permissoes = value;
      }

      public String toString() {
        return nome;
      }
}
