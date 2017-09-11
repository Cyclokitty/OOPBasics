package com.cyclokitty;

public class WeightWatchersAssociation {
    private double lowestWeightIndex;

    public WeightWatchersAssociation(double indexLimit) {
        this.lowestWeightIndex = indexLimit;
    }

    public boolean isAcceptedAsMember(Person person) {
        if (person.bodyMassIndex() < this.lowestWeightIndex) {
            return false;
        }

        return true;
    }
}
