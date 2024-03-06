import java.util.Arrays;

public class LatestTime {
    public static String maxTime(String time) {
        String[] input = time.split(":");

        String hours = "";
        for (int i = 0; i < input[0].length(); i++) {
            if (input[0].charAt(i) != '?') {
                hours += input[0].charAt(i);
            } else {
                if (hours.equals("2")) {
                    hours += "3";
                } else if (hours.equals("")) {
                    if (i == 0) {
                        if (input[0].charAt(i + 1) == '0' || input[0].charAt(i + 1) == '1' || input[0].charAt(i + 1) == '2' || input[0].charAt(i + 1) == '3' || input[0].charAt(i+1) == '?') {
                            hours += '2';
                        }
                         else {
                            hours += '1';
                        }
                    } else {
                        hours += "9";
                    }
                }else {
                    hours += "9";
                }
            }
        }
        String minutes = "";
        for (int j = 0; j < input[1].length(); j++) {
            if (input[1].charAt(j) != '?') {
                minutes += input[1].charAt(j);
            } else {
                if (j == 0) {
                    minutes += '5';
                } else {
                    minutes += '9';
                }
            }
        }

        return hours + ":" + minutes;
    }

    public static void main(String[] args) {
        System.out.println(maxTime("??:3?"));
    }

}


