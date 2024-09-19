package ru.job4j.dreamjob.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.dreamjob.model.Vacancy;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class MemoryVacancyRepository implements VacancyRepository {
    private int nextId = 1;

    private final Map<Integer, Vacancy> vacancies = new HashMap<>();

    private MemoryVacancyRepository() {
        save(new Vacancy("Intern Java Developer", "Стажёр", LocalDateTime.now()));
        save(new Vacancy("Junior Java Developer", "Начинающий", LocalDateTime.now()));
        save(new Vacancy("Junior+ Java Developer", "Начинающий плюс", LocalDateTime.now()));
        save(new Vacancy("Middle Java Developer", "Средний", LocalDateTime.now()));
        save(new Vacancy("Middle+ Java Developer", "Выше среднего", LocalDateTime.now()));
        save(new Vacancy("Senior Java Developer", "Ведущий", LocalDateTime.now()));
    }

    @Override
    public Vacancy save(Vacancy vacancy) {
        vacancy.setId(nextId++);
        vacancies.put(vacancy.getId(), vacancy);
        return vacancy;
    }

    @Override
    public boolean deleteById(int id) {
        return vacancies.remove(id) != null;
    }

    @Override
    public boolean update(Vacancy vacancy) {
        return vacancies.computeIfPresent(vacancy.getId(),
                (id, oldVacancy) -> new Vacancy(vacancy.getId(), vacancy.getTitle(), vacancy.getDescription(), oldVacancy.getCreationDate())) != null;
    }

    @Override
    public Optional<Vacancy> findById(int id) {
        return Optional.ofNullable(vacancies.get(id));
    }

    @Override
    public Collection<Vacancy> findAll() {
        return vacancies.values();
    }
}
