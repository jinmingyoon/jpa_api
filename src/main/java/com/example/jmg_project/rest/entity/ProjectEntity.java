package com.example.jmg_project.rest.entity;


import com.example.jmg_project.rest.entity.key.ProjectEntityPK;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "project", schema = "", catalog = "")
@IdClass(ProjectEntityPK.class)
public class ProjectEntity  extends BaseEntity{
    @Id
    @Column(name = "PROJECT_ID")
    private String projectId;

    @Column(name = "PROJECT_TITLE")
    private String projectTitle;

    @Column(name = "PROJECT_DESCRIPTION")
    private String projectDescription;

    @Column(name = "PROJECT_START_DATE")
    private LocalDateTime projectStartDate;

    @Column(name = "PROJECT_END_DATE")
    private LocalDateTime projectEndDate;

    @Basic
    @Column(name = "USE_YN")
    private String useYn;

}
