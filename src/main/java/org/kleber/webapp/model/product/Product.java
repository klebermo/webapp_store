package org.kleber.webapp.model.product;

import org.kleber.webapp.model.Model;
import org.kleber.webapp.model.category.Category;

public class Product extends Model {
   private Integer id;

   private String nome;

   private String descricao;

   private Category categoria;

   private Float preco;

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

   public String getDescricao() {
      return this.descricao;
   }

   public void setDescricao(String value) {
      this.descricao = value;
   }

   public Category getCategoria() {
      return this.categoria;
   }

   public void setCategoria(Category value) {
      this.categoria = value;
   }

   public Float getPreco() {
      return this.preco;
   }

   public void setPreco(Float value) {
      this.preco = value;
   }

   public String toString() {
     return nome;
   }
}
