import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class person {
    private String firstName,lastName,hairColor;
    private int age;
    public person(String firstName, String lastName,String hairColor, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hairColor = hairColor;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static ArrayList<person> generateData(){
        String[] firstN = {"david","marco","alex","kasper","Daniel","Joseph","Lasse","Martin","michael","edmond","florent","mikkel","philip","zygimantas"};
        String[] lastN = {"blum","pagh","lind","kebab","falk","borum","hauge","nielsen","lundberg","noga","larsen","mouer"};
        String[] hairColor = {"black","white","brown","coloured","chingchong","eskimo","african-american"};
        ArrayList<person> res = new ArrayList();


        for (int i1= 0;i1<firstN.length;i1++){
            for(int i2 = 0;i2<lastN.length;i2++){
                for(int i3 = 0;i3<hairColor.length;i3++){
                    res.add(new person(firstN[i1],lastN[i2],hairColor[i3],Math.abs(i3*2+i2*3-15)));
                    //System.out.println("i1: "+i1+"    i2: " + i2+"    i3: "+i3);
                }
            }
        }
        return res;
    }
    public static String readFile(String filename) throws IOException {
        StringBuilder builder = new StringBuilder();
        String br = System.lineSeparator();
        Stream<String> stream = Files.lines(Paths.get(filename)).skip(1);
        ArrayList<person> arr = new ArrayList();
        stream.forEach(s -> {
            String[] st = s.split("#;");
            arr.add(new person(st[0],st[1],st[2],Integer.parseInt(st[3])));
        });
        System.out.println(builder.toString());
        return builder.toString();
    }

    @Override
    public String toString() {
        return  firstName + "#;" +
                lastName + "#;" +
                hairColor + "#;" +
                age;
    }
}
