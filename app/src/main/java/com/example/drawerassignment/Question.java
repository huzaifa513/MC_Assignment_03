package com.example.drawerassignment;

public class Question {
    private String question;
    private String firstOption;
    private String secondOption;
    private String thirdOption;
    private String fourthOption;
    private String correctOption;

    public Question() {}

    public Question(String question, String firstOption, String secondOption, String thirdOption, String fourthOption, String correctOption) {
        this.question = question;
        this.firstOption = firstOption;
        this.secondOption = secondOption;
        this.thirdOption = thirdOption;
        this.fourthOption = fourthOption;
        this.correctOption = correctOption;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setFirstOption(String firstOption) {
        this.firstOption = firstOption;
    }

    public void setSecondOption(String secondOption2) {
        this.secondOption = secondOption2;
    }

    public void setThirdOption(String thirdOption3) {
        this.thirdOption = thirdOption3;
    }

    public void setFourthOption(String fourthOption4) {
        this.fourthOption = fourthOption4;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    public String getQuestion() {
        return this.question;
    }

    public String getFirstOption() {
        return this.firstOption;
    }

    public String getSecondOption() {
        return this.secondOption;
    }

    public String getThirdOption() {
        return this.thirdOption;
    }

    public String getFourthOption() {
        return this.fourthOption;
    }

    public String getCorrectOption() {
        return this.correctOption;
    }

}
