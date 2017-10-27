package transport;

/**
 *  Classe Road i els seus atributs
 */

public class Road {
    private Vehicle arrayVehicles [];
    private int numberOfVehicles;

    /**
     * Mètodes
     */

// he posat un char i aqui per posar-li nom d'alguna manera a la carretera

    public Road(String nom){
        this.arrayVehicles = new Vehicle[5];
        numberOfVehicles = 0;
        System.out.println("La carretera "+nom+" ha estat creada");
        System.out.println("Ara mateix hi ha " + getNumberOfVehicles() + " vehicles a dintre");
        System.out.println("-------------------------------------------------------------------------");
    }

    public boolean addVehicle (double MaxLoad){

        if(numberOfVehicles < this.arrayVehicles.length){
            arrayVehicles [numberOfVehicles] = new Vehicle(MaxLoad);
            numberOfVehicles++;

            System.out.println("El vehicle número "+numberOfVehicles+" amb "+MaxLoad+" s'ha creat");

            return true;
        }
        else{
            System.out.println("La carretera està plena");
            return false;
        }
    }


    /**
     * Mètode getNumberOfVehicles
     * @return el nombre de Vehicles que hi ha en la carretera
     */

    public int getNumberOfVehicles (){

        return numberOfVehicles;
    }


    public Vehicle  getVehicle(int j){
        if(j < arrayVehicles.length) {
            return arrayVehicles[j];
        }
        else{
            return null;
        }
    }

}
