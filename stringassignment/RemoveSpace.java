package stringassignment;

public class RemoveSpace {
public static void main(String[] args) {
	String s1 ="ketan shinde";
	String s2=s1.replace(" ","");
	System.out.println(s2);
	
	//unnecessary remove word
	String s3= "ketan    Kakaso  shinde";
	String s4=s3.replaceAll("\\s+", " ");
	System.out.println(s4);
    //remove num,specail symbol
	String s5= "K323e@t43an";
	String s6=s5.replaceAll("[^A-Za-z]","");
	System.out.println(s6);
}
}
