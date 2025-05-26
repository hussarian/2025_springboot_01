package com.ict.edu01.members.service;

import com.ict.edu01.members.vo.MembersVO;
import java.util.List;

public interface MembersService {
    MembersVO getLogin(MembersVO mvo);
    void insertMember(MembersVO mvo);
    List<MembersVO> getMemberList();
}
