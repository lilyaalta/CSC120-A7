public class Cafe extends Building{
 private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
 private int nSugarPackets; // The number of sugar packets remaining in inventory
 private int nCreams; // The number of "splashes" of cream remaining in inventory
 private static int nCups; // The number of cups remaining in inventory

    public Cafe(String name, 
    String address, int nFloors, 
    int nCoffeeOunces, int nSugarPackets, 
    int nCreams, int nCups) {
        /*
         * constructor of the Cafe
         */
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 100;
        this.nCreams = 100;
        Cafe.nCups = 100;
        // System.out.println("You have built a cafe: ☕");
    }

    // overrided methods of choice
    public Cafe enter(){
        super.enter();
        return this;
    }
    public Cafe exit(){
        super.exit();
        return null;
    }
    // overriding the showOptions() method

    public void showOptions(){
        super.showOptions();
        System.out.println(" + sellCoffee(size, sugarpacks, creams) \n + restock(coffee ounces) ");
    }
    public void sellCoffee(int size, int sugarpacks, int creams){
        /*
         * i wanna go to bed
         */
        if(size > nCoffeeOunces || sugarpacks > nSugarPackets || creams > nCreams || 1 > nCups){
            Cafe.restock(size, sugarpacks, creams); // idk man
        }
        nCoffeeOunces -= size;
        nSugarPackets -= sugarpacks;
        nCreams -= creams;
        nCups -= 1;
        System.out.println("oz of cafe " + nCoffeeOunces);
        System.out.println("sgr packs " + nSugarPackets);
        System.out.println("creams " + nCreams); 
        System.out.println("amt of cups " + nCups);
       }
    private static void restock(int nCoffeeOunces, 
    int nSugarPackets, 
    int nCreams){
        /*
         * takes whatever amount of coffee ozs, sugars, creams, and cups the inventory has
         * makes the number assigned to the varibles back to 100 to mimic restocking 
         */
        nCoffeeOunces = 100; 
        nSugarPackets = 100;
        nCreams = 100;
        nCups = 100;
    }


    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("hey", "you", 1, 100, 100, 100, 100);
        myCafe.sellCoffee(3, 5, 2);
        myCafe.sellCoffee(2, 5, 2);
        myCafe.showOptions();
    }
    
}
