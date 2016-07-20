package org.kleber.webapp.model;

public abstract class Model extends Object {
  public abstract Object getId();

  public boolean equals(Model object) {
    return getId().equals(object.getId());
  }

  public abstract String toString();
}
