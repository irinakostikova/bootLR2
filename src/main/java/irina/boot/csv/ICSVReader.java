package irina.boot.csv;

import irina.boot.service.Question;

import java.io.IOException;
import java.util.List;

public interface ICSVReader {

    public List<Question> getQuestions() throws IOException;
}