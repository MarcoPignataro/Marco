public class Armadio{
    private String id;
    private Scaffale[] scaffali;
    private final int MAX_SCAFFALI=5;
    private int nScaffali;
    
    public Armadio (String id){
        this.id=id;
        scaffali=new Scaffale[MAX_SCAFFALI];
        nScaffali=0;
    }
    
    public boolean aggiungiScaffali(Scaffale1){
        if(nScaffali< MAX_SCAFFALI){
            scaffali[nScaffali]=1;
            nScaffali++;
            return true;
        }
        return false;
    }
    
    public void elencaScaffali(){
        System.out.println("Ecco tutti gli scaffali nell'Armadio"+id);
        for(int i=0; i< nScaffali; i++){
            System.out.println(scaffali[i]);
        }
    }
}

