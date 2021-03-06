/**
 * This class is generated by jOOQ
 */
package projectdb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectPropertiesRecord extends org.jooq.impl.UpdatableRecordImpl<projectdb.tables.records.ProjectPropertiesRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp> {

    private static final long serialVersionUID = -128141388;

    /**
     * Create a detached ProjectPropertiesRecord
     */
    public ProjectPropertiesRecord() {
        super(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES);
    }

    /**
     * Create a detached, initialised ProjectPropertiesRecord
     */
    public ProjectPropertiesRecord(java.lang.Integer id, java.lang.Integer projectid, java.lang.Integer facilityid, java.lang.String propname, java.lang.String propvalue, java.sql.Timestamp timestamp) {
        super(projectdb.tables.ProjectProperties.PROJECT_PROPERTIES);

        setValue(0, id);
        setValue(1, projectid);
        setValue(2, facilityid);
        setValue(3, propname);
        setValue(4, propvalue);
        setValue(5, timestamp);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field2() {
        return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROJECTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field3() {
        return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.FACILITYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field4() {
        return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROPNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field5() {
        return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.PROPVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.sql.Timestamp> field6() {
        return projectdb.tables.ProjectProperties.PROJECT_PROPERTIES.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
        return (org.jooq.Row6) super.fieldsRow();
    }

    /**
     * Getter for <code>projectdb.project_properties.facilityId</code>.
     */
    public java.lang.Integer getFacilityid() {
        return (java.lang.Integer) getValue(2);
    }

    /**
     * Getter for <code>projectdb.project_properties.id</code>.
     */
    public java.lang.Integer getId() {
        return (java.lang.Integer) getValue(0);
    }

    /**
     * Getter for <code>projectdb.project_properties.projectId</code>.
     */
    public java.lang.Integer getProjectid() {
        return (java.lang.Integer) getValue(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.project_properties.propname</code>.
     */
    public java.lang.String getPropname() {
        return (java.lang.String) getValue(3);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.project_properties.propvalue</code>.
     */
    public java.lang.String getPropvalue() {
        return (java.lang.String) getValue(4);
    }

    /**
     * Getter for <code>projectdb.project_properties.timestamp</code>.
     */
    public java.sql.Timestamp getTimestamp() {
        return (java.sql.Timestamp) getValue(5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * Setter for <code>projectdb.project_properties.facilityId</code>.
     */
    public void setFacilityid(java.lang.Integer value) {
        setValue(2, value);
    }

    /**
     * Setter for <code>projectdb.project_properties.id</code>.
     */
    public void setId(java.lang.Integer value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>projectdb.project_properties.projectId</code>.
     */
    public void setProjectid(java.lang.Integer value) {
        setValue(1, value);
    }

    /**
     * Setter for <code>projectdb.project_properties.propname</code>.
     */
    public void setPropname(java.lang.String value) {
        setValue(3, value);
    }

    /**
     * Setter for <code>projectdb.project_properties.propvalue</code>.
     */
    public void setPropvalue(java.lang.String value) {
        setValue(4, value);
    }

    /**
     * Setter for <code>projectdb.project_properties.timestamp</code>.
     */
    public void setTimestamp(java.sql.Timestamp value) {
        setValue(5, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectPropertiesRecord value1(java.lang.Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value2() {
        return getProjectid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectPropertiesRecord value2(java.lang.Integer value) {
        setProjectid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value3() {
        return getFacilityid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectPropertiesRecord value3(java.lang.Integer value) {
        setFacilityid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value4() {
        return getPropname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectPropertiesRecord value4(java.lang.String value) {
        setPropname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value5() {
        return getPropvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectPropertiesRecord value5(java.lang.String value) {
        setPropvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.sql.Timestamp value6() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectPropertiesRecord value6(java.sql.Timestamp value) {
        setTimestamp(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectPropertiesRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.String value4, java.lang.String value5, java.sql.Timestamp value6) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
        return (org.jooq.Row6) super.valuesRow();
    }
}
