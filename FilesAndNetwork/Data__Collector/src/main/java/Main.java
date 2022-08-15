
import core.Connections;
import core.MetroMap;
import core.Station;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {

        Parser parser = new Parser("https://skillbox-java.github.io");

        JSONArray linesArray = parser.parseLine();

        JSONObject stationsObject = parser.parseStation();

        parser.parseConnection();
        TreeSet<Connections> connections = parser.getContainerStations().getConnections();
        JSONArray connectionsArray = parser.writeConnectionsInJSON(connections);
        MetroMap metro = new MetroMap(stationsObject, linesArray, connectionsArray);

        JSONCreator jsonWriter = new JSONCreator();
        jsonWriter.writeInJSONFile(metro.getMetroObject(), "FilesAndNetwork/Data__Collector/src/main/resourse/metro.json");
        JSONReader jsonReader = new JSONReader();
        jsonReader.getAmountOfStations("FilesAndNetwork/Data__Collector/src/main/resourse/metro.json");

        DataCollector collector = new DataCollector();
        collector.fileReader("/Users/kirill/IdeaProjects/FilesAndNetworks/FilesAndNetwork/Data__Collector/src/main/resourse/data/4/6");


    }
}
