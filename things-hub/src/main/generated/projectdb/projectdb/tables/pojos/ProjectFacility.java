/**
 * This class is generated by jOOQ
 */
package projectdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectFacility implements java.io.Serializable {

    private static final long serialVersionUID = 677287272;
    private Integer facilityid;
    private Integer projectid;

    public ProjectFacility() {
    }

    public ProjectFacility(
            Integer projectid,
            Integer facilityid
    ) {
        this.projectid = projectid;
        this.facilityid = facilityid;
    }

    public Integer getFacilityid() {
        return this.facilityid;
    }

    public Integer getProjectid() {
        return this.projectid;
    }

    public void setFacilityid(Integer facilityid) {
        this.facilityid = facilityid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }
}
