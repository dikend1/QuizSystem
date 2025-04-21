package org.example.quizsystem.model;

public class Answer {
    private int id;
    private String answerText;
    private boolean isCorrect;


    public Answer(int id, String answerText, boolean isCorrect) {
        this.id = id;
        this.answerText = answerText;
        this.isCorrect = isCorrect;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getAnswerText() {
        return answerText;
    }
    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
    public boolean isCorrect() {
        return isCorrect;
    }
    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}
