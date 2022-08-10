package core;

public class Station implements Comparable<Station>{
    private String numberLine;
    private String name;
    private String lineName;
    private String date;
    private String depth;
    private boolean hasConnection;

    public Station(String name, String lineName, String date, String depth, boolean hasConnection) {
        this.name = name;
        this.lineName = lineName;
        this.date = date;
        this.depth = depth;
        this.hasConnection = hasConnection;
    }

    public Station(String name, String numberLine) {
        this.name = name;
        this.numberLine = numberLine;
    }

    public String getNumberLine() {
        return numberLine;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Station station) {
        int lineComparison = numberLine.compareToIgnoreCase(station.getNumberLine());
        if(lineComparison != 0) {
            return lineComparison;
        }
        return name.compareToIgnoreCase(station.getName());
    }

    @Override
    public boolean equals(Object obj) {
        return compareTo((Station) obj) == 0;
    }
}
