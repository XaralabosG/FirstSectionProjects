public class DemicalComparator {
   public static boolean areEqualByThreeDemicalPlaces (double number1,double number2){
       int a = (int) number1 * 1000;
       int b = (int) number2 * 1000;

       if(a == b){
           System.out.println(true);
           return true;
       } else {
           System.out.println(false);
            return false;
       }
}



}
