package homework_wk_7;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class P20_SpecificValue {

    public static void main(String[] args) {
        int[] num = {2,4,6,8,10,12,14,16};
        int toFind = 17;
        boolean found = false;

        for (int n : num){
            if (n==toFind){
                found= true;
            }
        }
        if (found) {
            System.out.println(toFind + "is contain");
        }else {
            System.out.println(toFind +"is not contain");
        }
    }
}
