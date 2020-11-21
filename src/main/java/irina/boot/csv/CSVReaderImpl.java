package irina.boot.csv;

import com.opencsv.CSVReader;
import irina.boot.service.Question;
import org.springframework.stereotype.Component;
import java.io.*;
import java.util.*;


@Component
public class CSVReaderImpl implements ICSVReader {
    @Override
    public List<Question> getQuestions() throws IOException {
        List<Question> result = new ArrayList<>();

        InputStream is = CSVReaderImpl.class.getResourceAsStream("/questions.csv");
        CSVReader csvReader = new CSVReader(new InputStreamReader(is));
        String[] values = null;
        while ((values = csvReader.readNext()) != null){

            String read= Arrays.toString(values);
            String[] ans = read.split(";");
            result.add(new Question(ans[1], ans[2], ans[3]));
        }

        return result;
    }
}
