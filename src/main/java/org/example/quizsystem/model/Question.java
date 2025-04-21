package org.example.quizsystem.model;

import java.util.List;

public class Question {
    private int id;
    private String questionText;
    private List<Answer> answers;

    public Question(int id,String questionText,List<Answer> answers) {
        this.id = id;
        this.questionText = questionText;
        this.answers = answers;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
