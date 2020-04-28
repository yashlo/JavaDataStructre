
import java.util.Scanner;
 class Node {
	int data;
	Node next;


}
 class LinkList  {
	Node head;
	public void insert(int data) 
	{
		Node node = new Node();
		node.data = data;
		node.next=null;
		 if(head == null)
		 {
			 head = node;
			 
		 }
		 else
		 {
			 Node n = head;
			 while(n.next!=null)
			 {
				 n = n.next;
				 
			 }
			 n.next = node;
			 
		 }
		 
	}
	public void show() {
		Node node = head;
		while(node.next!=null)
		 {
			System.out.println(node.data);
			 node = node.next;
		 }
		System.out.println(node.data);
		
	}
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next=head;
		head = node;
	}
	public void insertAt(int index,int data) {
		if(index == 0)
		{
			insertAtStart(data);
		}
		else
		{
			Node node = new Node();
			node.data = data;
			node.next=null;
			Node n = head;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	public void deleteAt(int index) {
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
			
		}
	}
}

public class Runner extends LinkList {
	public static void main(String []args) {
		
		LinkList lst = new LinkList();
		int index,data;
		String ch = "y";
		Scanner sc = new Scanner(System.in);
		while(ch !="y")
		{
			System.out.println("====>Menu<=====");
			System.out.println("1 Insert the node at end");
			System.out.println("2 Show Data");
			System.out.println("3 Insert the Start");
			System.out.println("4 Insert from anywhere");
			System.out.println("5 Delete any node");
			
			int cho;
			System.out.println("Select your choice");
			cho = sc.nextInt();
			switch (cho) {
			case 1:
				System.out.println("Enter the data that you want to to insert");
				data = sc.nextInt();
				lst.insert(data);
				break;
			case 2:
				lst.show();
				break;
			case 3:
				System.out.println("Enter the data that you want to to insert");
				data = sc.nextInt();
				lst.insertAtStart(data);
				break;
			case 4:
				System.out.println("Enter the data that you want to to insert");
				data = sc.nextInt();
				System.out.println("Enter the index ");
				index = sc.nextInt();
				lst.insertAt(index,data);
				break;
			case 5:
				System.out.println("Enter the index ");
				index = sc.nextInt();
				lst.deleteAt(index);
				

			default:
				break;
			}
			ch = sc.next();
			
		}
		sc.close();
		
	}

}

