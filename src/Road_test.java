import transport.Road;
import transport.Vehicle;

public class Road_test {
    public static void main(String[] args){

       Road carretera = new Road("Vella de Sineu");

        carretera.addVehicle(100);
        carretera.addVehicle(200);
        carretera.addVehicle(300);
        carretera.addVehicle(400);
        carretera.addVehicle(500);
        carretera.addVehicle(600);

        Vehicle veh1 = carretera.getVehicle(0);
        veh1.addBox(100);
        veh1.addBox(200);
        System.out.println("El vehicle amb ID "+ veh1+ " té una carrega de " +veh1.getLoad());
        System.out.println("------------------------------------");

        Vehicle veh2 = carretera.getVehicle(1);
        veh2.addBox(100);
        veh2.addBox(100);
        System.out.println("El vehicle amb ID "+ veh2+ " té una carrega de " +veh1.getLoad());
        System.out.println("------------------------------------");

        Vehicle veh3 = carretera.getVehicle(2);
        veh3.addBox(100);
        veh3.addBox(200);
        System.out.println("El vehicle amb ID "+ veh3+ " té una carrega de " +veh1.getLoad());
        System.out.println("------------------------------------");

        Vehicle veh4 = carretera.getVehicle(3);
        veh4.addBox(100);
        veh4.addBox(200);
        veh4.addBox(150);
        System.out.println("El vehicle amb ID "+ veh4+ " té una carrega de " +veh1.getLoad());
        System.out.println("------------------------------------");

        Vehicle veh5 = carretera.getVehicle(4);
        veh5.addBox(100);
        veh5.addBox(200);
        veh5.addBox(150);
        System.out.println("El vehicle amb ID "+ veh5+ " té una carrega de " +veh1.getLoad());
        System.out.println("------------------------------------");
    }


}
