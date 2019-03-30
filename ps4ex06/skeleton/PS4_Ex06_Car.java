/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #06: PS4_Ex06_Car.java
 * 
 * Define a Car class consisting of three attributes:
 * model, colour, and odometer reading.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

class Car {
  
  // Attributes
  private String model, colour; double odoVal;
  
  // Constructor
  public Car(String mod, String col, double odo) {
    model=mod;
    colour=col;
    odoVal=odo;
  }
  
  // Return the model of a Car object
  public String getModel() {
    return model;  // stub
  }
  
  // Return the colour of a Car object
  public String getColour() {
    return colour;  // stub
  }
  
  // Return the odometer value of a Car object
  public double getOdometer() {
    return odoVal;  // stub
  }
  
  // Update the odometer with the distance travelled
  public void updateOdometer(double distance) {
    odoVal+=distance;
    if(odoVal>999.9){
      odoVal=odoVal%1000;
    }
  }
}