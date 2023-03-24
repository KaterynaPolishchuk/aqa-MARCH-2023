package org.prog.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    public List<Passenger> passengers = new ArrayList<>();
    //    public List<Passenger> passengers = new ArrayList<>();
    public List<Plane> planes = new ArrayList<>();

    public void addPassenger(Passenger arrivingPassenger) {
        for (int i = 0; i < passengers.size(); i++) {
            if (passengers.get(i) == null) {
                passengers.add(i, arrivingPassenger);
                break;
            }
        }
    }

    public void addPlane(Plane arrivingPlane) {
        for (int i = 0; i < planes.size(); i++) {
            if (planes.get(i) == null) {
                planes.add(i, arrivingPlane);
                return;
            }
        }
    }

    public void boardPlane(Passenger passenger, Plane plane) {
        plane.boardPassenger(passenger);
    }
}
