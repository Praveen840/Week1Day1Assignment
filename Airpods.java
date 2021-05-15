package week1.day1assignments;

public class Airpods {

    float height = 2.5f;
    char colour = 'w';
    boolean IsThisOk = true;
 //   int [] array = {1,2,3,3};

    public static void main(String[] args) {
        int [] array = {1,2,3,3};
        Airpods myAirPods = new Airpods();

        System.out.println(myAirPods.height);
        //System.out.println(myAirPods.IsThisOk);
        System.out.println(myAirPods.colour);
        for (int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
}

