public class Libro{
    private String titolo;
    private String autore;
    private float prezzo;
    private int npag;
    private String editore;
    private Scaffale collocazione;
    public Libro(String titolo, String autore, float prezzo, int npag, String editore){
        this.titolo=titolo;
        this.autore=autore;
        this.prezzo=prezzo;
        this.npag=npag;
        this.editore=editore;
    }
    public String toString(){
        return String.format("%s %s %f %d %s", titolo,autore,prezzo,npag,editore)+collocazione;
    }
    public void setCollocazione(Scaffale s){
        collocazione=s;
    }
}