public class Bicycle{
    // instance vars
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    // change the cadence, req int value
    void changeCadence(int newValue){
       cadence = newValue; 
    }
  
    // change gear
    void changeGear(int newValue){
        gear = newValue;    
   }
    
    //speed up
    void speedUp(int increment){
        speed += increment;  
    }

    //print the state
    void printStates(){
        System.out.println("cadence: " + cadence +
            " speed: " + speed);
    }
}

class BicycleDemo {
    public static void main(String[] args){
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);
        bike2.changeCadence(50);

        bike1.speedUp(10);
        bike2.speedUp(20);

        bike1.printStates();
        bike2.printStates();

    }
}
