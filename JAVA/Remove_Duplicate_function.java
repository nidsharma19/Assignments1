import java.util.ArrayList;
public class Remove_Duplicate_function {
	 public ArrayList<Integer> remove(ArrayList<Integer> list) {
         
         ArrayList<Integer> newlist = new  ArrayList<Integer>();
         for (int x : list) {
             if (!newlist.contains(x)) {
                 newlist.add(x);
             }
         }
         return newlist;
         
     }
}
