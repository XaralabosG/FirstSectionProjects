public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0 ) {
            return -1; }

        return Math.round(kilometersPerHour/1.609);
    }
    public static void  printConversion(double kilometerPerHour){
      if (kilometerPerHour < 0){
          System.out.println("la8os apotelasma");
      }else {
          long milesPreHour = toMilesPerHour(kilometerPerHour);
          System.out.println(kilometerPerHour + "Km/h = " +
                  milesPreHour + "Mi/h  ");
      }
    }
}
