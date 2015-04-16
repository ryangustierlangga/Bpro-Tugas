import java.util.*;
public class MenuKantin 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		boolean Selesai = false;
		int jumlah=0;
		int nasi=0;
		int soto=0;
		int mie=0;
		int goreng=0;
		int Total=0;
		
		do{
			System.out.println ("");
			System.out.println ("==========================");
			System.out.println ("=== DAFTAR MENU KANTIN ===");
			System.out.println ("==========================");
			System.out.println ("");
			System.out.println ("1. NASI GORENG");
			System.out.println ("2. SOTO AYAM");
			System.out.println ("3. MIE AYAM SPECIAL");
			System.out.println ("4. MIE GORENG");
			System.out.println ("5. KASIR");
			System.out.print ("Pilih pilihan [1-5] : ");
			int piluser = sc.nextInt();
			
			if (piluser == 1)
				{
					System.out.println ("");
					System.out.println ("========== NASI GORENG ============");
						nasi = 10000;
					System.out.println ("Harga NASI GORENG : Rp." + nasi +" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah NASI GORENG yang akan anda pesan : ");
						jumlah = sc.nextInt();
						Total=jumlah*nasi;
					System.out.println("Total yang harus dibayar :Rp. "+ Total);
					System.out.println ("");
					
				}	
				
			if (piluser == 2)
				{
					System.out.println ("");
					System.out.println ("========== SOTO AYAM ============");
						soto = 13000;
					System.out.println ("Harga SOTO AYAM : Rp." + soto+" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah SOTO AYAM yang akan anda pesan : ");
						jumlah = sc.nextInt();
						Total=jumlah*soto;
					System.out.println("Total yang harus dibayar :Rp. "+ Total);
					System.out.println ("");
					
				}	
				
			if (piluser == 3)
				{
					System.out.println ("");
					System.out.println ("========== MIE AYAM SPECIAL ============");
						mie = 8000;
					System.out.println ("Harga SOTO AYAM : Rp." + mie+" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah MIE AYAM SPECIAL yang akan anda pesan : ");
						jumlah = sc.nextInt();
						Total=jumlah*mie;
					System.out.println("Total yang harus dibayar :Rp. "+ Total);
					System.out.println ("");
					
				}	
			
			if (piluser == 4)
				{
					System.out.println ("");
					System.out.println ("========== MIE GORENG ============");
						goreng = 10000;
					System.out.println ("Harga MIE GORENG : Rp." + goreng+" /porsi");
					System.out.println ("");
					System.out.print ("Masukan jumlah MIE GORENG yang akan anda pesan : ");
						jumlah = sc.nextInt();
						Total=jumlah*goreng;
					System.out.println("Total yang harus dibayar :Rp. "+ Total);
					System.out.println ("");
					
				}	
			
		    if (piluser == 5)
				{
					System.out.println ("");
					System.out.println ("===================================");
					System.out.println ("============== KASIR ==============");
					System.out.println ("===================================");
					Total=(jumlah*nasi)+(jumlah*soto)+(jumlah*mie)+(jumlah*goreng);
					System.out.println ("");
					System.out.println (" MAKANAN YANG ANDA PESAN :");
					System.out.println (" 1. NASI GORENG = " + (jumlah*nasi));
					System.out.println (" 2. SOTO AYAM = " + (jumlah*soto));
					System.out.println (" 3. MIE AYAM = " + (jumlah*mie));
					System.out.println (" 4. MIE GORENG = " + (jumlah*goreng));
					System.out.println ("");
					System.out.println ("TOTAL KESELURUHAN = Rp." + Total);
					Selesai = true;
				}
			
		  } while (!Selesai);
				
	}

}