package com.univesrsity.base.spring.value;

import com.univesrsity.base.spring.entity.Role;

public enum UserRole {
  ADMINISTRATOR,
  UNDEFINED,
  USER,
  TEACHER,
  DIRECTOR;

  public static UserRole valueOf(Role role) {
    switch (role.getName()) {
      case "ADMINISTRATOR":
        return ADMINISTRATOR;
      case "USER":
        return USER;
      case "TEACHER":
        return TEACHER;
      case "DIRECTOR":
        return DIRECTOR;
      default:
        return UNDEFINED;
    }
  }
}
