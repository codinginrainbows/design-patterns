package converter.negocio;

import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.DumperOptions;

public class YamlConverter extends FileConverter {

    @Override
    protected String formatData(List<Map<String, String>> dados) {
        DumperOptions t = new DumperOptions();
        Yaml yaml = new Yaml(t);
        return yaml.dump(dados);
    }
}
