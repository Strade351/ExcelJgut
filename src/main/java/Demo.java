import model.Inconsistency;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        ExcelWorker excelWorker = new ExcelWorker("basetemplate.xlsx");
        Inconsistency inconsistency = excelWorker.readIncosistency(3);
        System.out.println(inconsistency.toString());
        excelWorker.createBlank(inconsistency);
    }
}
