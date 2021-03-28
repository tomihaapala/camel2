package com.example;



/**
 *
 * @author Tomi
 */
public class Train extends Location {

    private int trainNumber;
    private String departureDate;
    private String timestamp;
    private Location location;
    private int speed;

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public Location getLocation(){
        return location;
    }
    public void setLocation(Location location){
        
        this.location = location;

    }
    public String getLocationType(){
        return this.location.getType();
    }
     public double[] getLocationCoordinates(){
        return this.location.getCoordinates();
    }
     public double getCoordinateE(){
         return this.location.getCoordinateE();
     }
       public double getCoordinateN(){
         return this.location.getCoordinateN();
     }
             
             
             
     private int getSpeed(){
         return speed;
     }
     private void setSpeed(int speed){
         this.speed = speed;
     }
         public String toString(){
        return "Train number: "+this.trainNumber+ ", Departure date: "+this.departureDate+", Timestamp: "+this.timestamp+ ", Location type: "+
                getLocationType()+", Location coordinates: "+location.getCoordinateN()+", "+location.getCoordinateE()+", Speed: "+this.speed;
                
}

}