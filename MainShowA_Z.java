public class MainShowA_Z extends Thread {
    private char startChar;
    private char endChar;

    public MainShowA_Z(char startChar, char endChar) {
        this.startChar = startChar;
        this.endChar = endChar;
    }

    @Override
    public void run() {
        for (char c = startChar; c <= endChar; c++) {
            System.out.print(c + " ");
            try {
                Thread.sleep(100); // หยุดชั่วคราว 100 มิลลิวินาที
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Thread t1 = new MainShowA_Z('A', 'Z');
        t1.start();
    }
}