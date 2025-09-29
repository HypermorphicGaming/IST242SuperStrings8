import java.util.ArrayList;
import java.util.Scanner;

public class projectManagement {
    private static ArrayList<ArrayList<String>> library = new ArrayList<>();
    public static ArrayList<ArrayList<String>> loader(){
        ArrayList<String> initialData = new ArrayList<>();
        ArrayList<ArrayList<String>> loadedData= new ArrayList<>();
        // Book 1
        initialData.add("Clean Code"); initialData.add("Robert C. Martin"); initialData.add("2008"); initialData.add("Prentice Hall"); initialData.add("9780132350884");
        loadedData.add(initialData); initialData.clear();
        
        // Book 2
        initialData.add("Effective Java"); initialData.add("Joshua Bloch"); initialData.add("2018"); initialData.add("Addison-Wesley"); initialData.add("9780134685991");
        loadedData.add(initialData); initialData.clear();
        
        // Book 3
        initialData.add("Introduction to Algorithms"); initialData.add("Cormen, Leiserson, Rivest, Stein"); initialData.add("2009"); initialData.add("MIT Press"); initialData.add("9780262033848");
        loadedData.add(initialData); initialData.clear();
        
        // Book 4
        initialData.add("Design Patterns"); initialData.add("Gamma, Helm, Johnson, Vlissides"); initialData.add("1994"); initialData.add("Addison-Wesley"); initialData.add("9780201633610");
        loadedData.add(initialData); initialData.clear();
        
        // Book 5
        initialData.add("Head First Java"); initialData.add("Kathy Sierra, Bert Bates"); initialData.add("2005"); initialData.add("O'Reilly"); initialData.add("9780596009205");
        loadedData.add(initialData); initialData.clear();
        
        // Book 6
        initialData.add("Java Concurrency in Practice"); initialData.add("Goetz et al."); initialData.add("2006"); initialData.add("Addison-Wesley"); initialData.add("9780321349606");
        loadedData.add(initialData); initialData.clear();
        return loadedData;
    }

//    public static void listBooks(){
//        for(ArrayList<String> book : library){
//            System.out.println(book.get(0) + " | " + book.get(1) + " | " + book.get(2)
//            + " | " + book.get(3) + "ISBN: " + book.get(4));
//        }
//    }

//    public static void searchByTitle(Scanner scnr){
//        scnr.nextLine();
//        System.out.print("Search by title: ");
//        String title = scnr.nextLine().toLowerCase();
//
//        for(ArrayList <String> book : library){
//            if(book.get(0).toLowerCase().contains(title)){
//                System.out.println(book.get(0) + " | " + book.get(1) + " | " + book.get(2)
//                + " | " + book.get(3) + "ISBN: " + book.get(4));
//            }
//        }
//    }

//    public static void searchByAuthor(Scanner scnr){
//        scnr.nextLine();
//        System.out.print("Search by author: ");
//        String author = scnr.nextLine().toLowerCase();
//
//        for(ArrayList <String> book : library){
//            if(book.get(1).toLowerCase().contains(author)){
//                System.out.println(book.get(0) + " | " + book.get(1) + " | " + book.get(2)
//                + " | " + book.get(3) + "ISBN: " + book.get(4));
//            }
//        }
//    }

    public static void main(String[] args) {
        library = loader();
        Scanner scnr = new Scanner(System.in);
        System.out.println("===Menu===\n1) List all books \n2) Search by title \n3) Search by author \n4) Add a book" +
        "\n5) Update publisher (by ISBN) \n6) Delete book (by ISBN) \n7) Show statistics (earliest/latest publication year; count of books by publisher)\n0) Exit");
        int userInput = scnr.nextInt();
        do{
            switch(userInput){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
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
