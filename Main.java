class Main{
    public static void main(String args[]){
        Scaffale scaffale=new Scaffale("scaffale A");
        Libro libro1=new Libro("The Wolf","Jordan Belfort",20f,519,"Bantam Books");
        Libro libro2=new Libro("Io Robot","Isaac Asimov",11.90f,252,"Mondadori");
        Libro libro3=new Libro("Harry Potter e la pietra filosofale","J.K. Rowling",8.50f,320,"Salani");
        Libro libro4=new Libro("Il Nido","Kenneth Oppel",9.35f,252,"Feltrinelli");
        Libro libro5=new Libro("Il Decameron","Giovanni Boccaccio",15.30f,1851,"Rizzoli");
        scaffale.aggiungi(libro1);
        scaffale.aggiungi(libro2);
        scaffale.aggiungi(libro3);
        scaffale.aggiungi(libro4);
        scaffale.aggiungi(libro5);
        scaffale.elencaLibri();
    }
}