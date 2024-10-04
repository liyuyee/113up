public class SecureRandomDemo {
    public static void main(String[] args) {
        java.security.SecureRandom randomNumber = new  java.security.SecureRandom();
        while (true) { 
            var number = randomNumber.nextInt(10);
            System.out.println(number);

            if(number == 5) {
             System.err.println("I hit 5....Orz");
                 break;
            }
        }
    }
    
} 
    

