package io.pivotal.pal.tracker;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InMemoryTimeEntryRepository implements TimeEntryRepository{

    private HashMap<Long, TimeEntry> inMemoryRepo;
    private long count = 1L;

    public InMemoryTimeEntryRepository(){
        inMemoryRepo = new HashMap<>();
    }

    public TimeEntry create(TimeEntry entry) {
        entry.setId(count++);
        inMemoryRepo.put(entry.getId(), entry);
        return entry;
    }

    public TimeEntry find(long timeEntryId) {
        return inMemoryRepo.get(timeEntryId);
    }

    public List<TimeEntry> list() {
        return inMemoryRepo.keySet().stream().map( key -> inMemoryRepo.get(key)).collect(Collectors.toList());
    }

    public TimeEntry update(long id, TimeEntry entry) {
        if(inMemoryRepo.containsKey(id)){
            entry.setId(id);
            inMemoryRepo.put(id, entry);
            return entry;
        }
        return null;
    }

    public TimeEntry delete(long timeEntryId) {
        return inMemoryRepo.remove(timeEntryId);
    }

}
