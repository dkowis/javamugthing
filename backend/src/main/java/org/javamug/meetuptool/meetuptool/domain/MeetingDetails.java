package org.javamug.meetuptool.meetuptool.domain;

import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class MeetingDetails {
    private String topic;
    private List<Attendee> attendees = Collections.emptyList();
    private List<Prize> prizes = Collections.emptyList();

}