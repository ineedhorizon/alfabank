import org.junit.Test;

import java.util.Comparator;

public class ProgramTest {

    public static final String FILE_NAME = "test.txt";

    @Test
    public void sortTest(){
        Sort sort = new Sort();
        sort.print(ClassLoader.getSystemResource(FILE_NAME), Comparator.naturalOrder());
        sort.print(ClassLoader.getSystemResource(FILE_NAME), Comparator.reverseOrder());
    }

    @Test
    public void factorialTest(){
        System.out.println(Factorial.factorial(20));
    }
}
