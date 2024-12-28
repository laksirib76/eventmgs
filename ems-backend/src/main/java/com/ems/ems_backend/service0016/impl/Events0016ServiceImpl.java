package com.ems.ems_backend.service0016.impl;
import com.ems.ems_backend.dto0016.EventsDto0016;
import com.ems.ems_backend.entity0016.Events0016;
import com.ems.ems_backend.mapper0016.Events0016Mapper;
import com.ems.ems_backend.repository0016.Events0016repository0016;
import com.ems.ems_backend.service0016.Events0016Service;
import com.ems.ems_backend.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Events0016ServiceImpl implements Events0016Service {
    private Events0016repository0016 events0016repository0016;
    @Override
    public EventsDto0016 createEvents0016(EventsDto0016 eventsDto0016) {
        Events0016 events0016 = Events0016Mapper.mapToEvents0016(eventsDto0016);
        Events0016 savedEvents0016 = events0016repository0016.save(events0016);
        return Events0016Mapper.mapToEventsDto0016(savedEvents0016);
    }

    @Override
    public EventsDto0016 getEvents0016ById(Long Booking_ID) {
       Events0016  events0016  = events0016repository0016.findById(Booking_ID)
        .orElseThrow(() ->
                new ResourceNotFoundException("Events0016 not found with id: " + Booking_ID));
        return Events0016Mapper.mapToEventsDto0016(events0016);
    }
    @Overide
    public List<EventsDto0016> getAllEvents0016() {
        List<Events0016> events0016 = events0016repository0016.findAll();
        return events0016.stream().map((events00161) -> Events0016Mapper.mapToEventsDto0016(events00161))
                .collect(Collectors.toList());
    }
    @Override
    public EventsDto0016 updateEvents0016(Long Booking_id, EventsDto0016 updatedeventsDto0016) {
        Events0016 events0016 = events0016repository0016.findById(Booking_id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Events0016 not found with id: " + Booking_id));
        events0016.setBooking_ID(updatedeventsDto0016.getBooking_ID());
        events0016.setEventID(updatedeventsDto0016.getEventID());
        events0016.setEventOwnerIDNo(updatedeventsDto0016.getEventOwnerIDNo());
        events0016.setEventType(updatedeventsDto0016.getEventType());
        events0016.setEventHeadCount(updatedeventsDto0016.getEventHeadCount());
        events0016.setDuration(updatedeventsDto0016.getDuration());
        events0016 updatedEventsobj =  events0016repository0016.save(events0016);
        return Events0016Mapper.mapToEventsDto0016(updatedEventsobj);

        @Override
                public void deleteEvents0016(Long Booking_ID) {
            Events0016 events0016 = events0016repository0016.findById(Booking_ID)
                    .orElseThrow(() ->
                            new ResourceNotFoundException("Events0016 not found with id: " + Booking_ID));
            events0016repository.delete(events0016);
}
