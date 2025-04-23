package org.example.quizsystem.service;
import org.example.quizsystem.model.Answer;
import org.example.quizsystem.repository.AnswerRepository;

import java.util.List;

public class AnswerService {
    private final AnswerRepository answerRepository;
    
    public AnswerService(AnswerRepository answerRepository){
        this.answerRepository = answerRepository;
    }


    // получить ответы на вопросы
    public List<Answer> getAnswersForQuestion(int questionId){
        return answerRepository.getAnswersForQuestion(questionId);
    }

    // сох новый ответ
    public void createAnswer(Answer answer){
        answerRepository.saveAnswer(answer);
    }

    // удалить ответ
    public void deleteAnswer(int id){
        answerRepository.deleteAnswer(id);
    }
    
}
