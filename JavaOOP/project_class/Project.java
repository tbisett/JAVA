public class Project {
    // getter
    private String name;
    private String description;
    
    public Project() {
        System.out.println("project");
    }
    // setters(parameters)
    public Project(String name) {
        this.name = name;
        System.out.println("Project name is: "  + name);
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        System.out.println("Project name is" + name + ":" + "Description is: " + description);
    }
    
    
    // getters
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
    
    
    
    
}