package org.kleber.webapp.model.page;

import org.kleber.webapp.model.Model;

public class Page extends Model {
   private Integer id;

   private String titulo;

   private String conteudo;

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer value) {
      this.id = value;
   }

   public String getTitulo() {
      return this.titulo;
   }

   public void setTitulo(String value) {
      this.titulo = value;
   }

   public String getConteudo() {
      return this.conteudo;
   }

   public void setConteudo(String value) {
      this.conteudo = value;
   }

   public String toString() {
     return titulo;
   }
}
