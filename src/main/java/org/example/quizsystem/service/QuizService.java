package org.example.quizsystem.service;

import org.example.quizsystem.model.Answer;
import org.example.quizsystem.model.Quiz;
import org.example.quizsystem.model.UserAnswer;
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

    public int calculateScore(List<UserAnswer> userAnswers, List<Answer> correctAnswers){
        int score = 0;

        for(UserAnswer userAnswer : userAnswers){
            for(Answer correctAnswer : correctAnswers){
                if (userAnswer.getAnswerId() == correctAnswer.getId() && correctAnswer.isCorrect()){
                    score++;
                }
            }
        }return score;
    }
    



}
