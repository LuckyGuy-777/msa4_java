package com.msa4java.edu.error;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {


        // TryWithResource 는,
        // try 의,소괄호 에는, 리소스를 여는 네트워크 통신을 할때,
        // 문서파일을 가져올때 사용함
        try (FileWriter file = new FileWriter("text.txt")) {

            // text.txt 파일이 없으면, file.write 부분에서, 파일이 생성되고,
            // 코드의 효과로, 파일의 내용이 입력됨
            // 만들어진 파일의 경로는, 파일의 루트경로임.
            file.write("안녕");
        } catch (IOException e) {
            e.printStackTrace();
        }//행위.
        // 보통 데이터베이스 파일을 가져올때,

        // 선언을, try/catch 밖에서 선언하면, finally 에서도 접근가능
//        FileWriter file = null;

//
//        try {
//            // 파일을 열기 위한 객체.
//            file = new FileWriter("test.txt");
//            file.write("안녕");
//        } catch (Exception e) {
//            // 콘솔에 에러메세지 출력
//            e.printStackTrace();
//        } finally {
//            try{
//                file.close();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }




    }
}



