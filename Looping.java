import java.util.*;
public class Looping
{
	public static void main (String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Masukkan looping awal:");
	int awal=sc.nextInt();
	System.out.print("Masukkan looping akhir:");
	int jml=sc.nextInt();
	int c=awal;
		while(c<=jml){
		System.out.println(c);
		c++;
	}
}
}