class MyThread extends Thread {
    private int  S ;
    private int  End ;
 
     public MyThread(int s, int end) {
         this.S = s;
         this.End = end;
     }
 
     public void run() {
         // โค้ดที่ต้องการให้รันใน thread นี้
         for (int c = S; c <= End; c++) {
             System.out.print(c + " ");
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
 
 public class MainShow1_24{
     public static void main(String[] args) {
         Thread thread = new MyThread(1,24);
         thread.start();  // เริ่มการทำงานของ thread
     }
 }