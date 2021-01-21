//package kr.ac.nnet.spring.study.shoppingmall.service;
//
//import kr.ac.nnet.spring.study.shoppingmall.domain.Member;
//import kr.ac.nnet.spring.study.shoppingmall.repository.MemberRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional(readOnly = true)
//@RequiredArgsConstructor
//public class MemberService {
//
//    private final MemberRepository memberRepository;
//
//    /**
//     * 회원가입
//     */
//    @Transactional
//    public Long join(Member member){
//        validateDuplicateMember(member);
//
//
//        memberRepository.save(member);
//        return member.getId();
//    }
//
//    private void validateDuplicateMember(Member member) {
//        List<Member> findMembers = memberRepository.findByName(member.getName());
//        if(!findMembers.isEmpty()){
//            throw new IllegalStateException("이미 존재하는 회원입니다.");
//        }
//    }
//}
