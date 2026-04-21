public class Addition {

    public void add()   // Developer 1
    {
        int a = 10, b = 20;
        int c = a + b;
        System.out.println("Addition is : " + c);
    }

    public void add(int x)   // Developer 2
    {
        int a = x, b = x;
        int c = a + b;
        System.out.println("Addition is : " + c);
    }

    public void add(int x, int y)   // Developer 3
    {
        int a = x, b = y;
        int c = a + b;
        System.out.println("Addition is : " + c);
    }

}
