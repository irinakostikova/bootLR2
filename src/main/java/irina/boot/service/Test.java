package irina.boot.service;


import irina.boot.csv.ICSVReader;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

@Component
public class Test {

    private ICSVReader reader;
    private int count;


    public Test(ICSVReader reader){
        this.reader = reader;
    }

    public void startTest() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для ответа напишите номер правильного варианта!");
        List<Question> questions = reader.getQuestions();
        for (Question quest: questions) {
            //System.out.println(question.getQuestion());
            // System.out.println(question.getVar());
            System.out.println("Вопрос:"+ quest.getQuestion() + "\nВарианты:" + quest.getVar()) ;
            String phrase1=sc.nextLine();
            // String phrase=question.getAnswer();
            // if(phrase1.regionMatches(true,0,phrase,0,1)){
            if (phrase1.equalsIgnoreCase(quest.getAnswer())) {
                count++;
            }

        }
        System.out.println("Ваш результат "+count+" из 5");

    }
}