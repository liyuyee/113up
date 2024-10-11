
import java.lang.reflect.Array;



public class IrreularArray {
    public static void main(String[] args) {
        int[]score1 = {88,81,74,68,78,76,77,85,95,93};
        int[]score2 = Array.copyOf(score1,score1.length);
        int[]score3 = score1;

        for(var score : score2){
            System.out.printf("%3d",score);
        }
        System.out.println();

        score2[0]=99;
        for (var score : score1){
            System.out.println("%3d");
        }
        System.out.println();
        

        score3[0] = 199;
        for(var score : score1) {
            System.out.printf("%3d", score);
        }
    }
}
