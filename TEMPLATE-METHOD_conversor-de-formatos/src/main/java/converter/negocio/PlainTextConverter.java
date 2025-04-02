package converter.negocio;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class PlainTextConverter extends FileConverter {

    @Override
    protected String formatData(List<Map<String, String>> data) {
        StringBuilder textoFormatado = new StringBuilder();

        List<String> cabecalhos = new ArrayList<>(data.get(0).keySet());

        for (Map<String, String> linha : data) {
            for (String c : cabecalhos) {
                String valor = linha.getOrDefault(c, "");
                textoFormatado.append(c).append(": ").append(valor).append("\n");
            }
            textoFormatado.append("----------\n");
        }

        return textoFormatado.toString();
    }
}
