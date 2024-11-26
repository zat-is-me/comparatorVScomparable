import java.util.Comparator;
import java.util.List;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        int compareId = Integer.compare(o1.getId(),o2.getId());
        int compareName = o1.getName().compareTo(o2.getName());

        int compare = (compareId ==0)? compareName:compareId;

        return compare;
    }
}
