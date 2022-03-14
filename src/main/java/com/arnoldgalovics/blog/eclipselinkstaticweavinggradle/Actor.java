package com.arnoldgalovics.blog.eclipselinkstaticweavinggradle;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor {
    @Id
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    public Actor() {
    }

    public Actor(UUID id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
}
