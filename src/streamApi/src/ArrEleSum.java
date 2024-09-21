import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrEleSum {
    public static void main(String[] args) {
        List<Integer> arr= List.of(0,0);

        Optional<Integer> rtn = sumEle(arr);
        System.out.println(rtn.isPresent() ? rtn.get() : false);
    }

    private static Optional<Integer> sumEle(List<Integer> arr) {
        return arr.stream().reduce(Integer::sum);
    }
}
