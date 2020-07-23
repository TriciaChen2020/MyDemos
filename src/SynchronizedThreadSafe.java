/**
 * @Author cx
 * @Date 2020/7/23 10:24
 */
public class SynchronizedThreadSafe {
    private  int cnt =0;

    public synchronized void add(){
        cnt++;
    }

    public synchronized int get(){
        return cnt;
    }
}
