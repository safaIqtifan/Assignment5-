package com.example.assignment5.Model;

public class ContryModel {

    int questionCount;
    int img;
    String correct;
    String wrong1;
    String wrong2;
    String wrong3;

    public ContryModel(int questionCount, int img, String correct, String wrong1, String wrong2) {
        this.questionCount = questionCount;
        this.img = img;
        this.correct = correct;
        this.wrong1 = wrong1;
        this.wrong2 = wrong2;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(int questionCount) {
        this.questionCount = questionCount;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public String getWrong1() {
        return wrong1;
    }

    public void setWrong1(String wrong1) {
        this.wrong1 = wrong1;
    }

    public String getWrong2() {
        return wrong2;
    }

    public void setWrong2(String wrong2) {
        this.wrong2 = wrong2;
    }
}
