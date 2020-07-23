import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author cx
 * @Date 2020/7/23 10:18
 */
public class AtomicThreadSafe {
    private AtomicInteger cnt = new AtomicInteger();

    public void add(){
        cnt.incrementAndGet();
    }

    public int get(){
        return cnt.get();
    }
}
