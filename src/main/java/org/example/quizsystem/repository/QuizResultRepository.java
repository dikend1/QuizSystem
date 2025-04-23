package org.example.quizsystem.repository;
import org.example.quizsystem.model.QuizResult;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.example.quizsystem.database.DatabaseConnection;

// результат сактау
public class QuizResultRepository {
    public void saveResult(QuizResult quizResult){
        String query = "INSERT INTO quiz_results(user_id, quiz_id, score, completion_time) VALUES (?,?,?,?)";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){

                stmt.setInt(1, quizResult.getUserId());
                stmt.setInt(2, quizResult.getQuizId());
                stmt.setInt(3, quizResult.getScore());
                stmt.setTimestamp(4,quizResult.getCompletionTime());
                stmt.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
    }
}
