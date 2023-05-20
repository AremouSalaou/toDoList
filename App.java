package toDoList;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = "";
		ToDoList lst = new ToDoList();
		do{
			System.out.println("""
					a: To add a new item
					d: To delete item
					c: to mark item as complete
					s: To mark item as in progress
					l: Prints a list of item and their status
					q: To quit the program""");
			str = in.nextLine();
			lst.controlar(str);

		}while(str.toLowerCase().charAt(0) != 'q');

	in.close();
}

}
