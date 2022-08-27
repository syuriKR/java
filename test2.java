public class test2{
    public static void main(String[] args){
        // printだけだと改行しない
        // printlnだと文字列を出力した後に改行が出力される
        String nickName = "Shuri";
        System.out.print("私の名前は");
        System.out.println(nickName);

        int max = Math.max(10,100);
        System.out.println("10と100で大きいのは"+max);
        int min = Math.min(10,100);
        System.out.println("10と100で小さいのは"+min);

        // 文字列を数値に変換する
        String nStr = "32";
        int nInt = Integer.parseInt(nStr);
        System.out.println(nInt+32);

        // 乱数を生み出して代入する
        // 0以上かつ500未満のランダムな整数をrに代入する
        int r = new java.util.Random().nextInt(500);
        System.out.println("乱数:"+r);
    }
}