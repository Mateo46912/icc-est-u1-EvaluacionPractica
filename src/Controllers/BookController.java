package Controllers;

import Models.Book;

public class BookController {

        // Método para ordenar libros por nombre en orden descendente
    public void sortByName(Book[] books) {
        int tam = books.length;
        for (int i = 0; i< tam -1; i++ ){
            
            for (int j= 0 ; j < tam-1-i; j++){

                if(books[j].getName().compareToIgnoreCase(books[j+1].getName())<0){

                    Book aux = books[j];
                    books[j] = books[j+1];
                    books[j+1] = aux;
                }
            }
        }
    }

    // Método para buscar un libro por nombre, ignorando mayúsculas y minúsculas
    public Book searchByName(Book[] books, String nombre) {
        int bajo = 0;
        int alto =books.length -1;

        while(alto >= bajo){
            int central = (alto + bajo)/2;

            if(books[central].getName().equalsIgnoreCase(nombre)){
                return books[central];
            }

            if (books[central].getName().compareToIgnoreCase(nombre)<0){
                alto = central -1;
            }else{
                bajo = central +1;
            }

        }
        return null;
        
    }
    
}
