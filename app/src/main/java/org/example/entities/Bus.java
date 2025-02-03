package org.example.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Bus {
    private String busId;
    private String busNumber;
    private List<List<Integer>> seats;
    private Map<String, String> stationTimes;
    private List<String> stations;
    public Bus(){}

    public Bus(String busId, String busNumber, List<List<Integer>> seats, Map<String, String> stationTimes, List<String> stations){
        this.busId = busId;
        this.busNumber = busNumber;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    public List<String> getStations(){
        return stations;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats){
        this.seats = seats;
    }

    public String getbusId(){
        return busId;
    }

    public Map<String, String> getStationTimes(){
        return stationTimes;
    }

    public String getBusNumber(){
        return busNumber;
    }

    public void setbusNumber(String busNumber){
        this.busNumber = busNumber;
    }

    public void setbusId(String busId){
        this.busId = busId;
    }

    public void setStationTimes(Map<String, String> stationTimes){
        this.stationTimes = stationTimes;
    }

    public void setStations(List<String> stations){
        this.stations = stations;
    }

    public String getBusInfo(){
        return String.format("Train ID: %s Train No: %s", busId, busNumber);
    }

}
}
