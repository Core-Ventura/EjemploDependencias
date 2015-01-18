package ejemploDependencias;

public class EjemploDependencias {

    public static void main(String[] args) {
        
        Fan ventilador = new Fan();
        System.out.println(ventilador.getState());
        ventilador.TurnOn();
        System.out.println(ventilador.getState());
    }
    
}
