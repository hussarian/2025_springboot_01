package com.ict.edu01.members.vo;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataVO {
    // 클라이언트에게 결과를 보낼때 사용하는 vo
    private boolean success;
    private String message;
    private Object data;
    
}
