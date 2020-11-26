package irina.boot.csv;

import com.opencsv.CSVReader;
import irina.boot.service.Question;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;

@Service
@Configuration
public class CSVReaderImpl implements ICSVReader {

    public List<Question> getQuestions() throws IOException {

        List<Question> result = new ArrayList<>();
        InputStream is = CSVReaderImpl.class.getResourceAsStream("/questions.csv");
        CSVReader csvReader = new CSVReader(new InputStreamReader(is));
        String[] values = null;
        while ((values = csvReader.readNext()) != null){
            String read= Arrays.toString(values);
            String[] answers = read.split(";");
            result.add(new Question(answers[1], answers[2], answers[3]));
        }
        return result;
    }
}
