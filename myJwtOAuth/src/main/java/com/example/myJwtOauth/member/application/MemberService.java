package com.example.myJwtOauth.member.application;

import com.example.myJwtOauth.member.domain.Member;
import com.example.myJwtOauth.member.domain.MemberRepository;
import com.example.myJwtOauth.member.domain.Role;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import com.example.myJwtOauth.member.dto.request.MemberSignUpDto;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public void signUp(MemberSignUpDto memberSignUpDto) throws Exception {

        if (memberRepository.findByEmail(memberSignUpDto.getEmail()).isPresent()) {
            throw new Exception("이미 존재하는 이메일입니다.");
        }

        if (memberRepository.findByNickname(memberSignUpDto.getNickname()).isPresent()) {
            throw new Exception("이미 존재하는 닉네임입니다.");
        }

        Member member = Member.builder()
                .email(memberSignUpDto.getEmail())
                .password(memberSignUpDto.getPassword())
                .nickname(memberSignUpDto.getNickname())
                .age(memberSignUpDto.getAge())
                .city(memberSignUpDto.getCity())
                .role(Role.USER)
                .build();

        member.passwordEncode(passwordEncoder);
        memberRepository.save(member);
    }
}
