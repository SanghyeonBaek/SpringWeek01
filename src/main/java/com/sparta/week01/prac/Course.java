package com.sparta.week01.prac;

public class Course {
    // title, tutor, days 가 Course 라는 맥락 아래에서 의도가 분명히 드러나죠!
    private String title;
    private String tutor;
    private int days;

    public String getTitle() {
        return title;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

//    //기본 생성자
//    public Course() {
//
//    }
//    //생성자
//    public Course(String title, String tutor, int days) {
//        this.title = title;
//        this.tutor = tutor;
//        this.days= days;
//    }
    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

}
