package org.example.quizsystem.service;

import java.sql.SQLException;

import org.example.quizsystem.model.UserAnswer;
import org.example.quizsystem.repository.UserAnswerRepository;

public class UserAnswerService {

    private final UserAnswerRepository userAnswerRepository;


    public UserAnswerService(UserAnswerRepository userAnswerRepository){
        this.userAnswerRepository = userAnswerRepository;
    }

    // сох ответ студентов
    public void saveUserAnswer(UserAnswer userAnswer) {
        try {
            userAnswerRepository.save(userAnswer);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
