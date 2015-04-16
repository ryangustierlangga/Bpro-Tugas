import java.io.*;

public class TiketPesawat
{
 public static void main (String []args) throws IOException 
 { BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  
  int[] ekonomi =  {10,11,12,13,14};
  int[] bisnis =  {6,7,8,9};
  int[] eksekutif =  {3,4,5};
  int[] vip =  {1,2};
  int [] tiket = new int [4];
  int [] jmlPesanan = new int [4];
  int[] total = new int [4];
  int totalOmset = 0;
  int pil = 0;
  
  do 
  {
   System.out.println("=================================================");
   System.out.println("        Penjualan Tiket Pesawat Terbang          ");
   System.out.println("=================================================");
   System.out.println("1. Penjualan tiket");
   System.out.println("2. Lihat daftar kursi yang kosong");
   System.out.println("3. Lihat daftar kursi yang terisi");
   System.out.println("4. Lihat semua daftar kursi");
   System.out.println("5. Lihat rekap kursi");
   System.out.println("6. Lihat Semua Total Pembayaran");
   System.out.println("7. Exit");
   System.out.print("MASUKKAN NO PILIHAN ANDA (1-7): ");
   pil = Integer.parseInt(br.readLine());
   
  
    switch(pil)
    {
     case 1:
     tiket[0] = 100000;
     tiket[1] = 150000;
     tiket[2] = 225000;
     tiket[3] = 393750;
     
      System.out.println();
      System.out.println("===============");
      System.out.println("penjualan tiket");
      System.out.println("===============");
      System.out.println();
     do
     {
      System.out.println("pilih tiket yang akan dipesan");
      System.out.println("-----------------------------");
      System.out.println("1.ekonomi  ");
      System.out.println("2.bisnis  ");
      System.out.println("3.eksekutif ");
      System.out.println("4.vip   ");
      System.out.print("MASUKKAN NO PILIHAN ANDA (1-4) : ");
      pil = Integer.parseInt(br.readLine());
      
      if(pil ==1)
      { 
       System.out.println();
       System.out.println("HARGA :Rp." + tiket[0]);
       System.out.println("Kursi Yang Tersedia Hanya 5");
       System.out.print("MASUKKAN JUMLAH PESANAN : ");
       jmlPesanan[0] = Integer.parseInt(br.readLine());
       if (jmlPesanan[0]<=5)
       {
        total[0] = tiket[0]*jmlPesanan[0];
        System.out.println("SUB TOTAL =" + total[0]);
        System.out.println();
       }
       else
       {
        System.out.println("kursi Sudah penuh");
        System.out.println();
       }
      }
      
      if(pil ==2)
      {
       System.out.println();
       System.out.println("HARGA :Rp." + tiket[1]);
       System.out.println("Kursi Yang Tersedia Hanya 4");
       System.out.print("MASUKKAN JUMLAH PESANAN : ");
       jmlPesanan[1] = Integer.parseInt(br.readLine());
       if (jmlPesanan[1]<=4)
       {
        total[1] = tiket[1]*jmlPesanan[1];
        System.out.println("SUB TOTAL =" + total[1]);
        System.out.println();
       }
       else
       { 
        System.out.println("kursi sudah penuh");
        System.out.println();
       }
       
      }
      
      if(pil ==3)
      {
       System.out.println();
       System.out.println("HARGA :Rp." + tiket[2]);
       System.out.println("Kursi Yang Tersedia Hanya 3");
       System.out.print("MASUKKAN JUMLAH PESANAN : ");
       jmlPesanan[2] = Integer.parseInt(br.readLine());
       if (jmlPesanan[2]<=3)
       {
        total[2] = tiket[2]*jmlPesanan[2];
        System.out.println("SUB TOTAL =" + total[2]);
        System.out.println();
       }
       else
       {
        System.out.println("kursi sudah penuh");
        System.out.println();
       }
      
      }
      
      if(pil ==4)
      {
       System.out.println();
       System.out.println("HARGA :Rp." + tiket[3]);
       System.out.println("Kursi Yang Tersedia Hanya 2");
       System.out.print("MASUKKAN JUMLAH PESANAN : ");
       jmlPesanan[3] = Integer.parseInt(br.readLine());
       if (jmlPesanan[3]<=2)
       {
        total[3] = tiket[3]*jmlPesanan[3];
        System.out.println("SUB TOTAL =" + total[3]);
        System.out.println();
       }
       else
       {
        System.out.println("kursi sudah penuh");
        System.out.println();
       }
       
      }
     
     }while(pil<4);
     
     System.out.println();
     break;
     
     case 2:
     
     System.out.println();
     System.out.println("=============================");
     System.out.println("view daftar kursi yang kosong");
     System.out.println("=============================");
     System.out.print("Jumlah Kursi Ekonomi yang Kosong : ");
      if (jmlPesanan[0]<=5)
       {
        System.out.println(5-jmlPesanan[0]);
       }
       else
       {
        System.out.println(5);
       }
    
     System.out.print("Jumlah Kursi Bisnis yang Kosong : ");
      if (jmlPesanan[1]<=4)
       {
        System.out.println(4-jmlPesanan[1]);
       }
       else
       {
        System.out.println(4);
       }
     System.out.print("Jumlah Kursi Exe yang Kosong : ");
      if (jmlPesanan[2]<=3)
       {
        System.out.println(3-jmlPesanan[2]);
       }
       else
       {
        System.out.println(3);
       }
     System.out.print("Jumlah Kursi Vip yang Kosong : ");
      if (jmlPesanan[3]<=2)
       {
        System.out.println(2-jmlPesanan[3]);
       }
       else
       {
        System.out.println(2);
       }
     System.out.println();
     break;
     
     case 3:
     System.out.println();
     System.out.println("=============================");
     System.out.println("view daftar kursi yang terisi");
     System.out.println("=============================");
     System.out.println("Jumlah Kursi Ekonomi yang Terisi : " +(jmlPesanan[0]));
     System.out.println("Jumlah Kursi Bisnis yang Terisi : " +(jmlPesanan[1]));
     System.out.println("Jumlah Kursi Eksekutif yang Terisi : " +(jmlPesanan[2]));
     System.out.println("Jumlah Kursi VIP yang Terisi : " +(jmlPesanan[3]));
     System.out.println();
     break;
     
    
     case 4:
     System.out.println();
     System.out.println("=======================");
     System.out.println("view semua daftar kursi");
     System.out.println("=======================");
     System.out.println("Kelas Ekonomi  ==> Dipesan : " +jmlPesanan[0]+ " Harga : Rp " +tiket[0]);
     System.out.println("Kelas Bisnis  ==> Dipesan : " +jmlPesanan[1]+ " Harga : Rp " +tiket[1]);
     System.out.println("Kelas Eksekutif ==> Dipesan : " +jmlPesanan[2]+ " Harga : Rp " +tiket[2]);
     System.out.println("Kelas VIP  ==> Dipesan : " +jmlPesanan[3]+ " Harga : Rp " +tiket[3]);
     System.out.println();
     break;
     
    
     case 5:
     System.out.println();
     System.out.println("================");
     System.out.println("view rekap kursi");
     System.out.println("================");
     System.out.println();
     break;
    
     case 6:
     System.out.println();
     System.out.println("==========");
     System.out.println("Lihat Total Pembayaran");
     System.out.println("==========");
     System.out.println();
     System.out.println("kursi yang terjual pada kelas ekonomi : " + jmlPesanan[0] + " ==> dengan total omset : Rp " + total[0] );
     System.out.println("kursi yang terjual pada kelas bisnis : " + jmlPesanan[1] + " ==> dengan total omset : Rp " + total[1] );
     System.out.println("kursi yang terjual pada kelas eksekutif : " + jmlPesanan[2] + " ==> dengan total omset : Rp " + total[2] );
     System.out.println("kursi yang terjual pada kelas vip : " + jmlPesanan[3] + " ==> dengan total omset : Rp " + total[3] );
     totalOmset = total[0]+total[1]+total[2]+total[3];
     System.out.println("total omset seluruh kelas : Rp " + totalOmset );
     System.out.println();
     break;
     
    default: break;
   }   
  }
  while(pil<7);
 }
}