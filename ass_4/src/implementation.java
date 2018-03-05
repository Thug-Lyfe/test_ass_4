import java.time.LocalDate;
import java.util.*;

import static java.time.temporal.ChronoUnit.DAYS;


public class implementation implements HandleInterface {
    ArrayList<person> arr = person.generateData();


    @Override
    public ArrayList<person> getOldestPeople() {
        ArrayList<person> oldest = new ArrayList<person>();
        int currentAge = 0;
        for (int i = 0; i < arr.size(); i++) {
            person cp = arr.get(i);
            if (cp.getAge() > currentAge) {
                oldest = new ArrayList<person>();
                oldest.add(arr.get(i));
                currentAge = cp.getAge();
            } else if (cp.getAge() == currentAge) {
                oldest.add(arr.get(i));
            }
        }
        return oldest;
    }

    @Override
    public ArrayList<person> getYoungestPeople() {
        ArrayList<person> youngest = new ArrayList<person>();
        int currentAge = 100;
        for (int i = 0; i < arr.size(); i++) {
            person cp = arr.get(i);
            if (cp.getAge() < currentAge) {
                youngest = new ArrayList<person>();
                youngest.add(arr.get(i));
                currentAge = cp.getAge();
            } else if (cp.getAge() == currentAge) {
                youngest.add(arr.get(i));
            }
        }
        return youngest;
    }

    @Override
    public ArrayList<person> sortByLastName() {
        ArrayList<person> sorted = arr;
        Collections.sort(sorted, new Comparator<person>() {
            public int compare(person o1, person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return sorted;
    }

    @Override
    public ArrayList<person> sortByAge() {
        ArrayList<person> sorted = arr;
        Collections.sort(sorted, new Comparator<person>() {
            public int compare(person o1, person o2) {

                return o1.getAge() - o2.getAge();
            }
        });
        return sorted;
    }

    @Override
    public int getAverageAge(int start,int number) {
        int sum = 0;
        int temp = 0;
        for (int i = start; i < start+number; i++) {
            if(i < arr.size()) {
                sum += arr.get(i).getAge();
            }else{
                temp++;
            }
        }
        System.out.println(number+"  :  "+temp);
        return sum / (number-temp);
    }

    @Override
    public double calculateCircleArea(int radius) {
        if(radius < 0){
            return -1;
        }
        return Math.floor(Math.PI * radius * radius*100)/100;
    }

    @Override
    public boolean divisible(int number, int divisor) {
        if (number % divisor == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int calculateDifferenceInSeconds(String date1, String date2) {
        String[] d1 = date1.split("-");
        String[] d2 = date2.split("-");
        LocalDate nd1 = LocalDate.of(Integer.parseInt(d1[0]), Integer.parseInt(d1[1]), Integer.parseInt(d1[2]));
        LocalDate nd2 = LocalDate.of(Integer.parseInt(d2[0]), Integer.parseInt(d2[1]), Integer.parseInt(d2[2]));
        return Math.abs(Math.toIntExact(DAYS.between(nd1, nd2)) * 86400);
    }

    @Override
    public int sumOfNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum += numbers[i] * numbers[i];
            } else {
                sum += numbers[i];
            }
        }
        return sum;
    }

    @Override
    public int serial(int[] numbers) {
        int best = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean serial = true;
            int thisTry = 0;
            while (serial) {
                if (i+thisTry+1 < numbers.length && numbers[i] + 1 + thisTry == numbers[i + 1 + thisTry]) {
                    thisTry++;
                } else {
                    if (thisTry > best) {
                        best = thisTry;
                    }
                    serial = false;
                }
            }
        }
        return best+1;
    }
}
