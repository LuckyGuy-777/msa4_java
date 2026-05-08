package com.msa4java.edu.error;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            System.out.println("트라이 시작");

            // 자바에서는 0으로 나눌 수 없음.
            double result = 10 / 0;

            System.out.println("트라이 끝");
        } catch(ArithmeticException e){
            // 케치문을 여러개로 이을 수 있음.
            // 에러 발생 시, catch 문을 순서대로 검사함.
            System.out.println("ArithmeticException 에러");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("캐치 들어옴");

            // e.getMessage() 는, 에러메세지를 표시하는 메서드
            System.out.println(e.getMessage());
        } finally {
            System.out.println("파이널리");
        }
    }
}
