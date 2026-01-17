


class calculator
{
    int a;

    public int add( int num1 , int num2) //these vatiable can be same as num1,num2
    {
      int r = num1+num2;

       return r; 
    }

}



public class Demo6
 {
    public static void main(String args[])
    {
    
    int num1 = 4;  // these are the primitive variables
    int num2 = 5;
    //int res= num1+num2;
    //System.out.println(res);
    calculator calc = new calculator() ; // creating an object  new is a key word 

                //variable calc

     int res = calc.add( num1 , num2);
     System.out.println(res);


    }


}

//object oriented programming
//object - properties and behaviours



//class