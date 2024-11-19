package com.example.jmg_project.rest.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPersonEntity is a Querydsl query type for PersonEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPersonEntity extends EntityPathBase<PersonEntity> {

    private static final long serialVersionUID = 1071077034L;

    public static final QPersonEntity personEntity = new QPersonEntity("personEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final NumberPath<Integer> personId = createNumber("personId", Integer.class);

    public final StringPath personNm = createString("personNm");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> systemDate = _super.systemDate;

    //inherited
    public final StringPath systemId = _super.systemId;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateDate = _super.updateDate;

    //inherited
    public final StringPath updateId = _super.updateId;

    public final StringPath useYn = createString("useYn");

    public QPersonEntity(String variable) {
        super(PersonEntity.class, forVariable(variable));
    }

    public QPersonEntity(Path<? extends PersonEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPersonEntity(PathMetadata metadata) {
        super(PersonEntity.class, metadata);
    }

}

