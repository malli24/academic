class sam
{
    public int a,b;
    public void set(int x,int y)
    {
        a=x;
        b=y;
    }
    public int add()
    {
        return(a+b);
    }
}
class Addition
{
    public static void main(String[]args)
    {
        Sample s=new Sample();
        s.set(5,2);
        int c=s.add();
        System.out.println("c="+c);
    }
}
