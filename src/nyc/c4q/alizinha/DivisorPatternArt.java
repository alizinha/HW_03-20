package nyc.c4q.alizinha;

/**
 * Created by c4q-Allison and Sarah Kim on 3/16/15 during office hours, with assistance from Luke.
 */
public class DivisorPatternArt {
    public static void print(String text) {
        System.out.print(text);
    }

    //psvm tab
    public static void main(String[] args) {
        //change the number in the next line to make the art bigger or smaller
        int size = 50;
        box(size);
    }

    public static String pattern (int i, int j) {
        if (i % j == 0 || j % i == 0) {
            return "@ ";
        } else {
            return "  ";
        }
    }
//it was exciting when we realized that since the console prints across and not down, we needed to make it so that
//our loops would execute properly to go across each line, i.e., make each row
    public static void box (int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                print(pattern(i,j));
            }
            print("\n");
        }
    }
}