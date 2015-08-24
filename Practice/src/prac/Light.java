package prac;

import java.util.logging.Logger;

class Light {
  public static void main(String[] args) {
    int lightspeed;
    long days;
    long seconds; 
    // approximate speed of light in miles per second
    lightspeed = 186000;
    Logger log = Logger.getLogger(Light.class.getName());
    long distance;
    days = 1000; // specify number of days here
    seconds = days * 24 * 60 * 60; // convert to seconds
    distance = lightspeed * seconds; // compute distance
    log.fine("In " + days);
    log.fine(" days light will travel about ");
    log.fine(distance + " miles.");
  }
}

