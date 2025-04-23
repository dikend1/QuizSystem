package org.example.quizsystem.repository;
import org.example.quizsystem.model.UserAnswer;

import java.sql.*;

import org.example.quizsystem.database.DatabaseConnection;

// save Student
public class UserAnswerRepository {
    public void save(UserAnswer userAnswer) throws SQLException{
        String query = "INSERT INTO user_answers (user_id, quiz_id, question_id, answer_id, timestamp) VALUES (?,?,?,?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {


                stmt.setInt(1, userAnswer.getUserId());
                stmt.setInt(2, userAnswer.getQuizId());
                stmt.setInt(4, userAnswer.getQuestionId());
                stmt.setInt(3, userAnswer.getAnswerId());
                stmt.setTimestamp(5, userAnswer.getTimestamp());
                stmt.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
    } 
}
