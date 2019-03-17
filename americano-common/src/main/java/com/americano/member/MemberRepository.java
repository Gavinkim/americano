package com.americano.member;

import com.americano.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * Created by gavinkim at 2019-03-17
 */
public interface MemberRepository extends JpaRepository<Member,Long>,
        QuerydslPredicateExecutor<Member>{

}
