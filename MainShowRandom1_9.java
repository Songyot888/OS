import java.util.Random;

class MyThreadB extends Thread {
    private int  Start ;
    private int  End ;
 
     public MyThreadB(int start, int end) {
         this.Start = start;
         this.End = end;
     }
 
     public void run() {
         // โค้ดที่ต้องการให้รันใน thread นี้
         Random random = new Random();
         for (int c = 1; c <= 20; c++) {
            int random9 = random.nextInt(this.End)+this.Start;
             System.out.print(random9 + " ");
             // System.out.println();
             try {
                Thread.sleep(200);
             } catch (Exception e) {
                e.printStackTrace();;
             }
         }
         System.out.println();
     }
 }
 
 public class MainShowRandom1_9{
     public static void main(String[] args) {
         Thread thread = new MyThreadB(1,9);
         thread.start();  // เริ่มการทำงานของ thread
     }
 }