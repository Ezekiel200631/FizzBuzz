public class FizzBuzz
{ 
    public static void main(String[] args) 
    { 
        for (int i = 1; i <= 100; i++) 
        { 
            boolean isFizz = false; 
            boolean isBuzz = false; 

            if (i / 3 * 3 == i) 
            { 
                isFizz = true; 
            } 

            if (i / 5 * 5 == i) 
            { 
                isBuzz = true; 
            } 

            if (isFizz && isBuzz) 
            { 
                System.out.println("FizzBuzz"); 
            } 
            else if (isFizz) 
            { 
                System.out.println("Fizz"); 
            } 
            else if (isBuzz) 
            { 
                System.out.println("Buzz"); 
            } 
            else 
            { 
                System.out.println(i); 
            } 
        } 
    }
}
