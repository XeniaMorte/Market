import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Tex tex = new Tex();
        tex.addToQueu("123456789");
        tex.addToQueu("123456789");
        System.out.println(tex);

        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if ((i % 2 == 0) && (j % 2 != 0)|| (i%2!=0&& j%2==0)) {
                    biDemArrList.get(i).add(j, "█");
                } else {
                    biDemArrList.get(i).add(j, "□");
                }
            }
        }
        for (int i = 0; i < 8; i++) {

            System.out.println();
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }

        }

    }
}