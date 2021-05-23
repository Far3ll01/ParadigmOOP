package Abstraction;

public abstract class Population {
    private double populationSize;
    private int lifeLength;
    private double growthRate;
    private int populationAge;

    public abstract void procreate();
    public abstract void vanish();
    public abstract void calculateAverageAge();
    public abstract void calculatePopulationAge();

    public double getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(double populationSize) {
        this.populationSize = populationSize;
    }

    public int getLifeLength() {
        return lifeLength;
    }

    public void setLifeLength(int lifeLength) {
        this.lifeLength = lifeLength;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public int getPopulationAge() {
        return populationAge;
    }

    public void setPopulationAge(int populationAge) {
        this.populationAge = populationAge;
    }
}
