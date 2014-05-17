/**
 * This class is generated by jOOQ
 */
package projectdb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectStatusRecord extends org.jooq.impl.UpdatableRecordImpl<projectdb.tables.records.ProjectStatusRecord> implements org.jooq.Record2<Integer, String> {

    private static final long serialVersionUID = 1322775219;

    /**
     * Create a detached ProjectStatusRecord
     */
    public ProjectStatusRecord() {
        super(projectdb.tables.ProjectStatus.PROJECT_STATUS);
    }

    /**
     * Create a detached, initialised ProjectStatusRecord
     */
    public ProjectStatusRecord(Integer id, String name) {
        super(projectdb.tables.ProjectStatus.PROJECT_STATUS);

        setValue(0, id);
        setValue(1, name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Integer> field1() {
        return projectdb.tables.ProjectStatus.PROJECT_STATUS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field2() {
        return projectdb.tables.ProjectStatus.PROJECT_STATUS.NAME;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<Integer, String> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.project_status.id</code>.
     */
    public Integer getId() {
        return (Integer) getValue(0);
    }

    /**
     * Getter for <code>projectdb.project_status.name</code>.
     */
    public String getName() {
        return (String) getValue(1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * Setter for <code>projectdb.project_status.id</code>.
     */
    public void setId(Integer value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>projectdb.project_status.name</code>.
     */
    public void setName(String value) {
        setValue(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectStatusRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectStatusRecord value2(String value) {
        setName(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectStatusRecord values(Integer value1, String value2) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<Integer, String> valuesRow() {
        return (org.jooq.Row2) super.valuesRow();
    }
}
