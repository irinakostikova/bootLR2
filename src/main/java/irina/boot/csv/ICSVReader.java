package irina.boot.csv;

import irina.boot.service.Question;
import java.io.IOException;
import java.util.List;

public interface ICSVReader {

   List<Question> getQuestions() throws IOException;
}