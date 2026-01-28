class Calculator{
    // create the class and class name is calculator
    int a ;
    
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

class Main {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        
        Calculator calc = new Calculator();
        // create the object using new keyword and object name is  calculator.
       int result = calc.add(num1,num2);
        
        //int result = num1 + num2;
        System.out.println(result);
    }
}
