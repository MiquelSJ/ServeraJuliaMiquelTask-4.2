package transport;

/**
 * Clase vehicle amb els seus atributs
 */

public class Vehicle {

    private double load;
    private double maxLoad;

    /**
     * @param maxLoad serà el màxim de pès que podrem carregar dins el vehicle creat
     */


    public Vehicle(double maxLoad){
        this.maxLoad = maxLoad;

    }

    /**
     * El mètode getLoad
     * @return la càrrega que du el vehicle en aquest moment
     */

    public double getLoad(){
        return load;
    }

    /**
     * El mètode getMaxload()
     * @return el màxim de pès que podrem carregar dins el vehicle
     */

    public double getMaxLoad(){
        return maxLoad;
    }

    /**
     * @param weight = el pès de la caixa que estam afegint
     * @return si la caixa hi entra o no
     */
    public boolean addBox(double weight){


        if (load+weight <= maxLoad) {

            this.load = weight + this.load;
            System.out.println("La carrega de " + weight + " Kg s'ha pogut afegir al vehicle");
            System.out.println("Encara hi caben "+ (maxLoad-load));

            return true;

        }

        else {
            System.out.println("Error! Aquest paquet ja no hi cab");
            return false;
        }
    }
}


