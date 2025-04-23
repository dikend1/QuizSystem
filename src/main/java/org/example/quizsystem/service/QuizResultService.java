package org.example.quizsystem.service;

import org.example.quizsystem.model.QuizResult;
import org.example.quizsystem.repository.QuizResultRepository;
 
public class QuizResultService {
    private final QuizResultRepository quizResultRepository;

    public QuizResultService(QuizResultRepository quizResultRepository){
        this.quizResultRepository = quizResultRepository;
    }

    // сох результат ответа
    public void saveResult(int userId,int quizId,int score){
        QuizResult quizResult = new QuizResult(0, userId, quizId, score,null);
        quizResultRepository.saveResult(quizResult);
    }
}
