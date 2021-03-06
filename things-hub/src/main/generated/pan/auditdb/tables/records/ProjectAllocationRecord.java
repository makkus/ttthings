/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables.records;

/**
 * This class is generated by jOOQ.
 * <p>
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectAllocationRecord extends org.jooq.impl.UpdatableRecordImpl<pan.auditdb.tables.records.ProjectAllocationRecord> implements org.jooq.Record6<java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String> {

    private static final long serialVersionUID = -77583712;

    /**
     * Create a detached ProjectAllocationRecord
     */
    public ProjectAllocationRecord() {
        super(pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION);
    }

    /**
     * Create a detached, initialised ProjectAllocationRecord
     */
    public ProjectAllocationRecord(java.lang.String projectId, java.lang.Integer projectStartDate, java.lang.Integer projectFinishDate, java.lang.Long allocationHours, java.lang.Long allocationUsed, java.lang.String allocationType) {
        super(pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION);

        setValue(0, projectId);
        setValue(1, projectStartDate);
        setValue(2, projectFinishDate);
        setValue(3, allocationHours);
        setValue(4, allocationUsed);
        setValue(5, allocationType);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field1() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field2() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.PROJECT_START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field3() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.PROJECT_FINISH_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Long> field4() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.ALLOCATION_HOURS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Long> field5() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.ALLOCATION_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field6() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.ALLOCATION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row6<java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String> fieldsRow() {
        return (org.jooq.Row6) super.fieldsRow();
    }

    /**
     * Getter for <code>pandora_audit.project_allocation.allocation_hours</code>.
     */
    public java.lang.Long getAllocationHours() {
        return (java.lang.Long) getValue(3);
    }

    /**
     * Getter for <code>pandora_audit.project_allocation.allocation_type</code>.
     */
    public java.lang.String getAllocationType() {
        return (java.lang.String) getValue(5);
    }

    /**
     * Getter for <code>pandora_audit.project_allocation.allocation_used</code>.
     */
    public java.lang.Long getAllocationUsed() {
        return (java.lang.Long) getValue(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pandora_audit.project_allocation.project_finish_date</code>.
     */
    public java.lang.Integer getProjectFinishDate() {
        return (java.lang.Integer) getValue(2);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pandora_audit.project_allocation.project_id</code>.
     */
    public java.lang.String getProjectId() {
        return (java.lang.String) getValue(0);
    }

    /**
     * Getter for <code>pandora_audit.project_allocation.project_start_date</code>.
     */
    public java.lang.Integer getProjectStartDate() {
        return (java.lang.Integer) getValue(1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<java.lang.String> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.allocation_hours</code>.
     */
    public void setAllocationHours(java.lang.Long value) {
        setValue(3, value);
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.allocation_type</code>.
     */
    public void setAllocationType(java.lang.String value) {
        setValue(5, value);
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.allocation_used</code>.
     */
    public void setAllocationUsed(java.lang.Long value) {
        setValue(4, value);
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.project_finish_date</code>.
     */
    public void setProjectFinishDate(java.lang.Integer value) {
        setValue(2, value);
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.project_id</code>.
     */
    public void setProjectId(java.lang.String value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.project_start_date</code>.
     */
    public void setProjectStartDate(java.lang.Integer value) {
        setValue(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value1() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value1(java.lang.String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value2() {
        return getProjectStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value2(java.lang.Integer value) {
        setProjectStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value3() {
        return getProjectFinishDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value3(java.lang.Integer value) {
        setProjectFinishDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Long value4() {
        return getAllocationHours();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value4(java.lang.Long value) {
        setAllocationHours(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Long value5() {
        return getAllocationUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value5(java.lang.Long value) {
        setAllocationUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value6() {
        return getAllocationType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value6(java.lang.String value) {
        setAllocationType(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord values(java.lang.String value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Long value4, java.lang.Long value5, java.lang.String value6) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row6<java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.String> valuesRow() {
        return (org.jooq.Row6) super.valuesRow();
    }
}
