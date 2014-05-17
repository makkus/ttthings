/**
 * This class is generated by jOOQ
 */
package projectdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjectFacility extends org.jooq.impl.TableImpl<projectdb.tables.records.ProjectFacilityRecord> {

    /**
     * The singleton instance of <code>projectdb.project_facility</code>
     */
    public static final projectdb.tables.ProjectFacility PROJECT_FACILITY = new projectdb.tables.ProjectFacility();
    private static final long serialVersionUID = 1338014110;
    /**
     * The column <code>projectdb.project_facility.facilityId</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.ProjectFacilityRecord, Integer> FACILITYID = createField("facilityId", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>projectdb.project_facility.projectId</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.ProjectFacilityRecord, Integer> PROJECTID = createField("projectId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>projectdb.project_facility</code> table reference
     */
    public ProjectFacility() {
        this("project_facility", null);
    }

    /**
     * Create an aliased <code>projectdb.project_facility</code> table reference
     */
    public ProjectFacility(String alias) {
        this(alias, projectdb.tables.ProjectFacility.PROJECT_FACILITY);
    }

    private ProjectFacility(String alias, org.jooq.Table<projectdb.tables.records.ProjectFacilityRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProjectFacility(String alias, org.jooq.Table<projectdb.tables.records.ProjectFacilityRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, projectdb.Projectdb.PROJECTDB, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public projectdb.tables.ProjectFacility as(String alias) {
        return new projectdb.tables.ProjectFacility(alias, this);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<projectdb.tables.records.ProjectFacilityRecord> getRecordType() {
        return projectdb.tables.records.ProjectFacilityRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.ForeignKey<projectdb.tables.records.ProjectFacilityRecord, ?>> getReferences() {
        return java.util.Arrays.<org.jooq.ForeignKey<projectdb.tables.records.ProjectFacilityRecord, ?>>asList(projectdb.Keys.PROJECT_FACILITY_IBFK_1);
    }

    /**
     * Rename this table
     */
    public projectdb.tables.ProjectFacility rename(String name) {
        return new projectdb.tables.ProjectFacility(name, null);
    }
}
