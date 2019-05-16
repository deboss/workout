package org.deboss.ws.workout.rest.controller;

import org.deboss.ws.workout.data.repository.WorkoutRepository;
import org.deboss.ws.workout.domain.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.data.domain.Sort.Direction.DESC;


@RestController
@RequestMapping("/api/${rest.api.version}")
@CrossOrigin("*")
public class WorkoutController {

    @Autowired
    WorkoutRepository workoutRepository;

    @GetMapping("/workouts")
    public List<Workout> getAllWorkouts() {
        Sort sortByCreatedAtDesc = Sort.by(DESC, "createdAt");
        return workoutRepository.findAll(sortByCreatedAtDesc);
    }
}