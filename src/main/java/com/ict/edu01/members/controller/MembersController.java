package com.ict.edu01.members.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ict.edu01.members.vo.DataVO;
import com.ict.edu01.members.vo.MembersVO;
import com.ict.edu01.members.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/members")
public class MembersController {
    @Autowired
    private MembersService membersService;

    @GetMapping("/hello")
    public String getHello() {
        return "Hello, Spring Boot!"; // view가 아닌 html단으로 정보 들고 바로 이동
    }


    @PostMapping("/login")
    public DataVO getLogin(@RequestBody MembersVO mvo) {
        // DB에 가서 m_id,와 m_pw가 맞는 지 확인
        DataVO dataVO = new DataVO();

        try {
            MembersVO membersVO = membersService.getLogin(mvo);
            if (membersVO == null) {
                dataVO.setSuccess(false);
                dataVO.setMessage("로그인 실패");
            }else{
                dataVO.setSuccess(true);
                dataVO.setMessage("로그인 성공");
                dataVO.setData(membersVO);
            }
            
        } catch (Exception e) {
            dataVO.setSuccess(false);
            e.printStackTrace();
            dataVO.setMessage("서버 오류:" + e.getMessage());
        }

        // 맞으면
        //dataVO.setSuccess(true);
        //dataVO.setMessage("로그인 성공");
        // 만약 정보 전달할 data가 하나면
        //dataVO.setData("정보");
        // 만약 정보 전달할 data가 여러개면
        //Map<String, Object> result = new HashMap<>();
        // result.put("list", list);
        //result.put("memberVO", mvo);
        // result.put("totalCount", totalCount);
        //dataVO.setData(result);

        // 맞지 않으면
        //dataVO.setSuccess(false);
        //dataVO.setMessage("로그인 실패");
        //dataVO.setData(null);

        return dataVO;
    }

    @PostMapping("/join")
    public DataVO insertMember(@RequestBody MembersVO mvo) {
        DataVO dataVO = new DataVO();
        try {
            if(mvo != null){
                membersService.insertMember(mvo);
                dataVO.setSuccess(true);
                dataVO.setMessage("회원가입 성공");
                dataVO.setData(mvo);
            }else{
                dataVO.setSuccess(false);
                dataVO.setMessage("회원가입 실패");
                dataVO.setData(null);
            }
        } catch (Exception e) {
            dataVO.setSuccess(false);
            e.printStackTrace();
            dataVO.setMessage("서버 오류:" + e.getMessage());
            dataVO.setData(null);
        }
        return dataVO;
    }

    @GetMapping("/list")
    public DataVO getMemberList() {
        DataVO dataVO = new DataVO();
        try {
            List<MembersVO> list = membersService.getMemberList();
            dataVO.setSuccess(true);
            dataVO.setMessage("회원 목록 조회 성공");
            dataVO.setData(list);
        } catch (Exception e) {
            dataVO.setSuccess(false);
            e.printStackTrace();
            dataVO.setMessage("서버 오류:" + e.getMessage());
            dataVO.setData(null);
        }
        return dataVO;
    }
}
