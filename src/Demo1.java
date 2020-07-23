import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author cx
 * @Date 2020/7/22 19:23
 */

//线程数量固定的线程池
public class Demo1 {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        for(int i=1;i<=5;i++){
            final int idx = i;
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("第"+idx+"个线程:"+Thread.currentThread().getName());
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
