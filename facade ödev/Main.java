public class Main {
    public static void main(String[] args) {
        AkilliEvSistemi akilliEvSistemi=new AkilliEvSistemi();
        AkilliEvFacade akilliEvFacade=new AkilliEvFacade(akilliEvSistemi);
        akilliEvFacade.eviAc();
        akilliEvFacade.eviKapat();

    }
}
