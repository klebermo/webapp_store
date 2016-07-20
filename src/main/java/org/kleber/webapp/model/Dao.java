package org.kleber.webapp.model;

public abstract class Dao<E> {
  private Class<E> classe;

  public Dao(Class<E> classe) {
    this.classe = classe;
  }

  public Class<E> getClasse() {
    return classe;
  }

  public void setClasse(Class<E> classe) {
    this.classe = classe;
  }
}
