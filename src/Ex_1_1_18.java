
public class Ex_1_1_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = mysteryB(2,25);
		System.out.println(answer);
	}
	
	public static int mysteryA(int a, int b)
	{
		if(b==0) return 0;
		if(b%2==0) return mysteryA(a+a,b/2);
		return mysteryA(a+a,b/2) +a;
	}

	public static int mysteryB(int a, int b)
	{
		if(b==0) return 1;
		if(b%2==0) return mysteryB(a*a,b/2);
		return mysteryB(a*a,b/2) +a;
	}
}
