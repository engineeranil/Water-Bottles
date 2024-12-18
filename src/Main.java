public class Main {
    public static void main(String[] args) {
        int numBottles = 15;
        int numExchange = 4;
        int drinkWater = numBottles;
        while(numBottles>0){
            if(numBottles>=numExchange){
                drinkWater+=(numBottles/numExchange);
                numBottles=(numBottles%numExchange)+(numBottles/numExchange);
            }
            else{
                numBottles=0;
            }
        }
        System.out.println(drinkWater);

    }
}
