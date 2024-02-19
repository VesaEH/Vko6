package main;

//ALKUPERÄINEN SHIP
public class Ship extends Vehicle{

    public Ship(String type, String manufacturer, String model, int maxSpeed){
        super("Laiva", manufacturer, model, maxSpeed);
        engines.add(new Engine("Wärtsilä Super", 1000));
    }

    public void sail(){
        System.out.println(model + " seilaa merten ääriin!");
    }
}