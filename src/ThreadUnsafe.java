/**
 * @Author cx
 * @Date 2020/7/23 10:11
 */
public class ThreadUnsafe {
    private  int cnt =0;

    public void add(){
        cnt++;
    }

    public int get(){
        return cnt;
    }
}
