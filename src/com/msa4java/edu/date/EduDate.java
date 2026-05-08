package com.msa4java.edu.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class EduDate {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now(); // 현재시간 출력
        LocalDateTime targetDate = LocalDateTime.of(2026,5,1,23,7);
        LocalDateTime parsed = LocalDateTime.parse("2026-05-01T21:10:20");

        LocalDateTime addOneDayByNow = now.plusDays(1);
        System.out.println(addOneDayByNow);
        System.out.println(now);


        // 상대적인 날짜 이동 (TemporalAdjusters)
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        LocalDateTime nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));


        // 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(24,9,12);


        // d1이 d2보다 과거냐
        System.out.println(d1.isBefore(d2));

        // d1 이 d2 랑 똑같니?
        System.out.println(d1.isEqual(d2));



        // period 객체
        // 날짜 비교하는 메소드
        Period p1 = Period.between(d1,d2);
        System.out.println(Math.abs(p1.getYears())  );
        System.out.println(Math.abs(p1.getMonths()));
        System.out.println(Math.abs(p1.getDays()));

        //단위별 차이
        long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(Math.abs(untilDays));


        // Date format (DateTimeFormatter)
        // 날짜 객체 -> 문자열로 포맷



        // 문자열 -> 날짜 객체
        // DB 에서 자바로 넘어오는 데이터는, String 형식 이라고함.
        // 그것을, 내가 원하는 타입으로 변경하기 위한것.
        String createdAt = "2025-06-20 14:33:20";
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 문자열 날짜데이터와, 데이터포멧 형식을 인자로.
        LocalDateTime ldt = LocalDateTime.parse(createdAt, format2);
        System.out.println(ldt);

        // LocalDateTime -> LocalDate 추출함.
        LocalDate ldtToLd = ldt.toLocalDate();
        System.out.println(ldtToLd);

    }
}
