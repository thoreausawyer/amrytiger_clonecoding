package com.army.armytiger.member;

import com.army.armytiger.command.MemberVO;
import com.army.armytiger.member.service.MemberService;
import com.army.armytiger.util.Criteria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class MemberServiceTest {

    @Autowired
    @Qualifier("memberService")
    MemberService memberService;

    @Test
    void registTest(){

        MemberVO vo = MemberVO.builder()
                .military_sn("1111111111")
                .password("123213123")
                .name("홍길동")
                .grade("user")
                .unit("부대")
                .affiliation("세부소속")
                .m_rank("병장")
                .m_kind("육군")
                .m_other("비고")
                .build();

        System.out.println(vo.toString());
        try {
            memberService.memberRegist(vo);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void getListTest(Criteria cri) {

        ArrayList<MemberVO> list = memberService.getList(cri);
        System.out.println(list);
//        int total = memberService.getTotal(cri);
//        System.out.println(total);
    }
}
