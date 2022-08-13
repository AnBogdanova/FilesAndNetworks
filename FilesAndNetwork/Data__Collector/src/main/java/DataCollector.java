import core.Station;
import org.apache.commons.csv.CSVParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCollector {

    Map<String,Station> listStations = new HashMap<>();
    String DATA_FILE;

    public Map<String, Station> getListStations() {
        return listStations;
    }

    public Map<String, Station> fileReader(String path) throws ParseException, FileNotFoundException {
        File doc = new File(path);
        if (doc.isFile()) {
            DATA_FILE = doc.getPath();
            if (doc.getName().endsWith(".json")) {
                JSONParser parser = new JSONParser();
                JSONArray jsonData = (JSONArray) parser.parse(getJsonFile());
                jsonData.forEach(stationObject -> {
                    JSONObject stationJsonObject = (JSONObject) stationObject;
                    String stationName = (String) stationJsonObject.get("name");
                    if (!listStations.containsKey(stationName)) {
                        listStations.put(stationName, new Station(stationName));
                    }
                    if (doc.getName().startsWith("dates")) {
                        String date = (String) stationJsonObject.get("dates");
                        listStations.get(stationName).setDate(date);
                    }
                    else if (doc.getName().startsWith("depths")) {
                        String date = (String) stationJsonObject.get("depth_meters");
                        listStations.get(stationName).setDate(date);
                    }
                });
            }

            if (doc.getName().endsWith(".csv")) {
                String filePath = doc.getPath();
                BufferedReader reader = new BufferedReader(new FileReader(filePath)); //filePath
                try {
                    String splitBy = ",";
                    String line = "";
                    while ((line = reader.readLine()) != null) {
                        String[] lines = line.split(splitBy);
                        for (int i = 0; i < lines.length; i++) {
                            if (i%2 == 0) {
                                String stationName = lines[i];
                                if (!listStations.containsKey(stationName)) {
                                    listStations.put(stationName, new Station(stationName));
                                }
                                if (doc.getName().startsWith("dates")) {
                                    listStations.get(stationName).setDate(lines[++i]);
                                }
                                else if (doc.getName().startsWith("depth")) {
                                    listStations.get(stationName).setDepth(lines[++i]);
                                }
                            }
                        }
                    }
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }

        File[] files = doc.listFiles();
        for (File file : files) {
            String filePath;
            if (file.isFile()) {
                DATA_FILE = file.getPath(); //filePath
                if (file.getName().endsWith(".json")) {
                    JSONParser parser = new JSONParser();
                    JSONArray jsonData = (JSONArray) parser.parse(getJsonFile());
                    jsonData.forEach(stationObject -> {
                        JSONObject stationJsonObject = (JSONObject) stationObject;
                        String stationName = (String) stationJsonObject.get("name");
                        if (!listStations.containsKey(stationName)) {
                            listStations.put(stationName, new Station(stationName));
                        }
                        if (file.getName().startsWith("dates")) {
                            String date = (String) stationJsonObject.get("dates");
                            listStations.get(stationName).setDate(date);
                        }
                        else if (file.getName().startsWith("depths")) {
                            String date = (String) stationJsonObject.get("depth_meters");
                            listStations.get(stationName).setDate(date);
                        }
                    });
                }

                if (file.getName().endsWith(".csv")) {
                    String filePath1 = file.getPath();
                    BufferedReader reader = new BufferedReader(new FileReader(filePath1)); //filePath
                    try {
                        String splitBy = ",";
                        String line = "";
                        while ((line = reader.readLine()) != null) {
                            String[] lines = line.split(splitBy);
                            for (int i = 0; i < lines.length; i++) {
                                if (i%2 == 0) {
                                    String stationName = lines[i];
                                    if (!listStations.containsKey(stationName)) {
                                        listStations.put(stationName, new Station(stationName));
                                    }
                                    if (file.getName().startsWith("dates")) {
                                        listStations.get(stationName).setDate(lines[++i]);
                                    }
                                    else if (file.getName().startsWith("depth")) {
                                        listStations.get(stationName).setDepth(lines[++i]);
                                    }
                                }
                            }
                        }
                    }
                    catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                fileReader(file.getAbsolutePath());
            }
        }
        return listStations;
    }

    private String getJsonFile() {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(DATA_FILE));
            lines.forEach(line -> builder.append(line));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return builder.toString();
    }

    private String getCsvFile() {
        StringBuilder builder = new StringBuilder();
        try {
            List<String> lines = Files.readAllLines(Paths.get(DATA_FILE));
            lines.forEach(line -> builder.append(line));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return builder.toString();

    }

}
