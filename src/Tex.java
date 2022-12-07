import java.util.ArrayDeque;

public class Tex {
    public ArrayDeque<String> o1 = new ArrayDeque<>(5);
    public ArrayDeque<String> o2 = new ArrayDeque<>(5);


    Tex() {
        addToQueu("S");
        addToQueu("k");
        addToQueu("q");

        addToQueu("p");
        addToQueu("k");
        addToQueu("i");
        addToQueu("y");
        addToQueu("q");
        addToQueu("q");

    }

    public void addToQueu(String name) {
        if (o1.size() == 5 && o1.size() == o2.size() ) {
            System.out.println("очередь переполнена , зови галю");
        } else if (o1.size() <= o2.size()) {
            o1.add(name);
        } else {
            o2.add(name);
        }

    }

    @Override
    public String toString() {
        return "Tex{" +
                "o1=" + o1 +
                ", o2=" + o2 +
                '}';
    }
}
