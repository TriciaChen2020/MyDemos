/**
 * @Author cx
 * @Date 2020/7/22 19:24
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int x=0;x<100;x++){
            System.out.println(Thread.currentThread().getName()+":"+x);
        }
    }
}
