public class lambda01 {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println(11);
        }).start();
    }
}
