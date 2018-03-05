import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class implementationTest2 {


    @Test
    public void getOldestPeople() {
        implementation imp = new implementation();
        ArrayList<person> alp = imp.getOldestPeople();
        assertEquals(alp.size(),14);
        assertEquals(alp.get(0).getFirstName(),"david");
        assertEquals(alp.get(2).getLastName(),"mouer");
        assertEquals(alp.get(5).getAge(),30);
        assertEquals(alp.get(8).getFirstName(),"michael");
    }

    @Test
    public void getYoungestPeople() {
        implementation imp = new implementation();
        ArrayList<person> alp = imp.getYoungestPeople();
        System.out.println(alp.size());
        if(alp.size() > 20){
            assertEquals(alp.get(0).getFirstName(),"david");
            assertEquals(alp.get(15).getLastName(),"pagh");
            assertEquals(alp.get(10).getAge(),0);
            assertEquals(alp.get(5).getFirstName(),"marco");
        }else{
            assertEquals(alp.size(),42);
        }
    }

    @Test
    public void sortByLastName() {
        implementation imp = new implementation();
        ArrayList<person> alp = imp.sortByLastName();
        if(alp.size() > 1000){
            assertEquals(alp.get(0).getFirstName(),"david");
            assertEquals(alp.get(0).getLastName(),"blum");
            assertEquals(alp.get(100).getAge(),4);
            assertEquals(alp.get(1000).getFirstName(),"alex");
            assertEquals(alp.get(1000).getLastName(),"noga");

        }else{
            assertEquals(alp.size(),1176);
        }
    }

    @Test
    public void sortByAge() {
        implementation imp = new implementation();
        ArrayList<person> alp = imp.sortByAge();
        if(alp.size() > 1000){
            assertEquals(alp.get(0).getFirstName(),"david");
            assertEquals(alp.get(0).getLastName(),"pagh");
            assertEquals(alp.get(78).getAge(),1);
            assertEquals(alp.get(112).getFirstName(),"kasper");
            assertEquals(alp.get(785).getLastName(),"noga");

        }else{
            assertEquals(alp.size(),1176);
        }
    }

    @Test
    public void getAverageAge() {
        implementation imp = new implementation();
        assertEquals(imp.getAverageAge(100,200),10);
        assertEquals(imp.getAverageAge(0,1000),10);
        assertEquals(imp.getAverageAge(1000,200),11);
        assertEquals(imp.getAverageAge(10,15),3);
    }

    @Test
    public void calculateCircleArea() {
        implementation imp = new implementation();
        assertEquals(imp.calculateCircleArea(5),78.53);
        assertEquals(imp.calculateCircleArea(-1),-1);
        assertEquals(imp.calculateCircleArea(0),0);
        assertEquals(imp.calculateCircleArea(100),31415.92);
    }

    @Test
    public void divisible() {
        implementation imp = new implementation();
        assertEquals(imp.divisible(6,3),true);
        assertEquals(imp.divisible(-6,-2),true);
        assertEquals(imp.divisible(6,4),false);
    }

    @Test
    public void calculateDifferenceInSeconds() {
        implementation imp = new implementation();
        assertEquals(imp.calculateDifferenceInSeconds("2011-05-04","2011-05-03"),86400);
        assertEquals(imp.calculateDifferenceInSeconds("2011-05-04","2011-06-03"),2592000);
        assertEquals(imp.calculateDifferenceInSeconds("2011-05-04","2012-06-03"),34214400);
    }

    @Test
    public void sumOfNumbers() {
        implementation imp = new implementation();
        assertEquals(imp.sumOfNumbers(new int[]{1, 2, 3, 4, 5}),15);
        assertEquals(imp.sumOfNumbers(new int[]{1, 2, -3, 4, 5}),21);
        assertEquals(imp.sumOfNumbers(new int[]{-1, -2, -3, -4, -5}),55);
        assertEquals(imp.sumOfNumbers(new int[]{}),0);
    }

    @Test
    public void serial() {
        implementation imp = new implementation();
        assertEquals(imp.serial(new int[]{1,2,3,4,5}),5);
        assertEquals(imp.serial(new int[]{1,2,3,6,5,7,1,2,3,4}),4);
        assertEquals(imp.serial(new int[]{7,9,5,8,2,7,6,4}),1);
    }
}