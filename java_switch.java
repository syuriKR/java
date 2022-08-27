public class java_switch{
    public static void main(String[] args){
        int num = new java.util.Random().nextInt(4);

        // 乱数で指定したnumのcaseのところまでジャンプする
        // ジャンプするだけなのでbreakを置かないとジャンプしたところ以降もすべて実行される
        // breakがない時、例えばnumが1だと"numは1"と三回出力される
        
        switch(num){
            case 0:
            System.out.println("numは"+num);
            break;

            case 1:
            System.out.println("numは"+num);
            break;

            case 2:
            System.out.println("numは"+num);
            break;

            case 3:
            System.out.println("numは"+num);
            break;
        }
    }
}