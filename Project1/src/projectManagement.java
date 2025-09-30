import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class projectManagement {
    private static ArrayList<ArrayList<String>> library = new ArrayList<>();
    public static void loader(){
        ArrayList<String> initialData = new ArrayList<>();
        //ArrayList<ArrayList<String>> loadedData= new ArrayList<>();
        // Book 1
        ArrayList<String> book1 = new ArrayList<>();
        book1.add("Clean Code"); 
        book1.add("Robert C. Martin"); 
        book1.add("2008"); 
        book1.add("Prentice Hall"); 
        book1.add("9780132350884");
        library.add(book1);
        
        // Book 2
        ArrayList<String> book2 = new ArrayList<>();
        book2.add("Effective Java"); 
        book2.add("Joshua Bloch"); 
        book2.add("2018"); 
        book2.add("Addison-Wesley"); 
        book2.add("9780134685991");
        library.add(book2);
        
        // Book 3
        ArrayList<String> book3 = new ArrayList<>();
        book3.add("Introduction to Algorithms"); 
        book3.add("Cormen, Leiserson, Rivest, Stein"); 
        book3.add("2009"); 
        book3.add("MIT Press"); 
        book3.add("9780262033848");
        library.add(book3);
        
        // Book 4
        ArrayList<String> book4 = new ArrayList<>();
        book4.add("Design Patterns"); 
        book4.add("Gamma, Helm, Johnson, Vlissides"); 
        book4.add("1994"); 
        book4.add("Addison-Wesley"); 
        book4.add("9780201633610");
        library.add(book4);
        
        // Book 5
        ArrayList<String> book5 = new ArrayList<>();
        book5.add("Head First Java"); 
        book5.add("Kathy Sierra, Bert Bates"); 
        book5.add("2005"); 
        book5.add("O'Reilly"); 
        book5.add("9780596009205");
        library.add(book5);
        
        // Book 6
        ArrayList<String> book6 = new ArrayList<>();
        book6.add("Java Concurrency in Practice"); 
        book6.add("Goetz et al."); 
        book6.add("2006"); 
        book6.add("Addison-Wesley"); 
        book6.add("9780321349606");
        library.add(book6);
    }

   public static void listBooks(){
        for (ArrayList<String> row : library) {
            for (String element : row) {
                if (row.indexOf(element)!=4){
                    System.out.print(element + " | ");
                } else{
                    System.out.print(element);
                }
            }
            System.out.println();
        }
   }

    public static void searchByTitle(){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Search by title: ");
        String title = scnr.nextLine().toLowerCase();

        for(ArrayList <String> book : library){
            if(book.get(0).toLowerCase().contains(title)){
                System.out.println(book.get(0) + " | " + book.get(1) + " | " + book.get(2)
                + " | " + book.get(3) + " | ISBN: " + book.get(4));
            }
        }
    }

    public static void searchByAuthor(){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Search by author: ");
        String author = scnr.nextLine().toLowerCase();

        for(ArrayList <String> book : library){
            if(book.get(1).toLowerCase().contains(author)){
                System.out.println(book.get(0) + " | " + book.get(1) + " | " + book.get(2)
                + " | " + book.get(3) + "ISBN: " + book.get(4));
            }
        }
    }

    public static void addBook(){

    }

    public static void updatePublisher(){

    }

    public static void deleteBook(){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the book's ISBN: ");
        String isbn = scnr.nextLine();

        for(int i = 0; i < library.size(); i++){
            ArrayList<String> book = library.get(i);
            if(book.get(4).equals(isbn)){
                library.remove(i);
                break;
            }
        }

    }

    public static void showStatistics(){
        int minYear, latestYear;
        minYear = Integer.parseInt(library.get(0).get(2));
        latestYear = Integer.parseInt(library.get(0).get(2));
        for(ArrayList<String> publishYear : library){

            if (Integer.parseInt(publishYear.get(2))<minYear){
                minYear = Integer.parseInt(publishYear.get(2));
            };
        }
        for(ArrayList<String> publishYear : library){
            if (Integer.parseInt(publishYear.get(2))>latestYear){
                latestYear = Integer.parseInt(publishYear.get(2));
            }
        }
        System.out.println("Earliest Year: " + minYear + " | Latest Year: " + latestYear);
        System.out.println("Counts by publisher: ");
        Map<String, Integer> publisherCount = new HashMap<>();
        for (ArrayList<String> row : library) {
            String name = row.get(3);
            publisherCount.put(name, publisherCount.getOrDefault(name, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : publisherCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }




    public static void main(String[] args) {
        loader();
        Scanner scnr = new Scanner(System.in);
        
        int userInput;
        do{
            System.out.println("===Menu===\n1) List all books \n2) Search by title \n3) Search by author \n4) Add a book" +
        "\n5) Update publisher (by ISBN) \n6) Delete book (by ISBN) \n7) Show statistics (earliest/latest publication year; count of books by publisher)\n0) Exit");
            userInput = scnr.nextInt();
            switch(userInput){
                case 1:
                    listBooks();
                    break;
                case 2:
                    searchByTitle();
                    break;
                case 3:
                    searchByAuthor();
                    break;
                case 4:
                    userInput = -1;
                    break;
                case 5:
                    break;
                case 6:
                    deleteBook();
                    break;
                case 7:
                    showStatistics();
                    break;
                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Error! Input not recognized. Try again!");
            }
        } while(userInput!=0);
    }
}
