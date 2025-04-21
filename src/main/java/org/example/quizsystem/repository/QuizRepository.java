package org.example.quizsystem.repository;
import org.example.quizsystem.model.Quiz;
import org.example.quizsystem.database.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuizRepository {
    public List<Quiz> getAllquizzes(){
        List<Quiz> quizzes = new ArrayList<>();
        String query = "SELECT * FROM quizzes";
        try(Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)){

            while (rs.next()){
                Quiz quiz = new Quiz(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("description"),
                        null
                );
                quizzes.add(quiz);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return quizzes;
    }

    public Quiz getQuizById(int id){
        String query = "SELECT * FROM quizzes WHERE id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1,id);
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    return new Quiz(
                            rs.getInt("id"),
                            rs.getString("title"),
                            rs.getString("description"),
                            null
                    );
                }
            }
            }catch (SQLException e){
                e.printStackTrace();
        }
        return null;
    }

    public void saveQuiz(Quiz quiz){
        String query = "INSERT INTO quizzes (title, description) VALUES (?, ?)";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1,quiz.getTitle());
            stmt.setString(2,quiz.getDescription());
            stmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteQuiz(int id){
        String query = "DELETE FROM quizzes WHERE id = ?";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {

                stmt.setInt(1,id);
                stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
