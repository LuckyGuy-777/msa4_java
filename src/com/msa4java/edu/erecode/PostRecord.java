package com.msa4java.edu.erecode;

// 레코드는 불변 객체이다
// 내가 가지고있는 객체를 변경시킬 수 없다.
// DTO 의 역할을 하기도 한다.
public record PostRecord(
        String title
        ,String content
) {}
