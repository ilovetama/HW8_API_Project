package com.it_academy.onliner.rest_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SushiVeslaFacet {

  private String id;
  private String key;
  private String name;
  private String full_name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFull_name() {
    return full_name;
  }

  public void setFull_name(String full_name) {
    this.full_name = full_name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SushiVeslaFacet that = (SushiVeslaFacet) o;
    return Objects.equals(id, that.id)
        && Objects.equals(key, that.key)
        && Objects.equals(name, that.name)
        && Objects.equals(full_name, that.full_name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name, full_name);
  }

  @Override
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", key='" + key + '\'' +
        ", name='" + name + '\'' +
        ", full_name='" + full_name + '\'' +
        '}';
  }

}

