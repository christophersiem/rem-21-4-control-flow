public class Alarm {
    public static String getCapacityStatus(int numberOfPeople) {
        if (numberOfPeople > 30) {
            return "Warning! More than 30 people are not allowed";
        }
        return "Everything okay, maximum number of people not exceeded";
    }
}
