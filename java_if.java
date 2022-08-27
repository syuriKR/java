public class java_if{
    public static void main(String[] args){
        boolean tenki = true;
        if(tenki == true){
            System.out.println("洗濯をします");
        }
        else{
            System.out.println("DVDを見ます");
        }

        int point = new java.util.Random().nextInt(11);
        if(point<=5){
            System.out.println(point+"点でした、不合格です。");
        }
        else if(point==10){
            System.out.println(point+"点でした、満点です。");
        }
        else{
            System.out.println(point+"点でした、合格です。");
        }

        // 文字列は==では比較できない
        String str = "朝日";
        if(str.equals("朝日")){
            System.out.println("strは朝日です");
        }
        else{
            System.out.println("strは朝日ではありません");
        }
    }
}