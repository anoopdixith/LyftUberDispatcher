package com.entities;

public class SourceSpot extends Spot{ 
  private DestinationSpot destinationSpot;
    
  public SourceSpot(Location location, Location destination) {
    super(location);
    this.setDestinationSpot(new DestinationSpot(destination));
  }

  public DestinationSpot getDestinationSpot() {
    return destinationSpot;
  }

  public void setDestinationSpot(DestinationSpot destinationSpot) {
    this.destinationSpot = destinationSpot;
  }
}
