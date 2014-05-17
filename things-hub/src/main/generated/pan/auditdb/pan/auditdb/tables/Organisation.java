/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.1"},
        comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Organisation extends org.jooq.impl.TableImpl<pan.auditdb.tables.records.OrganisationRecord> {

    /**
     * The singleton instance of <code>pandora_audit.organisation</code>
     */
    public static final pan.auditdb.tables.Organisation ORGANISATION = new pan.auditdb.tables.Organisation();
    private static final long serialVersionUID = 62045103;
    /**
     * The column <code>pandora_audit.organisation.collaborator</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.OrganisationRecord, Integer> COLLABORATOR = createField("collaborator", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");
    /**
     * The column <code>pandora_audit.organisation.id</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.OrganisationRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(25).nullable(false), this, "");

    /**
     * The column <code>pandora_audit.organisation.name</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.OrganisationRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * Create a <code>pandora_audit.organisation</code> table reference
     */
    public Organisation() {
        this("organisation", null);
    }

    /**
     * Create an aliased <code>pandora_audit.organisation</code> table reference
     */
    public Organisation(String alias) {
        this(alias, pan.auditdb.tables.Organisation.ORGANISATION);
    }

    private Organisation(String alias, org.jooq.Table<pan.auditdb.tables.records.OrganisationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Organisation(String alias, org.jooq.Table<pan.auditdb.tables.records.OrganisationRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, pan.auditdb.PandoraAudit.PANDORA_AUDIT, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public pan.auditdb.tables.Organisation as(String alias) {
        return new pan.auditdb.tables.Organisation(alias, this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.UniqueKey<pan.auditdb.tables.records.OrganisationRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<pan.auditdb.tables.records.OrganisationRecord>>asList(pan.auditdb.Keys.KEY_ORGANISATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.UniqueKey<pan.auditdb.tables.records.OrganisationRecord> getPrimaryKey() {
        return pan.auditdb.Keys.KEY_ORGANISATION_PRIMARY;
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<pan.auditdb.tables.records.OrganisationRecord> getRecordType() {
        return pan.auditdb.tables.records.OrganisationRecord.class;
    }

    /**
     * Rename this table
     */
    public pan.auditdb.tables.Organisation rename(String name) {
        return new pan.auditdb.tables.Organisation(name, null);
    }
}
