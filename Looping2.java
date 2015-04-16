import java.util.*;
public class Looping2
{
public static void main (String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("masukkan jumlah angka:");
	int jml=sc.nextInt();
	int bil=0;
	int c=1;
	int total=0;
	int max=0;
	while(c<=jml){
		System.out.print("masukkan angaka ke"+ c +":");
		bil=sc.nextInt();
		total +=bil;
		if(max<bil)
			max=bil;
		c++;
		}
	System.out.println("Total angka = " +total);
	System.out.println("Angka terbesar = " +max);
	
}
}