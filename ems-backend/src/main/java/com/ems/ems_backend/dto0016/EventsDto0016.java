package com.ems.ems_backend.dto0016;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EventsDto0016 {
    private Long Booking_ID;
    private Long  EventID;
    private Long  EventOwnerIDNo;
    private String EventType;
    private Long EventHeadCount;
    private int duration;

}
