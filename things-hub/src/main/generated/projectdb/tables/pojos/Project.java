/**
 * This class is generated by jOOQ
 */
package projectdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 * <p>
 * Holds the main information about projects
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Project implements java.io.Serializable {

    private static final long serialVersionUID = -1103788672;
    private java.lang.String description;
    private java.lang.String enddate;
    private java.lang.String hostinstitution;
    private java.lang.Integer id;
    private java.sql.Timestamp lastmodified;
    private java.lang.String name;
    private java.lang.String nextfollowupdate;
    private java.lang.String nextreviewdate;
    private java.lang.String notes;
    private java.lang.String projectcode;
    private java.lang.Integer projecttypeid;
    private java.lang.String requirements;
    private java.lang.String startdate;
    private java.lang.Integer statusid;
    private java.lang.String todo;

    public Project() {
    }

    public Project(
            java.lang.Integer id,
            java.lang.String projectcode,
            java.lang.Integer projecttypeid,
            java.lang.String name,
            java.lang.String description,
            java.lang.String hostinstitution,
            java.lang.String startdate,
            java.lang.String nextreviewdate,
            java.lang.String nextfollowupdate,
            java.lang.String enddate,
            java.lang.String requirements,
            java.lang.String notes,
            java.lang.String todo,
            java.lang.Integer statusid,
            java.sql.Timestamp lastmodified
    ) {
        this.id = id;
        this.projectcode = projectcode;
        this.projecttypeid = projecttypeid;
        this.name = name;
        this.description = description;
        this.hostinstitution = hostinstitution;
        this.startdate = startdate;
        this.nextreviewdate = nextreviewdate;
        this.nextfollowupdate = nextfollowupdate;
        this.enddate = enddate;
        this.requirements = requirements;
        this.notes = notes;
        this.todo = todo;
        this.statusid = statusid;
        this.lastmodified = lastmodified;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.String getEnddate() {
        return this.enddate;
    }

    public java.lang.String getHostinstitution() {
        return this.hostinstitution;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.sql.Timestamp getLastmodified() {
        return this.lastmodified;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getNextfollowupdate() {
        return this.nextfollowupdate;
    }

    public java.lang.String getNextreviewdate() {
        return this.nextreviewdate;
    }

    public java.lang.String getNotes() {
        return this.notes;
    }

    public java.lang.String getProjectcode() {
        return this.projectcode;
    }

    public java.lang.Integer getProjecttypeid() {
        return this.projecttypeid;
    }

    public java.lang.String getRequirements() {
        return this.requirements;
    }

    public java.lang.String getStartdate() {
        return this.startdate;
    }

    public java.lang.Integer getStatusid() {
        return this.statusid;
    }

    public java.lang.String getTodo() {
        return this.todo;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public void setEnddate(java.lang.String enddate) {
        this.enddate = enddate;
    }

    public void setHostinstitution(java.lang.String hostinstitution) {
        this.hostinstitution = hostinstitution;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public void setLastmodified(java.sql.Timestamp lastmodified) {
        this.lastmodified = lastmodified;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setNextfollowupdate(java.lang.String nextfollowupdate) {
        this.nextfollowupdate = nextfollowupdate;
    }

    public void setNextreviewdate(java.lang.String nextreviewdate) {
        this.nextreviewdate = nextreviewdate;
    }

    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }

    public void setProjectcode(java.lang.String projectcode) {
        this.projectcode = projectcode;
    }

    public void setProjecttypeid(java.lang.Integer projecttypeid) {
        this.projecttypeid = projecttypeid;
    }

    public void setRequirements(java.lang.String requirements) {
        this.requirements = requirements;
    }

    public void setStartdate(java.lang.String startdate) {
        this.startdate = startdate;
    }

    public void setStatusid(java.lang.Integer statusid) {
        this.statusid = statusid;
    }

    public void setTodo(java.lang.String todo) {
        this.todo = todo;
    }
}
