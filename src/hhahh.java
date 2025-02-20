class CookingTask extends Thread {
    private String taskName;
    private int timeRequired;

    public CookingTask(String taskName, int timeRequired) {
        this.taskName = taskName;
        this.timeRequired = timeRequired;
    }

    @Override
    public void run() {
        System.out.println(taskName + " started.");
        try {
            // Simulate the time required for the task
            Thread.sleep(timeRequired * 1000);
        } catch (InterruptedException e) {
            System.out.println(taskName + " was interrupted.");
        }
        System.out.println(taskName + " completed.");
    }
}

public class hhahh {
    public static void main(String[] args) {
        // Create threads for each task
        CookingTask boilWater = new CookingTask("Boil Water", 5);
        CookingTask chopVegetables = new CookingTask("Chop Vegetables", 3);
        CookingTask grillChicken = new CookingTask("Grill Chicken", 7);

        // Start all threads (tasks run concurrently)
        boilWater.start();
        chopVegetables.start();
        grillChicken.start();

        // Wait for all threads to finish
        try {
            boilWater.join();
            chopVegetables.join();
            grillChicken.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All cooking tasks completed!");
    }
}
