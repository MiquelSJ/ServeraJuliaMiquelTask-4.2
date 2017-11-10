package transport;


//Classe Road i els seus atributs d'array
public class Road {
    private Vehicle arrayVehicles [];
    private int numberOfVehicles;


    //Mètodes
    //Crea la carretera (array) amb el nombre de cotxes
    public Road(String nom){
        this.arrayVehicles = new Vehicle[5];
        numberOfVehicles = 0;
        System.out.println("La carretera "+nom+" ha estat creada");
        System.out.println("Hi ha "+ getNumberOfVehicles()+" vehicles a la carretera");
        System.out.println("ºººººººººººººººººººººººººººººººººººº");
    }

    //Per ficar els cotxes a la carretera, també mostra la càrrega màxima dels cotxes i si la carretera està plena
    public boolean addVehicle (String nom, double MaxLoad){
        if(numberOfVehicles < this.arrayVehicles.length){
            arrayVehicles [numberOfVehicles] = new Vehicle(MaxLoad);
            numberOfVehicles++;
            System.out.println("El vehicle "+nom+" s'ha ficat a la carretera una amb càrrega màxim a de "+ MaxLoad+" Kg");
            return true;
        }
        else{
            System.out.println("No hi caben més cotxes a la carretera");
            return false;
        }
    }


    //Mostra el nombre de cotxes a la carretera

    public int getNumberOfVehicles (){
        return numberOfVehicles;
    }


    public Vehicle  getVehicle(int i){
        if(i < arrayVehicles.length) {
            return arrayVehicles[i];
        }
        else{
            return null;
        }
    }

}
