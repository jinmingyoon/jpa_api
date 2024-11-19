package com.example.jmg_project.rest.repository.querydsl.impl;

import com.example.jmg_project.rest.entity.PersonEntity;
import com.example.jmg_project.rest.model.PersonResult;
import com.example.jmg_project.rest.repository.PersonRepository;
import com.example.jmg_project.rest.repository.querydsl.PersonCustom;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLTemplates;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;


import static com.example.jmg_project.rest.entity.QPersonEntity.personEntity;

@Slf4j
@Transactional
@Repository
public class PersonRepositoryImpl implements PersonCustom {

    private final JPAQueryFactory queryFactory;

    public PersonRepositoryImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(JPQLTemplates.DEFAULT, em);
    }

    @Override
    public PersonResult personDetailList(Integer personId) {
        return queryFactory
            .select(Projections.fields(PersonResult.class,
                personEntity.personId,
                personEntity.personNm,
                personEntity.useYn
            ))
            .from(personEntity)
            .where(personEntity.personId.eq(personId))
            .fetchOne();
    }

}
