import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Author> {


        public int compare(Author a1, Author a2){

        if(a1.age == a2.age){
            return 0;
        }else if(a1.age > a2.age){
                return 1;
            }else{
            return -1;
        }
    }
}
