package org.example.quizsystem.repository;
import org.example.quizsystem.database.DatabaseConnection;
import org.example.quizsystem.model.Answer;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;


public class AnswerRepository {
    // Получить ответы для вопроса короче
    public List<Answer> getAnswersForQuestion(int questionId){
        List<Answer> answers = new ArrayList<>();
            String query = "SELECT * FROM answers WHERE question_id = ?";
            try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query)){

                    stmt.setInt(1, questionId);
                    try(ResultSet rs = stmt.executeQuery()){
                        while (rs.next()) {
                            Answer answer = new Answer(
                                rs.getInt("id"),
                                rs.getString("answer_text"),
                                rs.getBoolean("is_correct")
                                );
                                answers.add(answer);
                        }
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
                return answers;
    }
}

    // Сохр ответы в базе данных
public void saveAnswer(Answer answer){
     String query = "INSERT INTO answers (question_id, answer_text, is_correct) VALUES (?,?,?)";
     try(Connection conn = DatabaseConnection.getConnection();
     
            PreparedStatement stmt = conn.prepareStatement(query)){

                stmt.setInt(1, answer.getId());
                stmt.setString(2,answer.getAnswerText());
                stmt.setBoolean(3,answer.isCorrect());
                stmt.executeUpdate();

            }catch(SQLException e){
                e.printStackTrace();
            }
    }

public void deleteAnswer(int id){
    String query = "DELETE FROM answers WHERE id = ?";
    try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(query)){
            stmt.setInt(1, id);
            stmt.executeUpdate();       
        }catch(SQLException e){ 
            e.printStackTrace();
        }
    }
