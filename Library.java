import java.util.Hashtable;

public class Library extends Building {
 private Hashtable<String, Boolean> collection; // how could I make this private
 String title;
 String name;
 String address;
 int nFloors;
 


    public Library(String name, String address, 
    int nFloors, Hashtable<String, Boolean> collection) {
      /*
       * this is the contructor for the library
       */
      super(name, address, nFloors);

      // this.collection = new Hashtable<Sting, Boolean>();
      // System.out.println("You have built a library: 📖");
    }

    // overriding the showOptions() method

    public void showOptions(){
      super.showOptions();
      System.out.println(" + removeTitle(title)\n + addTitle(title)\n + checkOut(title)\n + returnBook(title)\n + containsTitle(title)\n + isAvailable(title)\n + printCollection()");
    }
    public void addTitle(String title){
      /*
      Adds the book to the library if it is not already there. 
      Also makes sure that the book is already available.
       */
      if(!collection.contains(title)){
        collection.put(title, true);
      }
    }
    public String removeTitle(String title){
      /*
       * Check if unwanted book is in the array list 
       * takes a book out of the array list 
       */
      if(collection.contains(title)){
        collection.remove(title);
      }
      return title + " has been removed.";
    }
    public void checkOut(String title){
      /*
       * checking to see if book is in the library
       * then checking if it is checked out or not (true or false)
       * replacing value(if true) to false so it can be checked out
       */
      if(collection.contains(title)){
        // where would the exception be
        if(collection.containsValue(true)){
        collection.replace(title, true, false);
        }
      }
    }
    public void returnBook(String title){
      /*
       * checking to see if book is in the library
       * then checking if it is checked out or not (true or false)
       * replacing value(if false) to true so it can be returned
       */
      if(collection.contains(title)){
        // where would I catch the exception
        if(collection.containsValue(false)){
        collection.replace(title, false, true);
        }
      }
    }

    public boolean containsTitle(String title){
      /*
       * finding whether the book is in the arraylist or not
       * returns boolean, (true or false)
       */
      if(collection.contains(title)){
        return true;
      }
      else{
        return false;
      }
    }
    public boolean isAvailable(String title){
      /*
       * finding if book is not in the arraylist 
       * finding if book is available or checked out
       * returns boolean (true or false)
       */
      if(!collection.contains(title)){     
      return true;
      }
      else{
        return true;
    }
  }
    public void printCollection(){
      /*
       * creates iteration for the collection of books 
       * did i do this right...
       */
      for(collection.keySet();;){
        collection.get(title);
        System.out.println("Book" + title + "Is it checked out?" + isAvailable(title));
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
      Hashtable<String, Boolean> theCollection = new Hashtable<>();
      theCollection = new Hashtable<String, Boolean>();
      theCollection.put("Dr suess", true);
      theCollection.put("mafia", false);
      theCollection.put("bts", true);

      Library myLibrary = new Library("Neilson Library", "bite me", 4, theCollection);
      myLibrary.showOptions();
        }
  
  }