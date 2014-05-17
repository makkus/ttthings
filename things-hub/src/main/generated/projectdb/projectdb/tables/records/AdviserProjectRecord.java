/**
 * This class is generated by jOOQ
 */
package projectdb.tables.records;

/**
 * This class is generated by jOOQ.
 * <p>
 * Maps advisers into project
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AdviserProjectRecord extends org.jooq.impl.TableRecordImpl<projectdb.tables.records.AdviserProjectRecord> implements org.jooq.Record4<Integer, Integer, Integer, String> {

    private static final long serialVersionUID = -17436355;

    /**
     * Create a detached AdviserProjectRecord
     */
    public AdviserProjectRecord() {
        super(projectdb.tables.AdviserProject.ADVISER_PROJECT);
    }

    /**
     * Create a detached, initialised AdviserProjectRecord
     */
    public AdviserProjectRecord(Integer adviserid, Integer projectid, Integer adviserroleid, String notes) {
        super(projectdb.tables.AdviserProject.ADVISER_PROJECT);

        setValue(0, adviserid);
        setValue(1, projectid);
        setValue(2, adviserroleid);
        setValue(3, notes);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Integer> field1() {
        return projectdb.tables.AdviserProject.ADVISER_PROJECT.ADVISERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Integer> field2() {
        return projectdb.tables.AdviserProject.ADVISER_PROJECT.PROJECTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Integer> field3() {
        return projectdb.tables.AdviserProject.ADVISER_PROJECT.ADVISERROLEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field4() {
        return projectdb.tables.AdviserProject.ADVISER_PROJECT.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row4<Integer, Integer, Integer, String> fieldsRow() {
        return (org.jooq.Row4) super.fieldsRow();
    }

    /**
     * Getter for <code>projectdb.adviser_project.adviserId</code>.
     */
    public Integer getAdviserid() {
        return (Integer) getValue(0);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.adviser_project.adviserRoleId</code>.
     */
    public Integer getAdviserroleid() {
        return (Integer) getValue(2);
    }

    /**
     * Getter for <code>projectdb.adviser_project.notes</code>. Additional notes on this APLink
     */
    public String getNotes() {
        return (String) getValue(3);
    }

    /**
     * Getter for <code>projectdb.adviser_project.projectId</code>.
     */
    public Integer getProjectid() {
        return (Integer) getValue(1);
    }

    /**
     * Setter for <code>projectdb.adviser_project.adviserId</code>.
     */
    public void setAdviserid(Integer value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>projectdb.adviser_project.adviserRoleId</code>.
     */
    public void setAdviserroleid(Integer value) {
        setValue(2, value);
    }

    /**
     * Setter for <code>projectdb.adviser_project.notes</code>. Additional notes on this APLink
     */
    public void setNotes(String value) {
        setValue(3, value);
    }

    /**
     * Setter for <code>projectdb.adviser_project.projectId</code>.
     */
    public void setProjectid(Integer value) {
        setValue(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAdviserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserProjectRecord value1(Integer value) {
        setAdviserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getProjectid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserProjectRecord value2(Integer value) {
        setProjectid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getAdviserroleid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserProjectRecord value3(Integer value) {
        setAdviserroleid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserProjectRecord value4(String value) {
        setNotes(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserProjectRecord values(Integer value1, Integer value2, Integer value3, String value4) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row4<Integer, Integer, Integer, String> valuesRow() {
        return (org.jooq.Row4) super.valuesRow();
    }
}
