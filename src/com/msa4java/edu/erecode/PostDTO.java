package com.msa4java.edu.erecode;

public class PostDTO {

    // DTO 는, 외부에서 전달받은 정보를, 다른객체에 전달하기 위해서 사용하는 객체
    private final String title;
    private final String content;

    public PostDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }


    // toString() 을, 재정의 한 사례.
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
