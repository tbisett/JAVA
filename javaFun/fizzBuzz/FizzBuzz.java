public class FizzBuzz {
    public String fizzBuzz(int number) {
        if(number % 15 == 0) {
            return "FIZZBUZZ";
        }else if(number % 5 == 0) {
            return "BUZZ";
        }else if(number % 3 == 0) {
            return "FIZZ";
        }else{
            String newNumber = String.valueOf(number);
            return newNumber;
        }
    }
}