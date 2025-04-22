class Increment 
{
        public static void main(String[] args) 
        {
            int number = 5;
            System.out.println("Initial value of number: " + number);
            System.out.println("Using pre-increment (++number): " + (++number));
            System.out.println("Value of number after pre-increment: " + number);
                number = 5;
            System.out.println("\nResetting number to: " + number);
            System.out.println("Using post-increment (number++): " + (number++));
            System.out.println("Value of number after post-increment: " + number);
        
    }
    
}
