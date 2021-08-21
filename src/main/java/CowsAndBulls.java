import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CowsAndBulls {

    public static String getHint(int secret, int guess) {
        if (guess == secret) {
            return "4B0C";
        }

        List<Integer> secretDigits = Arrays.stream(Integer.toString(secret).split("")).map(n -> Integer.parseInt(n)).collect(Collectors.toList());
        List<Integer> guessDigits = Arrays.stream(Integer.toString(guess).split("")).map(n -> Integer.parseInt(n)).collect(Collectors.toList());

        List<int[]> zipped = IntStream.range(0, Math.min(secretDigits.size(), guessDigits.size()))
                .mapToObj(i -> new int[]{secretDigits.get(i).intValue(), guessDigits.get(i).intValue()})
                .collect(Collectors.toList());

        int[] cowBulls = new int[] {0, 0};
        for(int[] item : zipped) {
            if (item[0] == item[1]) {
                cowBulls[1]++;
                continue;
            }

            if (secretDigits.contains(item[1])) {
                cowBulls[0]++;
            }
        }

        return String.format("%d cows and %d bulls", cowBulls[0], cowBulls[1]);
    }
}
