package org.example.quizsystem;
import org.example.quizsystem.model.Answer;
import org.example.quizsystem.model.Question;
import org.example.quizsystem.model.Quiz;
import org.example.quizsystem.repository.AnswerRepository;
import org.example.quizsystem.repository.QuestionRepository;
import org.example.quizsystem.repository.QuizRepository;
import org.example.quizsystem.service.QuizService;
import org.example.quizsystem.service.AnswerService;
import org.example.quizsystem.service.QuestionService;

import java.util.ArrayList;
import java.util.List;


public class test {
    public static void main(String[] args){
        QuizService quizService = new QuizService(new QuizRepository());
        QuestionService questionService = new QuestionService(new QuestionRepository());
        AnswerService answerService = new AnswerService(new AnswerRepository());


        Quiz newQuiz = new Quiz(0, "Java Basics", "Test your Java knowledge", null);
        quizService.createQuiz(newQuiz);



        Question newQuestion = new Question(0, "What is Java?", 24,new ArrayList<>());
        questionService.createQuestion(newQuestion); 


        Answer answer1 = new Answer(0, 24, "Java is a programming language", true); // question_id = 12
        Answer answer2 = new Answer(0, 24, "Java is a coffee brand", false); // question_id = 12
        answerService.createAnswer(answer1); 
        answerService.createAnswer(answer2);

        List<Question> questions = questionService.getQuestionsForQuiz(newQuiz.getId());
        questions.forEach(q -> System.out.println("Question: " + q.getQuestionText()));

        List<Answer> answers = answerService.getAnswersForQuestion(newQuestion.getId());
        answers.forEach(a-> System.out.println("Answer: " + a.getAnswerText()));
    }
    
}
