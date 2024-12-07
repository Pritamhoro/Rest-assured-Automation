
public class main {

	public static void main(String[] args)
	{
		int[] a=new int[] {10,-5,30};
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		
		/*for each loop
		for(data type variable : array/collection)
		*/
		
		for(int i:a) 
		{
			System.out.println(i);
		}
	}

}
