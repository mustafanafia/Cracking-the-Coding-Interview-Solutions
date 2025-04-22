public class Main {
    public static void main(String[] args) {
        System.out.println(compressed("AAABB"));
    }

    static String compressed(String str){

        StringBuilder result = new StringBuilder();
        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            counter++;
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)){   // will compare current with next char, if true then we add to result
                result.append(str.charAt(i));
                result.append(counter);
                counter = 0;
            }
        }

        return result.length() < str.length() ? result.toString() : str;

    }
}