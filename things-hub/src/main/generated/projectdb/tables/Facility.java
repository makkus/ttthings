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
public class Facility extends org.jooq.impl.TableImpl<projectdb.tables.records.FacilityRecord> {

    /**
     * The singleton instance of <code>projectdb.facility</code>
     */
    public static final projectdb.tables.Facility FACILITY = new projectdb.tables.Facility();
    private static final long serialVersionUID = 402106604;
    /**
     * The column <code>projectdb.facility.id</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.FacilityRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>projectdb.facility.name</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.FacilityRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");
    /**
     * The column <code>projectdb.facility.siteId</code>.
     */
    public final org.jooq.TableField<projectdb.tables.records.FacilityRecord, java.lang.Integer> SITEID = createField("siteId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>projectdb.facility</code> table reference
     */
    public Facility() {
        this("facility", null);
    }

    /**
     * Create an aliased <code>projectdb.facility</code> table reference
     */
    public Facility(java.lang.String alias) {
        this(alias, projectdb.tables.Facility.FACILITY);
    }

    private Facility(java.lang.String alias, org.jooq.Table<projectdb.tables.records.FacilityRecord> aliased) {
        this(alias, aliased, null);
    }

    private Facility(java.lang.String alias, org.jooq.Table<projectdb.tables.records.FacilityRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, projectdb.Projectdb.PROJECTDB, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public projectdb.tables.Facility as(java.lang.String alias) {
        return new projectdb.tables.Facility(alias, this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.UniqueKey<projectdb.tables.records.FacilityRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<projectdb.tables.records.FacilityRecord>>asList(projectdb.Keys.KEY_FACILITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.UniqueKey<projectdb.tables.records.FacilityRecord> getPrimaryKey() {
        return projectdb.Keys.KEY_FACILITY_PRIMARY;
    }

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<projectdb.tables.records.FacilityRecord> getRecordType() {
        return projectdb.tables.records.FacilityRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.ForeignKey<projectdb.tables.records.FacilityRecord, ?>> getReferences() {
        return java.util.Arrays.<org.jooq.ForeignKey<projectdb.tables.records.FacilityRecord, ?>>asList(projectdb.Keys.FACILITY_IBFK_1);
    }

    /**
     * Rename this table
     */
    public projectdb.tables.Facility rename(java.lang.String name) {
        return new projectdb.tables.Facility(name, null);
    }
}
