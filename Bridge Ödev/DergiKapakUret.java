public class DergiKapakUret implements KapakArayuz {
    private BoyutArayuz by;
    private RenkArayuz ry;
    public DergiKapakUret(BoyutArayuz by, RenkArayuz ry) {
        this.by = by;
        this.ry = ry;
    }
    @Override
    public void kapaküret() {
        by.boyutAyarla();
        ry.boya();
        System.out.println("DERGİ KAPAGİ ÜRETİLDİ");
    }
    
}
