class Scaffale{
    private String id;
    private Libro[] libri;
    private int nLibri;
    private final int N = 10;
    Scaffale(String id){
        this.id=id;
        libri=new Libro[N];
        nLibri=0;
    }
    public boolean aggiungi(Libro l){
            if(nLibri<N){
                nLibri++;
                return true;
                s+=libri[i].toString()+"\n";
            }
            return false;
    }
    
    public void elencaLibri(){
        System.out.println("scaffale: "+id);
        for(int i=0; i< nLibri; i++){
            System.out.println(libri[i]);
        }
    }
    public void elencaLibri(String autore){
        System.out.println("Ecco tutti i libri con autore: "+autore);
        for(int i=0;i<nLibri; i++){
            if(libri[i].getAutore().equals(autore)){
                System.out.println(libro[i]);
            }
        }
    }
}

