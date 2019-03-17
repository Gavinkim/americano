package com.americano.repository;

import com.americano.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gavinkim at 2019-03-17
 */
public interface MemberRepository extends JpaRepository<Member,Long> {
}
