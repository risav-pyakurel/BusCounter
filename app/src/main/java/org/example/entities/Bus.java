package org.example.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Bus {
    private String busId;
    private String busNumber;
    private List<List<Integer>> seats;
    private Map<String, Time> stationTimes;
    private List<String> stations;
}
