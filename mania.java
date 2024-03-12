interface A{
    void show();
    void aed();
}
 class B implements A
{
    public void show()
    {
        System.out.println("show");
    }
    public void aed()
    {
        System.out.println("aed");
    }
}
class inter
{
   public static void main(String args[]) 
   {
    A obj ;
    obj = new B();
    obj.show();
    obj.aed();
   }

}
