package Abstraction;

public class Animals extends Population{
    @Override
    public void procreate() {
        setPopulationSize(getPopulationSize()*((int) (Math.random() * 2)));
    }

    @Override
    public void vanish() {
        setPopulationSize(getPopulationSize()*((int) (Math.random() * 2)));
    }

    @Override
    public void calculateAverageAge() {
        setLifeLength((int) (Math.random() * 100));
    }

    @Override
    public void calculatePopulationAge() {
        setPopulationAge((int) (Math.random() * 100));
    }

    public void printInformation(){
        System.out.println("Population size: " + getPopulationSize() + "\nLife length: " + getLifeLength() + "\nGrowth Rate: " + getGrowthRate() + "\nPopulation age: " + getPopulationAge() + "\n");
    }
}
