package converter.apresentacao;

import java.io.IOException;
import com.opencsv.exceptions.CsvException;
import converter.negocio.FileConverter;
import converter.negocio.JsonConverter;
import converter.negocio.XmlConverter;
import converter.negocio.YamlConverter;
import converter.negocio.PlainTextConverter;

public class Main {
    public static void main(String[] args) throws IOException, CsvException {
        String inputCsvFile = "bd.csv";

        FileConverter jsonConverter = new JsonConverter();
        FileConverter xmlConverter = new XmlConverter();
        FileConverter yamlConverter = new YamlConverter();
        FileConverter plainTextConverter = new PlainTextConverter();

        jsonConverter.convertFile(inputCsvFile, "convertido.json");
        xmlConverter.convertFile(inputCsvFile, "convertido.xml");
        yamlConverter.convertFile(inputCsvFile, "convertido.yaml");
        plainTextConverter.convertFile(inputCsvFile, "convertido.txt");

        System.out.println("Conversoes terminadas");
    }
}
