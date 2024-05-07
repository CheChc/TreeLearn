import java.util.Scanner;

public class treedemo
{
    public class BTreeNode
    {
        int val;
        BTreeNode left;
        BTreeNode right;

        BTreeNode()
        {
            val = 0;
            left = null;
            right = null;
        }

        BTreeNode(int val)
        {
            this.val = val;
            left = null;
            right = null;
        }
    }


    public BTreeNode create()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        BTreeNode root=null;
        if(a >= 0)
            {
                root = new BTreeNode(a);
                root.left = create();
                root.right = create();
                return root;
            }

        return null;
    }

    public static void main(String[] args)
    {
        treedemo td=new treedemo();
        BTreeNode head= td.create();
        System.out.println(head.val);
    }
}
