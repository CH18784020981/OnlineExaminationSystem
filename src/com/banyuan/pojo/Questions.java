package com.banyuan.pojo;

/**
 * @author 陈浩
 * @date Created on 2019/11/17
 */
public class Questions {
    private Integer qusNum;
    private String question;
    private String chooseA;
    private String chooseB;
    private String chooseC;
    private String chooseD;
    private String answer;

    public Questions() {
    }

    public Questions(String question, String chooseA, String chooseB, String chooseC, String chooseD, String answer) {
        this.question = question;
        this.chooseA = chooseA;
        this.chooseB = chooseB;
        this.chooseC = chooseC;
        this.chooseD = chooseD;
        this.answer = answer;
    }

    public Integer getQusNum() {
        return qusNum;
    }

    public void setQusNum(Integer qusNum) {
        this.qusNum = qusNum;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getChooseA() {
        return chooseA;
    }

    public void setChooseA(String chooseA) {
        this.chooseA = chooseA;
    }

    public String getChooseB() {
        return chooseB;
    }

    public void setChooseB(String chooseB) {
        this.chooseB = chooseB;
    }

    public String getChooseC() {
        return chooseC;
    }

    public void setChooseC(String chooseC) {
        this.chooseC = chooseC;
    }

    public String getChooseD() {
        return chooseD;
    }

    public void setChooseD(String chooseD) {
        this.chooseD = chooseD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "qusNum=" + qusNum +
                ", question='" + question + '\'' +
                ", chooseA='" + chooseA + '\'' +
                ", chooseB='" + chooseB + '\'' +
                ", chooseC='" + chooseC + '\'' +
                ", chooseD='" + chooseD + '\'' +
                '}';
    }
}
