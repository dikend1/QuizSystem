package org.example.quizsystem.model;

import java.util.List;

public class Question {
    private int id;
    private String questionText;
    private int quizId;
    private List<Answer> answers;

    public Question(int id,String questionText, int quizId,List<Answer> answers) {
        this.id = id;
        this.questionText = questionText;
        this.quizId = quizId;
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
    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }


    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
