
package ejemploDependencias;

public abstract class ElectricDevice {
    
    public static int OFF  = 0;
    public static int ON = 1;
    
    private int state= OFF;
    
    
    public void TurnOn(){
        this.state = ON;
    }
    
    public void TurnOff(){
        this.state = OFF;
    }
    
    public int getState(){
        return this.state;
    }
    
    public void setState(int state){
        this.state = state;
    }
    
}
