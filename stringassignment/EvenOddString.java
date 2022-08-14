package stringassignment;

public class EvenOddString {
public static void main(String[] args) {
String nk= "ketan shinde";
for(int i=0;i<nk.length();i++) {
	char c=nk.charAt(i);
	if(i%2==0) {
		System.out.println("character is :"+c+ " position of value:"+i);
	}
}
}

}
