class outer{
    void outermethod()
    {
        class inner{
            void innermethod()
            {
                System.out.println("inner method class");
            }
        }
        inner i=new inner();
        i.innermethod();
    }
    public static void main(String args[])
    {
        outer ob=new outer();
        ob.outermethod();
    }
}
