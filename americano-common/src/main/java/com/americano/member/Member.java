package com.americano.member;

import com.americano.member.type.Sex;
import com.americano.member.type.Status;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by gavinkim at 2019-03-17
 */
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = "password")
public class Member implements Serializable {

    private static final long serialVersionUID = -3777937205433558441L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_SEQ")
    private Long memberSeq;

    @Column(name = "FIRST_NAME",length = 100,nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME",length = 100)
    private String lastName;

    @Column(name = "EMAIL",nullable = false,unique = true)
    private String email;

    @Column(name = "PASSWORD",nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEX")
    private Sex sex;

    @Column(name = "STATUS")
    private Status status;

    @Builder
    public Member(String firstName, String lastName, String email, String password,Sex sex,Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.status = status;
    }
}
