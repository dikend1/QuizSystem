package org.example.quizsystem;

// import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Scene;
// import javafx.stage.Stage;

// import java.io.IOException;
import java.util.List;

import org.example.quizsystem.repository.QuizRepository;
import org.example.quizsystem.model.Quiz;
import org.example.quizsystem.service.QuizService;

// public class Main extends Application {
//     @Override
//     public void start(Stage stage) throws IOException {
//         FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
//         Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//         stage.setTitle("Hello!");
//         stage.setScene(scene);
//         stage.show();
//     }
public class Main{
    public static void main(String[] args) {

        // Cоздал репо мен сервисты конекшн
        QuizRepository repo = new QuizRepository();
        QuizService quizService = new QuizService(repo);

        // Пример создать новый текст
        Quiz newQuiz = new Quiz(0,"Java" ,"A basic quiz about Java", null);
        quizService.createQuiz(newQuiz);


        // Получение все тесты
        List<Quiz> quizzes = quizService.getallQuizzes();
        quizzes.forEach(quiz-> System.out.println(quiz.getTitle()));


        // Получить ID
        Quiz quizById = quizService.getQuizById(1);
        System.out.println(quizById.getTitle());


        // delete text

        quizService.deleteQuiz(1);
    
    }
}