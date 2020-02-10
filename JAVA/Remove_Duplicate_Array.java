import java.util.ArrayList;
public class Remove_Duplicate_Array {
public static void main(String[] args) {
        
	Remove_Duplicate_function obj = new Remove_Duplicate_function();
        
        ArrayList <Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(120);
        list.add(700);
        list.add(311);
        list.add(311);
        list.add(200);
        list.add(500);
        list.add(311);
        list.add(200);
        list.add(700);
        System.out.println(list);
        
        System.out.println("");
        
        ArrayList<Integer> newlist = obj.remove(list);
        System.out.println(newlist);
        
    }
}
