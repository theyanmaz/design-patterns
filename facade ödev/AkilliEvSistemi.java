public class AkilliEvSistemi {
    private İsik isik;
    private TV tv;
    private Kapi kapi;
    private Klima klima;

    public AkilliEvSistemi() {
        isik = new İsik(false, 0);
        tv = new TV(0, 0);
        klima = new Klima();
        kapi = new Kapi();
    }
    public void isikac(){
        isik.ac();
    }
    public void isikKapat(){
        isik.kapat();
    }
    public void tvAc(){
        tv.ac();
    }
    public void tvKapat(){
        tv.kapat();
    }
    public void tvSesAzalt(){
        tv.sesAzalt();
    }
    public void tvSesArtir(){
        tv.sesArtir();
    }
    public void tvKanalAzalt(){
        tv.kanalAzalt();
    }
    public void tvKanalArtir(){
        tv.kanalArtir();

    }
    public void klimaGuncelle(){
        klima.guncelle(0);
    }
    public void klimaAc(){
        klima.ac();
    }
    public void klimaKapat(){
        klima.kapat();
    }
    public void kapiKilitle(){
        kapi.kapiKilitle();
    }
    public void kilitAc(){
        kapi.kapiAc();
    }

}
