package org.kleber.webapp.model.user;

import org.kleber.webapp.model.Dao;

public class UserDao extends Dao<User> {
  public UserDao() {
    super(User.class);
  }
}
