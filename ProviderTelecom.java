import java.time.LocalDateTime;

public class ProviderTelecom {
   String name;
   int mobileBalance;
   int mobileData;
   int mobileDataLimit;
   LocalDateTime expiredCard;
   LocalDateTime expiredMobileData;

   public ProviderTelecom(){
    this.name = "Telkomsel";
    this.mobileBalance = 10000;
    this.mobileData = 25;
   }

   public void getInfo(){
    System.out.println("Ini adalah informasi kartumu yaa");

   }
    public void tambahpulsa(int a){
    mobileBalance = a;
    System.out.println("Pulsa Anda bertambah " + a + "Rupiah");

    }
    public void kurangipulsa(int a){
        System.out.println("Pulsa Anda dikurangi " + a + "Rupiah");
        mobileBalance =mobileBalance - a;
        System.out.println("sisa pulsa Anda " + mobileBalance + "Rupiah");
   }
   public void tambahkuota(int a){
    mobileData= a;
    System.out.println("kuota Anda ditambah " + a + "GB");

   }
   public void kurangikuota(int a){
    mobileData= a;
    System.out.println("kuota Anda dikurangi " + a + "GB");

    mobileData =mobileData - a;
    System.out.println("sisa kuota Anda " + mobileData + "GB");
}
}
