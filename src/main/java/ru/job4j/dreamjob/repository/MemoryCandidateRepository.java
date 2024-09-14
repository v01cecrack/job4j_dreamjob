package ru.job4j.dreamjob.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.dreamjob.model.Candidate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MemoryCandidateRepository implements CandidateRepository {

    private int nextId = 1;

    private final Map<Integer, Candidate> candidates = new HashMap<Integer, Candidate>();

    private MemoryCandidateRepository() {
        save(new Candidate("Oleg", "Middle Java developer"));
        save(new Candidate("Maksim", "Senior Java developer"));
        save(new Candidate("Dima", "Junior Java developer"));
        save(new Candidate("Ivan", "Middle Java developer"));
    }

    @Override
    public Candidate save(Candidate candidate) {
        candidate.setId(nextId++);
        candidates.put(candidate.getId(), candidate);
        return candidate;
    }

    @Override
    public Collection<Candidate> findAll() {
        return candidates.values();
    }
}
