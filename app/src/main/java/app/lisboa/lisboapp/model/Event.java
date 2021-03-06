package app.lisboa.lisboapp.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Rajat Anantharam on 01/11/16.
 */

public class Event  implements Serializable, Comparable<Event> {

    public String hostName;
    public String eventName;
    public String locationName;
    public Double latitude;
    public Double longitude;
    public long startTime;
    public int durationInMinutes;
    public String hostId;
    public List<String> attendees;
    public String emojiName;
    public List<Attendee> attendeeNames;
    public String key;

    public Event(){

    }

    public Event(String host, String eventDesc, String locationName, Double latitude, Double longitude, long startTime, int durationInMinutes, String hostId, String emojiName) {
        this.hostName = host;
        this.eventName = eventDesc;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.startTime  = startTime;
        this.durationInMinutes = durationInMinutes;
        this.hostId = hostId;
        this.emojiName = emojiName;
    }


    @Override
    public int compareTo(Event event) {
        return this.startTime > event.startTime ? -1 : 1;
    }
}
