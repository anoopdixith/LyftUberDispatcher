package com.entities;

import java.util.ArrayList;
import java.util.List;

import com.constants.Constants;
import com.exception.NotValidGridStartPointException;

public class Grid {
  private Location gridId;
  private int gridLength = Constants.GRID_LENGTH;
  private List<Location> allPoints = new ArrayList<Location>();

  public Grid(int x, int y) throws NotValidGridStartPointException {
    if (!(x % gridLength == 0 && y % gridLength == 0)) {
      throw new NotValidGridStartPointException("Grid Positions should start from multiples of 3");
    }
    this.setGridId(new Location(x, y));
    for (int i = x; i < x + gridLength; i++) {
      for (int j = y; j < y + gridLength; j++) {
        Location loc = new Location(i, j);
        allPoints.add(loc);
      }
    }
  }

  public Location getGridId() {
    return gridId;
  }

  private void setGridId(Location gridId) {
    this.gridId = gridId;
  }
}
