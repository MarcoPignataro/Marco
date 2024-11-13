import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner tastiera =new Scanner(System.in);
        int scelta;
        Scaffale scaffale =new Scaffale("01");
        do{
            menu();
            System.out.println("Inserisci scelta: ");
            scelta = tastiera.nextInt();
            tastiera.nextLine();
            switch(scelta){
                case 1:
                    System.out.println("Scrivi il titolo del libro"); 
                    String titolo = tastiera.nextLine();

                    System.out.println("Inserisci l'autore"); String autore = tastiera.nextLine();

                    System.out.println("Inserisci il prezzo");
                    float prezzo = tastiera.nextFloat();
                
                    System.out.println("Inserisci il numero di pagine"); 
                    int npag=tastiera.nextInt();
                    tastiera.nextLine();

                    System.out.println("Inserisci l'editore");
                    String editore = tastiera.nextLine();

                    Libro libro = new Libro(titolo, autore, prezzo, npag, editore);
                    scaffale.aggiungi (libro);
                    break;
                case 2:
                    autore=tastiera.nextLine();
                    scaffale.elencaLibri(autore);
                    System.out.println("\n");
                case 3:
                    scaffale.elencaLibri();
                case 0:
                    break;
                default:
                    System.out.println("Scelta errata, riprova");
                    break;
            
            }
        }while(scelta !=0);
    }
    private static void menu(){
        System.out.println("------------");
        System.out.println("1) Inserisci il libro");
        System.out.println("2) Inserisci il libro per autore");
        System.out.println("3) Elenca libri");
        System.out.println("0. Uscita");
        System.out.println("------------");
    }
}