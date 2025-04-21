package org.example.quizsystem.model;
import java.sql.Timestamp;

public class UserAnswer {
    private int id;
    private int userId;
    private int quizId;
    private int questionId;
    private int answerId;
    private Timestamp timestamp;

    public UserAnswer(int id ,int userId, int quizId, int questionId, int answerId, Timestamp timestamp) {
        this.id = id;
        this.userId = userId;
        this.quizId = quizId;
        this.questionId = questionId;
        this.answerId = answerId;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    public int getQuizId(){
        return quizId;
    }
    public void setQuizId(int quizId){
        this.quizId = quizId;
    }
    public int getQuestionId(){
        return questionId;
    }
    public void setQuestionId(int questionId){
        this.questionId = questionId;
    }
    public int getAnswerId(){
        return answerId;
    }
    public void setAnswerId(int answerId){
        this.answerId = answerId;
    }
    public Timestamp getTimestamp(){
        return timestamp;
    }
    public void setTimestamp(Timestamp timestamp){
        this.timestamp = timestamp;
    }
}
