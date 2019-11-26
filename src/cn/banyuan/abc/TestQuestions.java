package cn.banyuan.abc;

/**
 * @author 陈浩
 * @date Created on 2019/11/8
 */
public class TestQuestions implements Comparable {
    private int num;
    private String question;
    private String answer;

    public TestQuestions() {
    }

    public TestQuestions(int num, String question, String answer) {
        this.num = num;
        this.question = question;
        this.answer = answer;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return num + "." + question + '\'';
    }

    @Override
    public int compareTo(Object o) {
        TestQuestions t = (TestQuestions) o;
        return this.num - t.num;
    }
}
