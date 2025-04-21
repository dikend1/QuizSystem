package org.example.quizsystem.model;
import java.sql.Timestamp;

public class QuizResult {
    private int id;
    private int userId;
    private int quizId;
    private int score;
    private Timestamp completionTime;

    public QuizResult(int id, int userId, int quizId, int score, Timestamp completionTime) {
        this.id = id;
        this.userId = userId;
        this.quizId = quizId;
        this.score = score;
        this.completionTime = completionTime;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
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

    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
    public Timestamp getCompletionTime(){
        return completionTime;
    }
    public void setCompletionTime(Timestamp completionTime){
        this.completionTime = completionTime;
    }
}
