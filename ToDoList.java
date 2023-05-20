/*ToDoList class 
 * A default constructor to initialize instant variables
 * add(item) method adds a new item to the list
 * delete(item) mothod deletes item from the list
 * started() marks item as in progress
 * complete() method marks item as completed 
 * printAllItems() prints a all list of item
 * controlar(item)  help app navigate the functions
 */
package toDoList;
import java.util.HashMap;
import java.util.Scanner;
public class ToDoList {
    private HashMap <String,String> map ;
    private Scanner input = new Scanner(System.in);
    
    //no-arg constructor 
    public ToDoList(){
        map = new HashMap<>();
    
    }
    

    //Adds a new item to the map
    public void add(String item){
        map.put(item, "not yet started");
    }

    //Deletes an item from the map
    public void delete(String item){
        if(map.containsKey(item)){
            map.remove(item);
        }
        else{
            System.out.println(item + " does not exist in your to do list");
        }
    }
    //Marks iem as in progress
    public void started(String item ){
        if(map.containsKey(item)){
            map.put(item, " in progress");
        }
        else{
            System.out.println(item + " does not exist in your to do list");
        }
    }

    //Marks iem as complete
    public void complete(String item ){
        if(map.containsKey(item)){
            map.put(item, " complete");
        }
        else{
            System.out.println(item + " does not exist in your to do list");
        }
    }

    //Prints a list of all item in the map
    public void printAllItem(){
        System.out.println(map.toString());
    }

    // help app navigate the functions
public void controlar(String str){
    char ch = str.toLowerCase().charAt(0);
    switch(ch){
        case  'a':
        System.out.println("Enter item to be added to the list");
        this.add(input.nextLine());
        break;
        case 'd':
        System.out.println("Enter item to be deleted from the list");
        this.delete(input.nextLine().toLowerCase());
        break;
        case 'c':
        System.out.println("Enter item to be marked as complete");
        this.complete(input.nextLine().toLowerCase());
        break;
        case 's':
        System.out.println("Enter item to be marked as in progress");
        this.started(input.nextLine().toLowerCase());
        break;
        case 'l':
        this.printAllItem();
        break;
        case 'q':
        System.out.println("Application has stopped per your request");
        break;
        default :
        System.out.println("Try again option "+ ch + " do not exist");

    }  

    }


}
