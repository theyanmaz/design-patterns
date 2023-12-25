public class SekilBuilder implements IsekilBuilder{

    private Sekil sekil;

    public SekilBuilder() {
        this.sekil=new Sekil();
    }

    @Override
    public IsekilBuilder setSekilKenarSayisi(int kenar) {
        this.sekil.setKenarSayisi(kenar);
        return this;
    }

    @Override
    public IsekilBuilder setSekilKenarUzunluk(int uzunluk) {
        this.sekil.setKenarUzunluk(uzunluk);
        return this;
    }

    @Override
    public IsekilBuilder setSekilKenarKalinlik(int kalinlik) {
        this.sekil.setKenarKalinlik(kalinlik);
        return this;
    }

    @Override
    public Sekil build() {
        return this.sekil;
    }

    @Override
    public IsekilBuilder setSekilBaslangicKonum(int x) {
        this.sekil.setBaslangicKonum(x);
        return this;
    }

    @Override
    public IsekilBuilder setSekilKenarRengi(String mavi) {
        this.sekil.setKenarRengi(mavi);
        return this;
    }

    @Override
    public IsekilBuilder setSekilİcRenk(String sari) {
        this.sekil.setIcRenk(sari);
        return this;


    }
    
}
