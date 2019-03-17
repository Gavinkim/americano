package com.americano.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by gavinkim at 2019-03-17
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = "password")
public class Member {

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

    @Builder
    public Member(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
