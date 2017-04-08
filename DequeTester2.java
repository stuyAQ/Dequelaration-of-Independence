//Team CATScan
//Tina Chen, Angel Ng, Caleb Smith-Salzberg
//APCS2 pd5
//HW29 -- Stress is the Best
//2017-04-04

public class DequeTester2{
    public static void main (String[] args){
	DLDeque<String> bob = new DLDeque<String>();
	System.out.println("adding items to deque...........................");
	bob.addFirst("Hello");
	bob.addLast("my");
	bob.addLast("name");
	bob.addLast("is");
	bob.addLast("bob");
	System.out.println("items in deque: " + bob);
	
	//shows first item
	System.out.println("Peek first item: " + bob.peekFirst()); //hello
	//shows last item
	System.out.println("Peek last item: " + bob.peekLast()); //bob

	//returns deque with first item removed
	bob.pollFirst();
	System.out.println("Remove first item: " + bob);

	//returns deque with last item removed
	bob.pollLast();
	System.out.println("Remove last item: " + bob);

	//remove everything to create every deque
	bob.pollLast();
	bob.pollLast();
	bob.pollLast();
	System.out.println("Removed all items: " + bob);
	System.out.println("Removing from an empty list should return some sort of exception that makes sense: ");
	bob.pollLast();
	
    }
}
