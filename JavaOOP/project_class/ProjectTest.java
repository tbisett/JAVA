public class ProjectTest {

    public static void main(String[] args) {
        Project elevatorPitchAll = new Project("New Project", "Our newest project in development");
        String name = elevatorPitchAll.getName();
        String description = elevatorPitchAll.getDescription();
        
        

        System.out.println("The name of the project is: " + elevatorPitchAll.getName());
        System.out.println("The name of the project is: " + elevatorPitchAll.getName());
        System.out.println("The name of the project is: " + elevatorPitchAll.getName() + " and the Description is: " + elevatorPitchAll.getDescription());
    }
}