class parentone{
    void msg()
    {
    System.out.println("hello");
            }
        }
        class parent
        {
            public static void main(String[]args)
            {
            parentone p1=new parentone();
            p1.msg();
            parentone p2=new parentone()
            {
            void msg()
            {
            System.out.println("AIC");  
            }
        };
        p2.msg();
    }
}