public class App {
    public static void main(String[] args) {
        KapakArayuz kitapKapak=new KitapKapakUret(new A4boyut(), new MaviRenk());
        kitapKapak.kapaküret();   
        KapakArayuz dergiKapak= new DergiKapakUret(new A5boyut(),new KirmiziRenk());
        dergiKapak.kapaküret(); 
  
    }
}
