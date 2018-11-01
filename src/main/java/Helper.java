import java.util.*;

public class Helper {
    public static List<String> func(String inputString, String sourceString) {
        List<String> input = Arrays.asList(inputString.split(" "));
        List<String> source = Arrays.asList(sourceString.split(" "));
        List<String> missing = new ArrayList<String>();

        Set<String> futureWords = new HashSet<String>(source);

        ListIterator<String> inputIt = input.listIterator();

        String next = inputIt.next();

        for (String s: source) {
            futureWords.remove(s);
            while (inputIt.hasNext()) {
                if (futureWords.contains(next)) {
                    missing.add(s);
                    break; // breaks out of while
                }
                if (next.equals(s)) {
                    break; // breaks out of while
                }
                next = inputIt.next();
            }
            if (!inputIt.hasNext() && !s.equals(next)) missing.add(s); // end of input list
        }

        return missing;
    }
}
