package org.kleber.webapp.model.wishlist;

import org.kleber.webapp.model.Model;
import java.util.List;
import org.kleber.webapp.model.product.Product;

public class WishList extends Model {
  private Integer id;

  private String nome;

  private List<Product> produtos;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String value) {
    this.nome = value;
  }

  public List<Product> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<Product> produtos) {
    this.produtos = produtos;
  }

  public String toString() {
    return nome;
  }
}
