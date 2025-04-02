package converter.negocio;

import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.StringWriter;

public class XmlConverter extends FileConverter {

    @Override
    protected String formatData(List<Map<String, String>> data) {
        try {
            Document d = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element rec = d.createElement("records");
            d.appendChild(rec);

            for (Map<String, String> linha : data) {
                Element registro = d.createElement("record");
                rec.appendChild(registro);

                linha.forEach((key, value) -> {
                    Element campo = d.createElement(key);
                    campo.setTextContent(value);
                    registro.appendChild(campo);
                });
            }

            StringWriter s = new StringWriter();
            TransformerFactory.newInstance().newTransformer()
                    .transform(new DOMSource(d), new StreamResult(s));
            return s.toString();
        } catch (Exception e) {
            return "Deu xabum" + e;
        }
    }
}
