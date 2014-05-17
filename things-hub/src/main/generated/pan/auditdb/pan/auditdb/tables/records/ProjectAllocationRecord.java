/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.1"},
        comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectAllocationRecord extends org.jooq.impl.UpdatableRecordImpl<pan.auditdb.tables.records.ProjectAllocationRecord> implements org.jooq.Record6<String, Integer, Integer, Long, Long, String> {

    private static final long serialVersionUID = -979535755;

    /**
     * Create a detached ProjectAllocationRecord
     */
    public ProjectAllocationRecord() {
        super(pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION);
    }

    /**
     * Create a detached, initialised ProjectAllocationRecord
     */
    public ProjectAllocationRecord(String projectId, Integer projectStartDate, Integer projectFinishDate, Long allocationHours, Long allocationUsed, String allocationType) {
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
    public org.jooq.Field<String> field1() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Integer> field2() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.PROJECT_START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Integer> field3() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.PROJECT_FINISH_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Long> field4() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.ALLOCATION_HOURS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Long> field5() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.ALLOCATION_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field6() {
        return pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION.ALLOCATION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row6<String, Integer, Integer, Long, Long, String> fieldsRow() {
        return (org.jooq.Row6) super.fieldsRow();
    }

    /**
     * Getter for <code>pandora_audit.project_allocation.allocation_hours</code>.
     */
    public Long getAllocationHours() {
        return (Long) getValue(3);
    }

    /**
     * Getter for <code>pandora_audit.project_allocation.allocation_type</code>.
     */
    public String getAllocationType() {
        return (String) getValue(5);
    }

    /**
     * Getter for <code>pandora_audit.project_allocation.allocation_used</code>.
     */
    public Long getAllocationUsed() {
        return (Long) getValue(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pandora_audit.project_allocation.project_finish_date</code>.
     */
    public Integer getProjectFinishDate() {
        return (Integer) getValue(2);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pandora_audit.project_allocation.project_id</code>.
     */
    public String getProjectId() {
        return (String) getValue(0);
    }

    /**
     * Getter for <code>pandora_audit.project_allocation.project_start_date</code>.
     */
    public Integer getProjectStartDate() {
        return (Integer) getValue(1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<String> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.allocation_hours</code>.
     */
    public void setAllocationHours(Long value) {
        setValue(3, value);
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.allocation_type</code>.
     */
    public void setAllocationType(String value) {
        setValue(5, value);
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.allocation_used</code>.
     */
    public void setAllocationUsed(Long value) {
        setValue(4, value);
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.project_finish_date</code>.
     */
    public void setProjectFinishDate(Integer value) {
        setValue(2, value);
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.project_id</code>.
     */
    public void setProjectId(String value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>pandora_audit.project_allocation.project_start_date</code>.
     */
    public void setProjectStartDate(Integer value) {
        setValue(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value1(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getProjectStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value2(Integer value) {
        setProjectStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getProjectFinishDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value3(Integer value) {
        setProjectFinishDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getAllocationHours();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value4(Long value) {
        setAllocationHours(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getAllocationUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value5(Long value) {
        setAllocationUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAllocationType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectAllocationRecord value6(String value) {
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
    public ProjectAllocationRecord values(String value1, Integer value2, Integer value3, Long value4, Long value5, String value6) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row6<String, Integer, Integer, Long, Long, String> valuesRow() {
        return (org.jooq.Row6) super.valuesRow();
    }
}
