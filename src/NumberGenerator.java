public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + hashCode() + " is running.");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
