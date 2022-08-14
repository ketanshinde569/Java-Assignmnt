package categoriesmethodassisnment;

public class FormerArea {
	public static int Areacalculator( int breath,int length) {
		int Area =breath*length;
			return Area;
		}
			public static void main(String[] args) {
			int Land1=Areacalculator(10, 12);
			int Land2=Areacalculator(10, 15);
			int Land3=Areacalculator(10, 30);
			int TotalofArea=Land1+Land2+Land3;
			System.out.println("Total of Area is  "+TotalofArea);
			}


}
