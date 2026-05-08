package com.msa4java.edu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String str = "21tprleornsqndls";

        // # 띄어쓰기도 주의해서 해야한다. 조건식으로 공백이 들어갈수 있기에
        String pattern1 = "[a-zA-Z]+"; // 영어 대소문자 한글자 이상 허용
        String pattern2 = "[0-9]+"; // 숫자 한글자 이상 허용
        String pattern3 = "[a-z0-9]{6,20}"; // a-z까지,0부터9까지, 최소 6글자, 최대 20글자

        System.out.println(str.matches(pattern1));
        System.out.println(str.matches(pattern2));
        System.out.println(str.matches(pattern3));

        // Pattern 객체 이용
        // 미리 조건식을 만들어두고, 그 조건식을 가져다 쓰는 방식.
        // 그래서 속도가 조금 더 빠름
        Pattern pattern4 = Pattern.compile("[a-zA-Z]+");

        Matcher matcher4 = pattern4.matcher(str);

        System.out.println(matcher4.matches());
    }
}
