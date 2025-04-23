package org.example.quizsystem.service;

import java.util.List;

import org.example.quizsystem.model.Question;
import org.example.quizsystem.repository.QuestionRepository;

public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }


    // Получить все вопросы для теста короче
    public List<Question> getQuestionsForQuiz(int quizId){
        return questionRepository.getQuestionsForQuiz(quizId);
    }


    // сох новый вопрос
    public void createQuestion(Question question){
        questionRepository.saveQuestion(question);
    }

    // удалить вопрос
    public void deleteQuestion(int id){
        questionRepository.deleteQuestion(id);
    }
}
