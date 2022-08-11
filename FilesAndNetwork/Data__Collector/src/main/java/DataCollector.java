import org.json.simple.JSONObject;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class DataCollector {

    public JSONObject fileReader(String path) {
        File doc = new File(path);
        if (doc.isFile()) {
            if (doc.getName().startsWith("dates")&& doc.getName().endsWith(".json")) {

            }
            if (doc.getName().startsWith("dates") && doc.getName().endsWith(".csv")) {

            }
            if (doc.getName().startsWith("depth") && doc.getName().endsWith(".json")) {

            }
            if (doc.getName().startsWith("dates") && doc.getName().endsWith(".csv")) {

            }
        }

        File[] files = doc.listFiles();
        for (File file : files) {

        }



        return new JSONObject();
    }

}
