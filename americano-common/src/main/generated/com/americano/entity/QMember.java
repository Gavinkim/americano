package com.americano.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.americano.member.Member;
import com.americano.member.type.Sex;
import com.americano.member.type.Status;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -677068199L;

    public static final QMember member = new QMember("member1");

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final NumberPath<Long> memberSeq = createNumber("memberSeq", Long.class);

    public final StringPath password = createString("password");

    public final EnumPath<Sex> sex = createEnum("sex", Sex.class);

    public final EnumPath<Status> status = createEnum("status", Status.class);

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

