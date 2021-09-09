public class Alarm {
    public static String getCapacityStatus(int numberOfPeople, String threatLevel) {

        int maxNumberOfPeopleAllowed = getMaximumNumberOfPeopleAllowed(threatLevel);

        if (numberOfPeople > maxNumberOfPeopleAllowed) {
            return "Warning! Maximum number of people exceeded";
        }
        return "Everything okay, maximum number of people not exceeded";
    }

    public static int getMaximumNumberOfPeopleAllowed(String threatLevel){
        switch(threatLevel){
            case "green":
                return 60;
            case "yellow":
                return 30;
            default :
                 return 0;
        }
    }


}
