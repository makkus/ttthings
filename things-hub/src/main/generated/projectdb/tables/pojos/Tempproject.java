/**
 * This class is generated by jOOQ
 */
package projectdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Tempproject implements java.io.Serializable {

    private static final long serialVersionUID = 686801215;

    private java.lang.Integer id;
    private java.lang.Integer lastvisited;
    private java.lang.String owner;
    private java.lang.String projectstring;

    public Tempproject() {
    }

    public Tempproject(
            java.lang.Integer id,
            java.lang.String owner,
            java.lang.Integer lastvisited,
            java.lang.String projectstring
    ) {
        this.id = id;
        this.owner = owner;
        this.lastvisited = lastvisited;
        this.projectstring = projectstring;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.lang.Integer getLastvisited() {
        return this.lastvisited;
    }

    public java.lang.String getOwner() {
        return this.owner;
    }

    public java.lang.String getProjectstring() {
        return this.projectstring;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public void setLastvisited(java.lang.Integer lastvisited) {
        this.lastvisited = lastvisited;
    }

    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }

    public void setProjectstring(java.lang.String projectstring) {
        this.projectstring = projectstring;
    }
}
