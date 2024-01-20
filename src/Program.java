import controller.ParseIncome;
import model.DBWriter;
import model.exceptions.FourFieldsInputException;
import view.View;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws IOException, FourFieldsInputException {

        String input = new View().input();
        String[] data = new ParseIncome().parseIncome(input);
        new DBWriter().dBWriter(data);
    }
}
