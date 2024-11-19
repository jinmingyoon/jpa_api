package com.example.jmg_project.rest.entity.key;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProjectEntityPK implements Serializable {
    @Column(name = "PROJECT_ID")
    @Id
    private String projectId;
}
