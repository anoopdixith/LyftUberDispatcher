package com.map;

import java.util.Hashtable;
import java.util.LinkedList;

import com.constants.Constants;
import com.entities.Cab;
import com.entities.Grid;
import com.entities.Location;
import com.exception.NotValidGridStartPointException;

public class InfiniteGrid {
  //static because the whole class is a singleton. All methods ate static.
  static Hashtable<Grid, LinkedList<Cab>> cabLocation = new Hashtable<Grid, LinkedList<Cab>>(); 
  
  //Prevent instantiation
  private InfiniteGrid() {
  }
  
  public static void prepareGrids() {
    int gridLength = Constants.GRID_LENGTH;
    for(int i = Constants.NEGATIVE_X - (Constants.NEGATIVE_X % gridLength); i < Constants.POSITIVE_X - (Constants.POSITIVE_X % gridLength); i+=gridLength) {
      for(int j = Constants.NEGATIVE_Y - (Constants.NEGATIVE_Y % gridLength); i < Constants.POSITIVE_Y - (Constants.POSITIVE_Y % gridLength); j+=gridLength) {
        try {
          Grid grid = new Grid(i,j);
          cabLocation.put(grid, null);
        } catch (NotValidGridStartPointException e) {
          e.getMessage();
        }
      }
    }
  }
  
  public static Grid getGrid(Location loc) throws NotValidGridStartPointException {
    int x = loc.getLocation()[0];
    int y = loc.getLocation()[1];
    x = (x>0)? x - (x % Constants.GRID_LENGTH): x + (x % Constants.GRID_LENGTH);
    y = (y>0)? y - (y % Constants.GRID_LENGTH): y + (y % Constants.GRID_LENGTH);
    return new Grid(x,y);
  }
  
  
}
