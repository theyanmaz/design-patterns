public class SekilDirector {
    IsekilBuilder builder;

    public SekilDirector(IsekilBuilder builder) {
        //this.builder = builder;
        this.builder=new SekilBuilder();
    }


    public Sekil olustur(){
        Sekil sekil = builder.setSekilKenarKalinlik(5).setSekilKenarUzunluk(10).setSekilKenarSayisi(4).build();
        return sekil;

    }
}
