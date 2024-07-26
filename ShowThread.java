public class ShowThread extends Thread  {
    public static void main(String[] args) {
        try {
            Thread t1 = new MainShowA_Z('A', 'Z') ;
             t1.start();
             Thread.sleep(4000);
             Thread t2 = new MyThread(1, 40);
             t2.start();
             Thread.sleep(9000);
             Thread t3 = new MyThreadB(1, 9);
             t3.start();
        } catch (Exception e) {
           e.printStackTrace();
        }
            
      }
}
