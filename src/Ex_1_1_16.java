
public class Ex_1_1_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = exR1(6);
		System.out.println(output);
	}
	
	public static String exR1(int n){
		if(n<=0) return "";
		return exR1(n-3)+n+exR1(n-2) +n;
	}

}
