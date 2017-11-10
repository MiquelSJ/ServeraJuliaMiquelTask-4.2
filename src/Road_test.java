import transport.Road;
import transport.Vehicle;

public class Road_test {
    public static void main(String[] args) {
        //Nom de la carretera
        Road road = new Road("de Porreres a Muntuïri");

        //Els vehicles que es fiquen a la carretera
        road.addVehicle("Toyota",100);
        road.addVehicle("Honda",200);
        road.addVehicle("Renault",300);
        road.addVehicle("Audi",400);
        road.addVehicle("BMW", 500);
        System.out.println("ºººººººººººººººººººººººººººººººººººº");

        //Mostra el nombre de cotxes que s'han ficat a la carretera
        System.out.println("A la carretera s'hi han ficat "+road.getNumberOfVehicles()+" vehicles");


        System.out.println("ºººººººººººººººººººººººººººººººººººº");

        //Característiques dels cotxes que s'han ficat a la carretera
        Vehicle vehicle1 = road.getVehicle(0);
        road.getVehicle(0).addBox(100);
        vehicle1.addBox(150);
        System.out.println("ºººººººººººººººººººººººººººººººººººº");

        Vehicle vehicle2 = road.getVehicle(1);
        vehicle2.addBox(100);
        vehicle2.addBox(100);
        System.out.println("ºººººººººººººººººººººººººººººººººººº");

        Vehicle vehicle3 = road.getVehicle(2);
        vehicle3.addBox(100);
        vehicle3.addBox(200);
        System.out.println("ºººººººººººººººººººººººººººººººººººº");

        Vehicle vehicle4 = road.getVehicle(3);
        vehicle4.addBox(100);
        vehicle4.addBox(150);
        System.out.println("ºººººººººººººººººººººººººººººººººººº");

        Vehicle vehicle5 = road.getVehicle(4);
        vehicle5.addBox(100);
        vehicle5.addBox(200);
        System.out.println("ºººººººººººººººººººººººººººººººººººº");

    }


}
