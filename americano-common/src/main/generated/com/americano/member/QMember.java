package com.americano.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = -1089441854L;

    public static final QMember member = new QMember("member1");

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public final NumberPath<Long> memberSeq = createNumber("memberSeq", Long.class);

    public final StringPath password = createString("password");

    public final EnumPath<com.americano.member.type.Sex> sex = createEnum("sex", com.americano.member.type.Sex.class);

    public final EnumPath<com.americano.member.type.Status> status = createEnum("status", com.americano.member.type.Status.class);

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

