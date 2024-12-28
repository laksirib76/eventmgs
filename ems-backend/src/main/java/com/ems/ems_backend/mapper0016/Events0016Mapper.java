package com.ems.ems_backend.mapper0016;

import com.ems.ems_backend.dto0016.EventsDto0016;
import com.ems.ems_backend.entity0016.Events0016;

public class Events0016Mapper {
    public static EventsDto0016 mapToEventsDto0016(Events0016 events0016) {
        return new EventsDto0016(
                events0016.getBooking_ID(),
                events0016.getEventID(),
                events0016.getEventOwnerIDNo(),
                events0016.getEventType(),
                events0016.getEventHeadCount(),
                events0016.getDuration()
        );
    }
    public static Events0016 mapToEvents0016(EventsDto0016 eventsDto0016) {
        return new Events0016(
                eventsDto0016.getBooking_ID(),
                eventsDto0016.getEventID(),
                eventsDto0016.getEventOwnerIDNo(),
                eventsDto0016.getEventType(),
                eventsDto0016.getEventHeadCount(),
                eventsDto0016.getDuration()
        );
    }
}
