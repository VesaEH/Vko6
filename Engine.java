package main;

//public class Engine extends Vehicle{
    public class Engine {
        protected String name;
        protected int power;
    
        public Engine(String name, int power){
            this.name = name;
            this.power = power;
        }
    
        public void printSpecs() {
            System.out.println("Moottori: " + name + " " + power + "kW");
        }
    
    
    }