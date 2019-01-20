import java.util.*;

public class Main {
    public static void main(String arg[]) {
        ArrayList intervals = new ArrayList<Intervale>(); 
        Intervale one =  new Intervale(0,30);
        Intervale two =  new Intervale(2,5);
        Intervale three =  new Intervale(9,11);
        intervals.add(one);
        intervals.add(two);
        intervals.add(three);
    
        MeetingRoomsTwo meetingRoom =  new MeetingRoomsTwo(intervals);
        Integer tests = meetingRoom.minMeetingRooms();
        System.out.println(tests);
    }

}