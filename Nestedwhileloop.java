public class Nestedwhileloop {
    public static void main (String [] args) {
        int i = 1;
        while (i <=4)
        {
            System.out.println("Love you 3000" + i);
            int j = 1;
            while (j<=3)
            {
                System.out.println("I am Ironman" + j);
                j++;
            }
            i++;
        }
    }
}
