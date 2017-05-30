package espol.edu.ec.main;

import java.util.LinkedList;
import java.util.ListIterator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> teens = new LinkedList<>();
        teens.add("Bayer");
        teens.add("Manchester");
        teens.add("Barcelona");
        teens.add("Juventus");
        System.out.println(teens);	
        
        ListIterator<String> i = teens.listIterator();
        while(i.hasNext()){
        	String teen = i.next();
        	System.out.println(teen);
        }
		

	}

}
