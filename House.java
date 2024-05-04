/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{
  boolean hasElevator;
  boolean hasDiningRoom;
  ArrayList<String> residents;

  public House(String name, 
              String address, 
              int nFloors, 
              boolean hasElevator, 
              boolean hasDiningRoom) {
// constructor
    super(name, address, nFloors); // is a building
    //... with:
    this.hasElevator = hasElevator;
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
  }
  // overriding the showOptions() method

  public void showOptions(){
    super.showOptions();
    System.out.println(" + moveIn(name) \n + moveOut(name) \n + isResident(person)");
}

  public String toString(){
    String desc  = super.toString(); // overrides the parent info without changing it
    // return += "Resident House" + desc;
    if(this.hasDiningRoom){
      desc += " It has a dining room.";
    }
    if(this.hasElevator){
      desc += " It has an elevator.";
    }
    return desc;
  }
  public void moveIn(String name){ 
    if(!residents.contains(name)){//adds resident to the array list if resident isn't already in there
      this.residents.add(name);
    }
  }
  public String moveOut(String name){
    if(residents.contains(name)){// takes resident out of array list if resident is in the list
      this.residents.remove(name);
    }
    return name + " has been moved out!";
  }
  public boolean isResident(String person){
    // How do i not provide direct access of entire list in this method?
    if(residents.contains(person)){// returns boolean true or false depending if the resident is there or not
      return true;
    }
    else{
      return false;
    }
  }
  public void goToFloor(int floorNum){
    super.goToFloor(floorNum);
}
// overrided methods of choice:
  public void goUp(){
    super.goUp();
  }
  public void goDown(){
    super.goDown();
  }

  public static void main(String[] args) {
    House myHouse = new House("Capen House", 
    "26 Prospect St", 3, 
    false, false);
    myHouse.moveIn("Lily");
    System.out.println(myHouse.residents);
    myHouse.moveOut("Lily");
    System.out.println(myHouse.residents);
    myHouse.showOptions();
  }

}