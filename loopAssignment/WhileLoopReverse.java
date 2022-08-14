package loopAssignment;

public class WhileLoopReverse { 
	public static void main(String[] args) {
		
	
int i=123456;//chikya; 
int reverse=0;
//chikya=i;
while (i!=0)
	{int reminder=i%10;
reverse=reverse*10+reminder;
i=i/10;}
System.out.println(reverse);
	
//	if (chikya==reverse) {
	//	System.out.println("it is polindrome");}
//	else{
	//	System.out.println("it is not polindrome");
//	}
	}
}
