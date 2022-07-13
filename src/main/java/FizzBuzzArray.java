public class FizzBuzzArray {
    /*
        Use TDD to implement a FizzBuzz solution that takes an array of strings
        instead of a single string and substitutes each string in the array with
        its FizzBuzz-based transformed value.
     */
    public String[] fizzBuzzArray(String[] strings) {
        String[] arr = new String[strings.length];

        for(int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                arr[i] = null;
            }
            else if (strings[i].startsWith("f") && strings[i].endsWith("b")) {
                arr[i] = "FizzBuzz";
            }
            else if (strings[i].startsWith("f"))  {
                arr[i] = "Fizz";
            }
            else if (strings[i].endsWith("b")){
                arr[i] = "Buzz";
            }
            else {
                arr[i] = strings[i];
            }
        }
        return arr;
    }
}
