package com.entities;

/*
 * This class represents location of anything on the infinite grid
 */
public class Location {
  private int x;
  private int y;
  public Location(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public Location() {
    this.x =  this.y = 0;
  }
  
  public int[] getLocation() {
    return new int[] {this.x, this.y};
  }
}
