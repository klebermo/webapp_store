package org.kleber.webapp.model.order;

import org.kleber.webapp.model.Model;
import java.util.List;
import org.kleber.webapp.model.product.Product;

public class Order extends Model {
  private Integer id;

  private List<Product> produtos;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public List<Product> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<Product> produtos) {
    this.produtos = produtos;
  }

  public String toString() {
    return produtos.toString();
  }
}
