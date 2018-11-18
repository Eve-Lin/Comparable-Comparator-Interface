public class Author implements Comparable<Author> {


    String firstName;
    String lastName;
    String book;
    int age;

    Author(String first, String last, String book, int age){

        this.firstName = first;
        this.lastName = last;
        this.book = book;
        this.age = age;
    }

    public int compareTo(Author au){

        int last = this.lastName.compareTo(au.lastName);
        return last;
    }
}
