package com.example.demo.People;

public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int i = 0;
        for(Learner l: learners){ i++; }
        double numberOfHoursPerLearner = numberOfHours / i;
        for(Learner l: learners) { l.learn(numberOfHoursPerLearner); }
    }
}
