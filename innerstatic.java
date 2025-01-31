class outer
{
static class inner
{
    void innermethod()
    {
        System.out.print("inner method");
    }
}   
public static void main(String args[])
{
    inner i=new inner();
    i.innermethod();
} 
}
