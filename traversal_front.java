import java.util.ArrayList;
public class traversal_front
{
    public void traversal(treedemo.BTreeNode cur,ArrayList a)
    {
        if(cur==null)
            return;
        a.add(cur.val);
        traversal(cur.left,a);
        traversal(cur.right,a);

    }
    public ArrayList pre_order(treedemo.BTreeNode root)
    {
        ArrayList a=new ArrayList();
        traversal(root,a);
        return a;
    }

}
