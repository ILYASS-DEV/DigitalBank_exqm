package com.aidi.ILYASS.dao;

import org.springframework.data.repository.CrudRepository;

import com.aidi.ILYASS.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
