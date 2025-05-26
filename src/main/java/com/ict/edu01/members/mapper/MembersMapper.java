package com.ict.edu01.members.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.ict.edu01.members.vo.MembersVO;
import java.util.List;

@Mapper
public interface MembersMapper {
    public MembersVO getLogin(MembersVO mvo);
    public void insertMember(MembersVO mvo);
    public List<MembersVO> getMemberList();
}
