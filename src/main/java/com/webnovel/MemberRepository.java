package com.webnovel;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    //entityManager를 주입해주는 annotation
    @PersistenceContext
    private EntityManager entityManager;

    public Long save(Member member){
        entityManager.persist(member);
        return member.getId();
    }

    public Member find(Long id){
        return entityManager.find(Member.class, id);
    }

}
