package java_assign;
import java.util.Scanner;
public class Stack_queue {
	Scanner sc =new Scanner(System.in);
	void stack() {
		System.out.println("-----------Stack-----------");
		System.out.println("Enter the max Size");
		int top =0;
		int ele = 0;
		int sz = sc.nextInt();
		String stack_size[] =  new String[sz];
//		set while here-------------------------
			do{
				System.out.println("");
				System.out.println("1 For Push");
				System.out.println("2 For Pop");
				System.out.println("3 Show Stack");
				System.out.println("4 For ClearAll");
				System.out.println("5 For Exit");
				ele = sc.nextInt();
				switch(ele) {
					case 1:{
						System.out.println("Push");
						if (top == sz) {
							System.out.println("Stack is Full..");
						}else {
							System.out.println("Enter an Number...");
							String ele1 = sc.next();
							stack_size[top]= ele1;
							top = top+1;
						}	
						break;
					}
					case 2:{
						System.out.println("Pop");
						if (top == 0) {
							System.out.println("Stack is empty..");
						}
						else {
							System.out.println("One Element poped..");
							top = top - 1;
							
						}
						break;
					}
					case 3:{
						if(top ==0 ) {
							System.out.println("NO Element..");
						}else {
							for (int i =0;i< top;i++) {
					            System.out.print(stack_size[i] +",");
					        }
						}
						break;
					}
					case 4:{
						top = 0;
						System.out.println("Clear");
						break;
					}
					default:{
						System.out.println("Choose Right Option");
					}

				}

			}
			while(ele != 5);
	}
	
	void queue() {
		System.out.println("-----------Queue-----------");
		System.out.println("Enter the max Size");
		int top =0;
		int ele = 0;
		int sz = sc.nextInt();
		String stack_size[] =  new String[sz];
//		set while here-------------------------
			do{
				System.out.println("");
				System.out.println("1 For Push");
				System.out.println("2 For Pop");
				System.out.println("3 Show Queue");
				System.out.println("4 For ClearAll");
				System.out.println("5 For Exit");
				ele = sc.nextInt();
				switch(ele) {
					case 1:{
						System.out.println("Push");
						if (top == sz) {
							System.out.println("Queue is Full..");
						}else {
							System.out.println("Enter an Number...");
							String ele1 = sc.next();
							stack_size[top]= ele1;
							top = top+1;
						}	
						break;
					}
					case 2:{
						System.out.println("Pop");
						if (top == 0) {
							System.out.println("Queue is empty..");
						}
						else {
							System.out.println("One Element poped..");
							for(int i=0; i<top-1; i++) {
								stack_size[i]= stack_size[i+1];
							}
							top = top - 1; 
						}
						break;
					}
					case 3:{
						if(top == 0) {
							System.out.println("NO Element..");
						}
						else {
							for (int i =0;i<top;i++) {
					            System.out.print(stack_size[i] +",");
					        }
						}
						break;
					}
					case 4:{
						top = 0;
						System.out.println("Clear");
						break;
					}
					default:{
						System.out.println("Choose Right Option");
					}

				}

			}
			while(ele != 5);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack_queue sq = new Stack_queue(); 
			Scanner sc =new Scanner(System.in);
			System.out.println("Which Functionality do you want..");
			System.out.println(" 1 for Stack Functionlity");
			System.out.println(" 2 for Queue Functionlity");
			System.out.println(" 3 for EXIT");
			int amt = sc.nextInt();
				switch(amt){
					case 1:{
						sq.stack();
						//System.out.println("A");
						break;
					}
					case 2:{
						sq.queue();
//						System.out.println("b");
						break;
					}
					case 3:{
						System.exit(0);
					}
					default:{
						System.out.println("Choose Right Option..!");
					}    
				}	
			sc.close();
	}
}