package com.entities;

/*
 * This class represents a spot which is basically a location which is either the source or
 * destination.
 */
public class Spot {
  protected boolean active;
  protected Location location;

  public boolean getActive() {
    return active;
  }
  
  public void setActive(boolean active) {
    this.active = active;
  }
  
  public Location getLocation() {
    return this.location;
  }
  
  public void setLocation(Location location) {
    this.location = location;
  }
  
  public Spot(Location location) {
    this.location = location;
  }
}
