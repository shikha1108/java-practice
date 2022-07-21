package algo;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        Students shikha = new Students();
        shikha.name = "Shikha";
        shikha.numbers = 90;
        students.add(shikha);

        Students pankaj = new Students();
        pankaj.name = "Pankaj";
        pankaj.numbers = 99;
        students.add(pankaj);

        Students ani = new Students();
        ani.name = "Ani";
        ani.numbers = 93;
        students.add(ani);

        Students anu = new Students();
        anu.name = "Anu";
        anu.numbers = 70;
        students.add(anu);

        Students lucky = new Students();
        lucky.name = "Lucky";
        lucky.numbers = 85;
        students.add(lucky);
        Students result = topper(students);
        System.out.println(result.name);

    }
    private static Students topper(List<Students> st){
        Students topper = st.get(0);
        for (Students students : st) {
            if(students.numbers > topper.numbers ) {
                topper = students;
            }
        }
        return topper;
    }
}
