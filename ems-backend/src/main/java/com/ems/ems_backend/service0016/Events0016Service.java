package com.ems.ems_backend.service0016;
import com.ems.ems_backend.dto0016.EventsDto0016;

public interface Events0016Service {
    EventsDto0016 createEvents0016(EventsDto0016 eventsDto0016);
    EventsDto0016 getEvents0016ById(Long  Booking_ID);
    List<EventsDto0016> getAllEvents0016();
}

