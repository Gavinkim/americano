package com.americano.member;

import com.americano.member.type.Status;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import org.springframework.util.StringUtils;

/**
 * Created by gavinkim at 2019-03-17
 */
public class MemberPredicate {

    public static Predicate search(String email, Status status) {
        QMember qMember = QMember.member;
        BooleanBuilder builder = new BooleanBuilder();
        if (!StringUtils.isEmpty(email)){
            builder.and(qMember.email.eq(email));
        }
        if (status != null){
            builder.and(qMember.status.eq(status));
        }

        return builder;
    }
}
