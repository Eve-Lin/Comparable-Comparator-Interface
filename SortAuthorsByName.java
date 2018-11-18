import java.util.ArrayList;
import java.util.Collections;

public class SortAuthorsByName {

    public static void main(String[] args) {

        ArrayList <Author> al = new ArrayList<Author>();

        al.add(new Author("Eric", "Weiner", "The Geography Of Bliss", 57));
        al.add(new Author("Henryk", "Sienkiewicz", "Quo Vadis", 56));
        al.add(new Author("Anna", "Sewell","Black Beauty",55));

        Collections.sort(al);

        for(Author str:al){
            System.out.println(str.lastName + " / " + str.firstName + " / " + str.book + " / " + str.age);

        }
    }
}
