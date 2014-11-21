package com.entities;

/*
 * This class represents an individual cab.
 * The static numberOfCars is thread safe.
 */
public class Cab {
  private static int numberOfCabs = 0;
  private int id;
  private enum StateValues {idle, assigned, pickedUp, dropped};
  StateValues state;
  private Location location;
  
  public int getId() {
    return id;
  }
  
  public Location getLocation() {
    return location;
  }
  
  public void setLocation(Location location) {
    this.location = location;
  }
  
  public Cab() {
    synchronized(this) {
      this.id = numberOfCabs++;
    }
    this.state = StateValues.idle;
    //When created, all cabs will be at (0,0)
    this.location = new Location();
  }
  
  public StateValues getState() {
    return state;
  }
  public void setState(StateValues state) {
    this.state = state;
  }
}
