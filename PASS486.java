import java.util.Scanner;
public class PASS486 {

	static int[] divisor = new int[10000001];
	static int C;
	static int n;
	static int lo;
	static int hi;
	static int TM = 10000000;
	static int cnt;
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		C = sc.nextInt();
		
		getFactor();
		
		for(int i = 0; i < C; i++)
		{
			
			cnt = 0;
			
			n = sc.nextInt();
			lo = sc.nextInt();
			hi = sc.nextInt();
			
			for(int j = lo; j <= hi; j++)
			{
				if(divisor[j] == n) cnt++;
			}
			
			System.out.println(cnt);
			
		}
	}
	
	public static void getFactor()
	{
		for(int i = 1; i <= TM; i++)
		{
			for(int j = i; j <= TM; j += i )
			{
				divisor[j]++;
			}
		}
	}
}
