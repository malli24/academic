import java.util.*; 
    interface a{
        public void r();
        }
    class b implements a
    {
        public void r()
        {
            System.out.println("hello malli");
        }
    }
    class c extends b
    {
        public void r()
        {
            System.out.println("hello akshay");
        }
    }
    class multiple{
        public static void main(String args[])
        {
            c h1=new c();
            h1.r();
            h1.r();
        }
    }

    



