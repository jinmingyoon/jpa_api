package com.example.jmg_project.rest.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProjectEntity is a Querydsl query type for ProjectEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProjectEntity extends EntityPathBase<ProjectEntity> {

    private static final long serialVersionUID = -126154870L;

    public static final QProjectEntity projectEntity = new QProjectEntity("projectEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath projectDescription = createString("projectDescription");

    public final DateTimePath<java.time.LocalDateTime> projectEndDate = createDateTime("projectEndDate", java.time.LocalDateTime.class);

    public final StringPath projectId = createString("projectId");

    public final DateTimePath<java.time.LocalDateTime> projectStartDate = createDateTime("projectStartDate", java.time.LocalDateTime.class);

    public final StringPath projectTitle = createString("projectTitle");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> systemDate = _super.systemDate;

    //inherited
    public final StringPath systemId = _super.systemId;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final StringPath updateId = _super.updateId;

    public final StringPath useYn = createString("useYn");

    public QProjectEntity(String variable) {
        super(ProjectEntity.class, forVariable(variable));
    }

    public QProjectEntity(Path<? extends ProjectEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProjectEntity(PathMetadata metadata) {
        super(ProjectEntity.class, metadata);
    }

}

