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
}
