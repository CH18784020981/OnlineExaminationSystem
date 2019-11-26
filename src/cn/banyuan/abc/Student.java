package cn.banyuan.abc;

import java.util.Objects;

/**
 * @author 陈浩
 * @date Created on 2019/11/8
 */
public class Student implements Comparable {
    private int stuNum;
    private String stuName;
    private String stuPassword;
    private int stuScore;

    public Student() {
    }

    public Student(int stuNum, String stuName, String stuPassword) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuPassword = stuPassword;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuPassword='" + stuPassword + '\'' +
                ", stuScore=" + stuScore +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return getStuScore() == student.getStuScore() &&
                Objects.equals(getStuNum(), student.getStuNum()) &&
                Objects.equals(getStuName(), student.getStuName()) &&
                Objects.equals(getStuPassword(), student.getStuPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStuNum(), getStuName(), getStuPassword(), getStuScore());
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (this.stuScore - s.stuScore != 0) {
            return this.stuScore - s.stuScore;
        } else {
            return this.stuNum - s.stuNum;
        }

    }
}