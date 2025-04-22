public class Main {
    public static void main(String[] args) {
        String string = "Mr John Smith    ";
        char[] string_chars = string.toCharArray();
        replaceSpaces(string_chars, 13);
        System.out.println(string_chars);
    }

    static void replaceSpaces(char[] str, int trueLength){
        int numberOfSpaces = countOfchar(str, 0, trueLength, ' ');
        int newIndex = trueLength - 1 + numberOfSpaces * 2;
        if(newIndex + 1 < str.length) str[newIndex+1] = '\0';

        for(int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--){
            if(str[oldIndex] == ' ') {
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            }
            else{
                str[newIndex] = str[oldIndex];
                newIndex -= 1;
            }
        }

    }

    private static int countOfchar(char[] str, int start, int end, char space) {
        int count = 0;
        for(int i=start; i<end; i++){
            if(str[i] == space){
                count++;
            }
        }
        return count;
    }


}