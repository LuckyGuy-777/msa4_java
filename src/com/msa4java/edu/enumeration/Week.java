package com.msa4java.edu.enumeration;

public enum Week {
//    private Week MONDAY = new Week("월요일"); <- 을 단축문법으로,
//     MONDAY("월요일") 처럼 작성하게끔 하는게 Enum
     MONDAY("월요일")
    ,TUESDAY("화요일")
    ,WEDNESDAY("수요일")
    ,THURSDAY("목요일")
    ,FRIDAY("금요일")
    ,SATURDAY("토요일")
    ,SUNDAY("일요일");

    private final String krDay;

    private Week(String day){
        // 요일이 입력될때 마다, 만들어짐.
        this.krDay = day;
    }

    // Getter
    public String getKrDay(){
        return this.krDay;
    }

    // Setter
}
