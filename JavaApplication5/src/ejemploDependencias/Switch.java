package ejemploDependencias;

public class Switch {
    
    private ElectricDevice electricDevice;
    public Switch(Lamp lamp){
        this.electricDevice = new Lamp();
    }
    
    public Switch(Fan fan){
        this.electricDevice = new Fan();
    }
    
   public void push(){
       if(electricDevice.getState() == Lamp.ON){
           electricDevice.TurnOff();
       } else {
           electricDevice.TurnOn();
       }
   }
}
