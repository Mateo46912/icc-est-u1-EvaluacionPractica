package Views;
import Models.Book;


public class ShowConsole {
    
    public void PrintPersons(Book[] books){

        for (Book book : books){
            System.out.println(book);

        }
    }

    public void ShowMessage(String message){
        System.out.println(message);
    }

}
