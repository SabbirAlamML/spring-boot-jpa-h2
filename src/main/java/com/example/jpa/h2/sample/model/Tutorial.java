package com.example.jpa.h2.sample.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorial")
public class Tutorial {
  @Column(name = "description")
  private String description;

  @Column(name = "published")
  private boolean published;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "title")
  private String title;

  public Tutorial() {
    super();
  }

  public Tutorial(String title, String description, boolean published) {
    this.title = title;
    this.description = description;
    this.published = published;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean published) {
    this.published = published;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Tutorial{"
        + "description='"
        + description
        + '\''
        + ", published='"
        + published
        + '\''
        + ", id="
        + id
        + ", title='"
        + title
        + '\''
        + '}';
  }
}
