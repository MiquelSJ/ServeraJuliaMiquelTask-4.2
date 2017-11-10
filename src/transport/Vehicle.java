package transport;

//Classe vehicle
public class Vehicle {

    private double load;
    private double maxLoad;

    //maxLoad el màxim que pot carregar un vehicle

    public Vehicle(double maxLoad){
        this.maxLoad = maxLoad;

    }

   //getLoad retorna la càrrega del vehicle

    public double getLoad(){
        return load;
    }

    //getMaxLoad torna el màxim que pot carregar
    public double getMaxLoad(){
        return maxLoad;
    }

    //El weight és el pes de la caixa
    public boolean addBox(double weight){

        //Mostra el pes de la caixa i els pes que falta per fer el límit, també si no n'hi caben més
        if (load+weight <= maxLoad) {
            this.load = weight + this.load;
            System.out.println("El pes de la caixa és: " + weight + " Kg i s'ha pogut ficar al vehicle");
            System.out.println("S'hi poden afegir "+ (maxLoad-load)+" Kg més.");
            return true;
        }

        else {
            System.out.println("Està al limit, no hi caben més paquets");
            return false;
        }
    }
}


