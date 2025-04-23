package org.example.quizsystem.repository;
import org.example.quizsystem.database.DatabaseConnection;
import org.example.quizsystem.model.Question;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Букыл запростарды кабылдап алу
public class QuestionRepository {
    public List<Question> getQuestionsForQuiz(int quizId){
        List<Question> questions = new ArrayList<>();
        String query = "SELECT * FROM questions WHERE quiz_id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){
                stmt.setInt(1, quizId);
                try(ResultSet rs = stmt.executeQuery()){
                    while(rs.next()){
                        Question question = new Question(
                            rs.getInt("id"),
                            rs.getString("question_text"),
                            rs.getInt("quiz_id"),
                            null
                        );
                        questions.add(question);
                    }
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            return questions;
        } 
        
    // Базага вопросты сактау
    public void saveQuestion(Question question){
        String query = "INSERT INTO questions (quiz_id, question_text) VALUES(?, ?)";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){

                stmt.setInt(1,question.getQuizId());
                stmt.setString(2,question.getQuestionText());
                stmt.executeUpdate();
            }catch(SQLException e){
                e.printStackTrace();
            }
    }

    // Удалить вопрос 
    public void deleteQuestion(int id){
        String query = "DELETE FROM questions WHERE id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){

                stmt.setInt(1, id);
                stmt.executeUpdate();

            }catch (SQLException e){
                e.printStackTrace();
            }
    }
}



