public class KitapKapakUret implements KapakArayuz {
    private BoyutArayuz by;
    private RenkArayuz ry;
    public KitapKapakUret(BoyutArayuz by, RenkArayuz ry) {
        this.by = by;
        this.ry = ry;
    }

    @Override
    public void kapaküret() {
        by.boyutAyarla();
        ry.boya();
        System.out.println("Kitap kapagi üretildi.");
    }
    
}
