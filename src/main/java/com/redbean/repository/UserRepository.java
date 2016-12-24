package com.redbean.repository;

import com.redbean.domain.User;

import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

/**
 * Created by GL on 2016/11/19.
 */
public interface UserRepository extends GraphRepository<User> {

  public List<User> findByNameLike(String name);
  public User findByName(String name);



}
