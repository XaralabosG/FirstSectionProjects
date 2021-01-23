public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(int minutes,int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }
        int h = (minutes / 60);
        int m = (minutes % 60);
        return h + "h "+ m +"m " + seconds + "s ";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int m = seconds / 60;
        int s = seconds % 60;
        return getDurationString(m,s);
    }
}
