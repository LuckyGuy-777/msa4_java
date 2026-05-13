package com.msa4java.edu.erecode;

public class RecordMain {
    public static void main(String[] args) {
        PostDTO postDTO = new PostDTO("제목1","내용1");
        PostRecord postRecord = new PostRecord("제목2", "내용2");


        // DTO 에서 값 가져오는방식은..
        // postDTO.getTitle();

        // 레코드로 만들면, getxx 가 아닌, 레코드 명으로 만든다
        // postRecord.title();

        // 게터 호출
        System.out.println(postDTO.getTitle());
        System.out.println(postRecord.title());

        System.out.println(postDTO.toString());

        // 레코드는, toString을 실행하면 내용을, 손쉽게 확인할 수 있음.
        System.out.println(postRecord.toString());
    }
}
