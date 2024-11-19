package com.example.jmg_project.rest.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Setter
@Getter
public class BaseEntity {
    @CreatedDate
    @Column(name = "CRT_DATE", updatable = false)
    private LocalDateTime systemDate;
    @Basic
    @Column(name = "CRT_ID")
    private String systemId;
    @LastModifiedDate
    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;
    @Basic
    @Column(name = "UPDATE_ID")
    private String updateId;

}
