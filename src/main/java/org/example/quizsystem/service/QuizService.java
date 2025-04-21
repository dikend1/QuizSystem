package org.example.quizsystem.service;

import  org.example.quizsystem.model.Quiz;
import org.example.quizsystem.repository.QuizRepository;

import java.util.List;

public class QuizService {
    private final QuizRepository quizRepository;

    
    public QuizService(QuizRepository quizRepository){
        this.quizRepository = quizRepository;
    }
    
    // получить все тесты 
    public List<Quiz> getallQuizzes(){
        return quizRepository.getAllquizzes();
    }
    // Получить тест по id 
    public Quiz getQuizById(int id){
        return quizRepository.getQuizById(id);
    }

    public void createQuiz(Quiz quiz){
        quizRepository.saveQuiz(quiz);
    }

    // Удалить тест
    public void deleteQuiz(int id){
        quizRepository.deleteQuiz(id);
    }



}
