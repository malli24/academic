class OuterClass {
    class Inner {
        void innerMethod() {
            System.out.println("Inner class method");
        }
    }

    void outerMethod() {
        System.out.println("Outer class method");
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
        
        Inner inner = outer.new Inner();
        inner.innerMethod();
    }
}
