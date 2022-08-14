package stringassignment;

public class ReverseString {
public static void main(String[] args) {
	String kk="ketan",nk="";
char ch;
System.out.println(kk);

for ( int i=0;i<kk.length();i++) {
	ch=kk.charAt(i);
	nk=ch+nk;
}

System.out.println(nk);}
}
