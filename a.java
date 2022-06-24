import java.util.*;
class a{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		arr[0]=0;
		arr[1]=1;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		for(int i=2;i<n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
			System.out.print("  "+arr[i]);
		}
		
	}
}