 public class EvenWatermelon {
        int w;
        String divide(int w){
            if (w<1 || w>100)
                return "Error: Weight is out of range";
            if (w%2==0)
                return "YES";
            else return "NO";

        }
}

