public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking == false) {
            return false;
        }

        if (hourOfDay < 0) {
            return false;
        } else if (hourOfDay < 23 && hourOfDay >= 8) {
            return false;
        } else if (hourOfDay <= 8) {
            return true;
        } else if (hourOfDay <= 23) {
            return true;
        } else if (hourOfDay > 23) {
            return false;
        }
        return barking;
    }
    public static void malen() {
        System.out.println(shouldWakeUp( true,1));
    }
}
