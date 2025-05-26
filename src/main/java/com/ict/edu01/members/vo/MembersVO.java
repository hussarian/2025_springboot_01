package com.ict.edu01.members.vo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembersVO {

    
    // Lombok 라이브러리 사용
    // @Getter: getter생성
    // @Setter: setter생성
    // @NoArgsConstructor: 기본생성자 생성
    // @AllArgsConstructor: 모든 필드를 매개변수로 하는 생성자 생성
    // @Data: @Getter, @Setter, @NoArgsConstructor, @AllArgsConstructor, @ToString 모두 포함
    
    // @ToString: toString() 메서드 생성
    // @Builder: 빌더 패턴 생성
    // @EqualsAndHashCode: @EqualsAndHashCode 메서드 생성
    // @RequiredArgsConstructor: 필드에 final 키워드가 있는 필드를 매개변수로 하는 생성자 생성
    // @Slf4j: 로그 라이브러리 사용
    // @Log4j2: 로그 라이브러리 사용
    // @Log: 로그 라이브러리 사용
    
    private int m_idx;
    private String m_id, m_pw, m_name, m_addr, m_addr2, m_email, m_phone, 
    m_reg, m_active, m_active_reg, sns_email_naver, sns_email_kakao, sns_provider;
    
}
