package converter.negocio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public abstract class FileConverter {

    public final void convertFile(String inputCsvFile, String outputFile) throws IOException, CsvException {
        List<Map<String, String>> data = readCsv(inputCsvFile);
        String formatado = formatData(data);
        exportData(formatado, outputFile);
    }

    private List<Map<String, String>> readCsv(String inputFile) throws IOException, CsvException {
        List<Map<String, String>> result = new ArrayList<>();

        CSVReader r = new CSVReader(new FileReader(inputFile));
        List<String[]> l = r.readAll();
        r.close();

        String[] header = l.get(0);

        for (int i = 1; i < l.size(); i++) {
            String[] row = l.get(i);
            Map<String, String> map = new HashMap<>();

            for (int j = 0; j < header.length && j < row.length; j++) {
                map.put(header[j], row[j]);
            }
            result.add(map);
        }

        return result;
    }

    protected abstract String formatData(List<Map<String, String>> data);

    private void exportData(String data, String outputFile) throws IOException {
        FileWriter fw = new FileWriter(outputFile);
        fw.write(data);
        fw.close();
    }
}