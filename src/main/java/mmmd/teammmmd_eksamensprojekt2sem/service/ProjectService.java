package mmmd.teammmmd_eksamensprojekt2sem.service;
import mmmd.teammmmd_eksamensprojekt2sem.model.Employee;
import mmmd.teammmmd_eksamensprojekt2sem.model.Project;
import mmmd.teammmmd_eksamensprojekt2sem.model.Status;
import mmmd.teammmmd_eksamensprojekt2sem.model.Customer;
import mmmd.teammmmd_eksamensprojekt2sem.model.Employee;
import mmmd.teammmmd_eksamensprojekt2sem.model.Status;
import mmmd.teammmmd_eksamensprojekt2sem.model.Task;
import mmmd.teammmmd_eksamensprojekt2sem.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
    /*
    #####################################
    #           Customer Methods        #
    #####################################
     */
    public List<Customer> getListOfCurrentCustomers() {
        return projectRepository.getListOfCurrentCustomers();
    }
    public void createCustomer(Customer customer) {
        projectRepository.createCustomer(customer);
    }

    /*
    #####################################
    #           CRUD Project            #
    #####################################
     */
    public void createProject(Project project) {
        projectRepository.createProject(project);
    }
    public List<Project> showAllProjects() {
        return projectRepository.showAllProjects();
    }
    public void updateProject(Project project) {
        projectRepository.updateProject(project);
    }
    public void deleteProject(Project project) throws SQLException {
        projectRepository.deleteProject(project);
    }

    /*
    ###########---LOOKUP METHODS---###########
     */
    public Project fetchSpecificProject(String projectTitle) {
        return projectRepository.fetchSpecificProject(projectTitle);
    }

    public List<Status> fetchAllStatus() {
        return projectRepository.fetchAllStatus();
    }
    public boolean checkIfProjectNameAlreadyExists(String projectTitle) {
        return projectRepository.checkIfProjectNameAlreadyExists(projectTitle);
    }
    public void setProjectID(Project project) {
        projectRepository.setProjectID(project);
    }
    /*
    ###########---EMPLOYEE METHODS---###########
     */
    public List<Employee> findPMEmployees() {
        return projectRepository.findPMEmployees();
    }
    public List<Employee> findBCEmployees() {
        return projectRepository.findBCEmployees();
    }
}

    /*
    #####################################
    #           CRUD Task            #
    #####################################
     */
    public void createTask(Task task) throws SQLException {
        projectRepository.createTask(task);
    }

    /*
    ###########---EMPLOYEE METHODS---###########
     */
    public List<Employee> findNonManagerEmployees() {
        return projectRepository.findNonManagerEmployees();
    }
}