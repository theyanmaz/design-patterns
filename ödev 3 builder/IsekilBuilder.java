public interface IsekilBuilder {
    public IsekilBuilder setSekilKenarSayisi(int kenar);

    public IsekilBuilder setSekilKenarUzunluk(int uzunluk);

    public IsekilBuilder setSekilKenarKalinlik(int kalinlik);

    public IsekilBuilder setSekilBaslangicKonum(int x);

    public IsekilBuilder setSekilKenarRengi(String mavi);

    public IsekilBuilder setSekilİcRenk(String sari);

    public Sekil build();

}
