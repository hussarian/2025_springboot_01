package com.ict.edu01.members.service;

import org.springframework.stereotype.Service;
import com.ict.edu01.members.vo.MembersVO;
import com.ict.edu01.members.mapper.MembersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class MembersServiceImpl implements MembersService {
    @Autowired
    private MembersMapper membersMapper;

    @Override
    public MembersVO getLogin(MembersVO mvo) {
        return membersMapper.getLogin(mvo);
    }

    @Override
    public void insertMember(MembersVO mvo) {
        membersMapper.insertMember(mvo);
    }

    @Override
    public List<MembersVO> getMemberList() {
        return membersMapper.getMemberList();
    }
}
