import java.util.ArrayList;
import java.util.Collections;

public class SortingProgram {

    public static void main(String[] args) {

        ArrayList<Author> al = new ArrayList<Author>();

        al.add(new Author("Eric", "Weiner", "The Geography Of Bliss", 55));
        al.add(new Author("Henryk", "Sienkiewicz", "Quo Vadis", 56));
        al.add(new Author("Anna", "Sewell","Black Beauty",57));


        Collections.sort(al, new AuthorAgeComparator());
        for(Author str:al){
            System.out.println(str.lastName + " / " + str.firstName + " / " + str.book + " / " + str.age);

        }
        System.out.println();
        Collections.sort(al, new BookNameComparator());
        for(Author str:al){
            System.out.println(str.lastName + " / " + str.firstName + " / " + str.book + " / " + str.age);

        }

    }
}
