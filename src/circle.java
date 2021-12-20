import java.io.*;
class circle
{
    public static void main(String args[])throws IOException  {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int radius ;
        double area , pi=3.14;
        System.out.println("Enter the radius of circle.. ");
        radius=Integer.parseInt(ob.readLine());
        if(radius<0)
        {
            System.out.println("invalid value..");
        }
        else
        {
            area = pi * radius * radius;
            System.out.println("The area of circle is : " + area);
        }
    }
} 