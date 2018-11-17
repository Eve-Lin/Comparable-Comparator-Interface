 import java.util.*;

    public class ArrayListOfObject {

        public static void main(String args[]){
            ArrayList<Student> arraylist = new ArrayList<Student>();
            arraylist.add(new Student(223, "Karl", 33));
            arraylist.add(new Student(245, "Myriam", 30));
            arraylist.add(new Student(209, "Tom", 28));

            Collections.sort(arraylist);

            for(Student str: arraylist){
                System.out.println(str);
            }
        }
    }


