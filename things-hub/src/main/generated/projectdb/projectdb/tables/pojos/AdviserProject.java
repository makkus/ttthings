/**
 * This class is generated by jOOQ
 */
package projectdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * Maps advisers into project
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdviserProject implements java.io.Serializable {

	private static final long serialVersionUID = 675154496;

	private Integer adviserid;
	private Integer projectid;
	private Integer adviserroleid;
	private String  notes;

	public AdviserProject() {}

	public AdviserProject(
		Integer adviserid,
		Integer projectid,
		Integer adviserroleid,
		String  notes
	) {
		this.adviserid = adviserid;
		this.projectid = projectid;
		this.adviserroleid = adviserroleid;
		this.notes = notes;
	}

	public Integer getAdviserid() {
		return this.adviserid;
	}

	public void setAdviserid(Integer adviserid) {
		this.adviserid = adviserid;
	}

	public Integer getProjectid() {
		return this.projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	public Integer getAdviserroleid() {
		return this.adviserroleid;
	}

	public void setAdviserroleid(Integer adviserroleid) {
		this.adviserroleid = adviserroleid;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}