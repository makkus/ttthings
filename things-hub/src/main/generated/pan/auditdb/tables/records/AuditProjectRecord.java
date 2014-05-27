/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuditProjectRecord extends org.jooq.impl.TableRecordImpl<pan.auditdb.tables.records.AuditProjectRecord> implements org.jooq.Record9<java.lang.String, java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal> {

	private static final long serialVersionUID = 774520792;

	/**
	 * Setter for <code>pandora_audit.audit_project.user</code>.
	 */
	public void setUser(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>pandora_audit.audit_project.user</code>.
	 */
	public java.lang.String getUser() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>pandora_audit.audit_project.cores</code>.
	 */
	public void setCores(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>pandora_audit.audit_project.cores</code>.
	 */
	public java.lang.Integer getCores() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>pandora_audit.audit_project.grid_jobs</code>.
	 */
	public void setGridJobs(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>pandora_audit.audit_project.grid_jobs</code>.
	 */
	public java.lang.Integer getGridJobs() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>pandora_audit.audit_project.total_grid_core_hours</code>.
	 */
	public void setTotalGridCoreHours(java.math.BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>pandora_audit.audit_project.total_grid_core_hours</code>.
	 */
	public java.math.BigDecimal getTotalGridCoreHours() {
		return (java.math.BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>pandora_audit.audit_project.project</code>.
	 */
	public void setProject(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>pandora_audit.audit_project.project</code>.
	 */
	public java.lang.String getProject() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>pandora_audit.audit_project.jobtype</code>.
	 */
	public void setJobtype(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>pandora_audit.audit_project.jobtype</code>.
	 */
	public java.lang.String getJobtype() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>pandora_audit.audit_project.done</code>.
	 */
	public void setDone(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>pandora_audit.audit_project.done</code>.
	 */
	public java.lang.Integer getDone() {
		return (java.lang.Integer) getValue(6);
	}

	/**
	 * Setter for <code>pandora_audit.audit_project.core_hours</code>.
	 */
	public void setCoreHours(java.math.BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>pandora_audit.audit_project.core_hours</code>.
	 */
	public java.math.BigDecimal getCoreHours() {
		return (java.math.BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>pandora_audit.audit_project.waiting_time</code>.
	 */
	public void setWaitingTime(java.math.BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>pandora_audit.audit_project.waiting_time</code>.
	 */
	public java.math.BigDecimal getWaitingTime() {
		return (java.math.BigDecimal) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.String, java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.String, java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return pan.auditdb.tables.AuditProject.AUDIT_PROJECT.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return pan.auditdb.tables.AuditProject.AUDIT_PROJECT.CORES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return pan.auditdb.tables.AuditProject.AUDIT_PROJECT.GRID_JOBS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field4() {
		return pan.auditdb.tables.AuditProject.AUDIT_PROJECT.TOTAL_GRID_CORE_HOURS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return pan.auditdb.tables.AuditProject.AUDIT_PROJECT.PROJECT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return pan.auditdb.tables.AuditProject.AUDIT_PROJECT.JOBTYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return pan.auditdb.tables.AuditProject.AUDIT_PROJECT.DONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field8() {
		return pan.auditdb.tables.AuditProject.AUDIT_PROJECT.CORE_HOURS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field9() {
		return pan.auditdb.tables.AuditProject.AUDIT_PROJECT.WAITING_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getCores();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getGridJobs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value4() {
		return getTotalGridCoreHours();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getProject();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getJobtype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getDone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value8() {
		return getCoreHours();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value9() {
		return getWaitingTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuditProjectRecord value1(java.lang.String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuditProjectRecord value2(java.lang.Integer value) {
		setCores(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuditProjectRecord value3(java.lang.Integer value) {
		setGridJobs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuditProjectRecord value4(java.math.BigDecimal value) {
		setTotalGridCoreHours(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuditProjectRecord value5(java.lang.String value) {
		setProject(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuditProjectRecord value6(java.lang.String value) {
		setJobtype(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuditProjectRecord value7(java.lang.Integer value) {
		setDone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuditProjectRecord value8(java.math.BigDecimal value) {
		setCoreHours(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuditProjectRecord value9(java.math.BigDecimal value) {
		setWaitingTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AuditProjectRecord values(java.lang.String value1, java.lang.Integer value2, java.lang.Integer value3, java.math.BigDecimal value4, java.lang.String value5, java.lang.String value6, java.lang.Integer value7, java.math.BigDecimal value8, java.math.BigDecimal value9) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AuditProjectRecord
	 */
	public AuditProjectRecord() {
		super(pan.auditdb.tables.AuditProject.AUDIT_PROJECT);
	}

	/**
	 * Create a detached, initialised AuditProjectRecord
	 */
	public AuditProjectRecord(java.lang.String user, java.lang.Integer cores, java.lang.Integer gridJobs, java.math.BigDecimal totalGridCoreHours, java.lang.String project, java.lang.String jobtype, java.lang.Integer done, java.math.BigDecimal coreHours, java.math.BigDecimal waitingTime) {
		super(pan.auditdb.tables.AuditProject.AUDIT_PROJECT);

		setValue(0, user);
		setValue(1, cores);
		setValue(2, gridJobs);
		setValue(3, totalGridCoreHours);
		setValue(4, project);
		setValue(5, jobtype);
		setValue(6, done);
		setValue(7, coreHours);
		setValue(8, waitingTime);
	}
}