import java.io.*;
import java.util.*;

abstract class Phong
{
    String name;
    int Tang;
    int SoPhong;
    int SucChua;
    public abstract void Input(Scanner sc);
}
class id1 extends Phong
{
    int maylanh;
    public void Input(Scanner sc)
    {
        name=sc.next();
        Tang=sc.nextInt();
        SoPhong=sc.nextInt();
        SucChua=sc.nextInt();
        maylanh=sc.nextInt();
        if(maylanh!=1)
        {
            maylanh=0;
        }
    }
}
class id2 extends Phong
{
    int solgmt;
    public void Input(Scanner sc)
    {
        name=sc.next();
        Tang=sc.nextInt();
        SoPhong=sc.nextInt();
        SucChua=sc.nextInt();
        solgmt=sc.nextInt();
    }
}
class id3 extends Phong
{
    int solgmc;
    public void Input(Scanner sc)
    {
        name=sc.next();
        Tang=sc.nextInt();
        SoPhong=sc.nextInt();
        SucChua=sc.nextInt();
        solgmc=sc.nextInt();
    }
}
public class ThiCuoiKiLab
{
    public static void main(String[] arg) 
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Phong r[]=new Phong[n];
        for(int i=0;i<n;i++)
        {
            int lc =sc.nextInt();
            switch(lc)
            {
            case 1:
            {
                r[i]= new id1();
                break;
            }
            case 2:
            {
                r[i]=new id2();
                break;
            }
            case 3:
            {
                r[i]=new id3();
                break;
            }
            }
            r[i].Input(sc);
        }
        int k=sc.nextInt();
        int total=0;
        for(int i=0;i<n;i++)
        {
            total=total+r[i].SucChua;
        }
        for(int i=0;i<n;i++)
        {
            if(r[i].SucChua >=k&& r[i].SucChua<=total)
            {
                for(int j=i+1;j<n;j++)
                if(r[i].SoPhong<= r[j].SoPhong)
                {
                    System.out.println(total);
                    System.out.println(r[i].name);
                    System.exit(0);
                }
            }
        }
        System.out.println(total);
        System.out.println("NULL");
        System.exit(0);
    }
}
