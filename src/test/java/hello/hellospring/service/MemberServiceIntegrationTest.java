package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional
class MemberServiceIntegrationTest {

//    @Autowired
//    MemberService memberService;
//    @Autowired
//    MemberRepository memberRepository;
//
//    @Test
//    public void register() {
//        Member member = new Member();
//        member.setName("spring");
//
//        Long saveId = memberService.join(member);
//
//        Member findMember = memberService.findOne(saveId).get();
//        assertThat(member.getName()).isEqualTo(findMember.getName());
//
//    }
//
//    @Test
//    public void conflictMemberExcept() {
//        Member member1 = new Member();
//        member1.setName("spring");
//        Member member2 = new Member();
//        member2.setName("spring");
//
//        memberService.join(member1);
//        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2)); //asserThrows : 예외 처리 메서드, ()->가 실행되고 예외가 발생해야 한다.
//        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//
//    }

}
