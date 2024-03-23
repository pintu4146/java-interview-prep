import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

//Convert a list of strings to uppercase using streams.
public class lowerToUpper {
    public static void main(String[] args) throws IOException {
        int numOfTestCases = 5;
        while( numOfTestCases>0){
            System.out.println("enter String");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String res =converCase(br.readLine());
        }

    }

    private static String converCase(String s) {
        //s.toUpperCase();
        return Arrays.stream(s.split(""))
                .map(String::toUpperCase)
                .collect(Collectors.joining());
    }
}
