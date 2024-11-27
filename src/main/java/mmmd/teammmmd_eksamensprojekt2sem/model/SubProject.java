package mmmd.teammmmd_eksamensprojekt2sem.model;

public class SubProject {

    //Foreign keys skal med men ikke IDet
    String subProjectTitle;
    String subProjectDescription;
    int projectID;
    int statusID;

    public SubProject (String subprojectTitle, String subprojectDescription, int projectID, int statusID) {
        this.subProjectTitle = subprojectTitle;
        this.subProjectDescription = subprojectDescription;
        this.projectID = projectID;
        this.statusID = statusID;
    }

    public String getSubProjectTitle() {
        return subProjectTitle;
    }

    public String getSubProjectDescription() {
        return subProjectDescription;
    }

    public int getProjectID() {
        return projectID;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setSubProjectTitle(String subProjectTitle) {
        this.subProjectTitle = subProjectTitle;
    }

    public void setSubProjectDescription(String subProjectDescription) {
        this.subProjectDescription = subProjectDescription;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }
    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }
}
