package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
    }

    public ResponseEntity create(TimeEntry timeEntryToCreate) {
        return null; //Todo
    }

    public ResponseEntity<TimeEntry> read(long timeEntryId) {
        return null; //Todo
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return null; //Todo
    }

    public ResponseEntity update(long timeEntryId, TimeEntry expected) {
        return null; //Todo
    }

    public ResponseEntity delete(long timeEntryId) {
        return null; //Todo
    }
}
