import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author cx
 * @Date 2020/7/22 19:46
 */


public class Demo2 {
    //ScheduledThreadPool:延迟
//    public static void main(String[] args) {
//        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(2);
//        scheduledPool.schedule(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("延迟3s");
//            }
//        },3,TimeUnit.SECONDS);
//    }


    //ScheduledThreadPool:定时
    public static void main(String[] args) {
        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(2);
        scheduledPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1s后每3s执行一次");
            }
        },1,3,TimeUnit.SECONDS);
    }
}
