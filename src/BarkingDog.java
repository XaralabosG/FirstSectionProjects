public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hoursOfDay) {
        if ((hoursOfDay < 0) || (hoursOfDay > 23)) {
            System.out.println(false);
        }

        if (barking && hoursOfDay < 8 || hoursOfDay > 22) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        return false;
    }
}
