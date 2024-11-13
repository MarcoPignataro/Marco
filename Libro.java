public class Libro{
//Definizione attributi
    private String titolo;
    private String autore;
    private float prezzo;
    private int npag;
    private String editore;
    public Libro(String titolo, String autore, float prezzo, int npag, String editore){
        this.autore = autore;
        this.prezzo=prezzo;
        this.npag=npag;
        this.editore=editore;
    }
    public String toString(){
        return String.format("%s\n %s\n %f\n %d\n %s\n", titolo, autore, prezzo, npag, editore);
    }
    public String getAutore(){
        return autore;
    }
}