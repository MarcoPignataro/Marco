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
        for(int i=o;i<nLibri;i++){
            if(libri[i].getAutore().equals(autore)){
                s+=libri[i].toString()+"\n";
            }
        
        }
    }
    
    public void elencaLibri(String autore){
        String s=new String();
        for(int i=0; i<nLibri;i++){
            if(libro[i].getPrezzo()>da&&libri[i].getPrezzo()<=a){
                s+=libri[i].toString()+"\n";
            }    
        }
  }
    public String toString(){
        return String.format("ID scaffale:%s\n",id);
    }
}
