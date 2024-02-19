package main;

public class Car extends Vehicle{

    public Car(String type, String manufacturer, String model, int maxSpeed){
        super("Auto", manufacturer, model, maxSpeed);
        //int x = 1;
        //while(x-- > 0){ 
        engines.add(new Engine("V8", 300));
        }
        



    public void drive(){
        System.out.println(model + " paahtaa tietä eteenpäin!");
    }
}
