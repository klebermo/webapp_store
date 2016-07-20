package org.kleber.webapp.model.category;

import org.kleber.webapp.model.Model;

public class Category extends Model {
   private Integer id;

   private String nome;

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

   public String toString() {
     return nome;
   }
}
