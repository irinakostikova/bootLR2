package irina.boot.service;
import lombok.Data;

@Data
public class Question {
    private String answer;
    private String var;
    private String question;

    public Question(String question, String var, String answer) {
        this.var = var;
        this.question = question;
        this.answer = answer;
    }
}