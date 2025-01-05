package com.eventmanagement.service;

import com.eventmanagement.model.Event;
import com.eventmanagement.repository.EventRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class EventServiceTest {

    @Mock
    private EventRepository eventRepository;

    @InjectMocks
    private EventService eventService;

    @Test
    public void testGetAllEvents() {
        List<Event> events = Arrays.asList(new Event(1L, "Hackathon", "Tech Event", "2025-02-01", "Virtual"));
        when(eventRepository.findAll()).thenReturn(events);

        List<Event> result = eventService.getAllEvents();

        assertEquals(1, result.size());
        verify(eventRepository, times(1)).findAll();
    }
}
