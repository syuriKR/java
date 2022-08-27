public class java_dowhile{
    public static void main(String[] args){
        int temp = 28;
        do{
            temp--;
            System.out.println("温度を一度下げました");
            System.out.println("現在"+temp+"度です");
        }while(temp>25);
    }
}