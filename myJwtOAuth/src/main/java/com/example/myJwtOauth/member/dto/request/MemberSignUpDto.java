package com.example.myJwtOauth.member.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MemberSignUpDto {
    private String email;
    private String password;
    private String nickname;
    private int age;
    private String city;
}