public class AkilliEvFacade {
    private AkilliEvSistemi akilliEvSistemi;

    public AkilliEvFacade(AkilliEvSistemi akilliEvSistemi) {
        this.akilliEvSistemi = akilliEvSistemi;
    }
    public void eviAc(){
        akilliEvSistemi.klimaAc();
        akilliEvSistemi.isikac();
        akilliEvSistemi.kilitAc();
        akilliEvSistemi.tvAc();
    }
    public void eviKapat(){
        akilliEvSistemi.klimaKapat();
        akilliEvSistemi.isikKapat();
        akilliEvSistemi.kapiKilitle();
        akilliEvSistemi.tvKapat();
    }
}
