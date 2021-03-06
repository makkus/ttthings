/**
 * This class is generated by jOOQ
 */
package projectdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectStatus extends org.jooq.impl.TableImpl<projectdb.tables.records.ProjectStatusRecord> {

    /**
     * The singleton instance of <code>projectdb.project_status</code>
     */
    public static final projectdb.tables.ProjectStatus PROJECT_STATUS = new projectdb.tables.ProjectStatus();
    private static final long serialVersionUID = 1420096000;
    /**
     * The column <code>projectdb.project_status.id</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.ProjectStatusRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>projectdb.project_status.name</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.ProjectStatusRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * Create a <code>projectdb.project_status</code> table reference
     */
    public ProjectStatus() {
        this("project_status", null);
    }

    /**
     * Create an aliased <code>projectdb.project_status</code> table reference
     */
    public ProjectStatus(java.lang.String alias) {
        this(alias, projectdb.tables.ProjectStatus.PROJECT_STATUS);
    }

    private ProjectStatus(java.lang.String alias, org.jooq.Table<projectdb.tables.records.ProjectStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProjectStatus(java.lang.String alias, org.jooq.Table<projectdb.tables.records.ProjectStatusRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, projectdb.Projectdb.PROJECTDB, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public projectdb.tables.ProjectStatus as(java.lang.String alias) {
        return new projectdb.tables.ProjectStatus(alias, this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Identity<projectdb.tables.records.ProjectStatusRecord, java.lang.Integer> getIdentity() {
        return projectdb.Keys.IDENTITY_PROJECT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.UniqueKey<projectdb.tables.records.ProjectStatusRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<projectdb.tables.records.ProjectStatusRecord>>asList(projectdb.Keys.KEY_PROJECT_STATUS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.UniqueKey<projectdb.tables.records.ProjectStatusRecord> getPrimaryKey() {
        return projectdb.Keys.KEY_PROJECT_STATUS_PRIMARY;
    }

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<projectdb.tables.records.ProjectStatusRecord> getRecordType() {
        return projectdb.tables.records.ProjectStatusRecord.class;
    }

    /**
     * Rename this table
     */
    public projectdb.tables.ProjectStatus rename(java.lang.String name) {
        return new projectdb.tables.ProjectStatus(name, null);
    }
}
