package pl.javacoding;

import pl.javacoding.manager.FlightManager;
import pl.javacoding.model.State;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        State state = new FlightManager(new URL("https://opensky-network.org/api/states/all")).findNearestFlight(51.6525013, 18.4329261);
        System.out.println(state.toString());
    }


}