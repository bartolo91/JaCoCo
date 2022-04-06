package pl.kurs;

public class PhaseService {

    public String compareTwoWords(String first, String second) {
        if (first.length() > second.length()) {
            return "First is longer";
        } else if (first.length() < second.length()) {
            return "Second is longer";
        } else {
            if (first.length() > 5) {
                return "Both are the same and longer than 5";
            } else {
                return "Both are the same";
            }
        }
    }
}
