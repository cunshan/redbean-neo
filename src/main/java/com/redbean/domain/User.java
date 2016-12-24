package com.redbean.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.domain.Persistable;

import java.io.Serializable;

/**
 * Created by GL on 2016/11/19.
 */
@NodeEntity
public class User implements Serializable {

  private static final long serialVersionUID = 333747351974143867L;

  private Long id;
  private String name;
  private String pwd;
  private Integer age;

  public User() {
  }

  public User( String name, String pwd, Integer age) {
    this.name = name;
    this.pwd = pwd;
    this.age = age;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
