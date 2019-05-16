package org.deboss.ws.workout.data.repository;

import org.deboss.ws.workout.domain.Workout;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkoutRepository extends MongoRepository<Workout, String> {

}{

}
