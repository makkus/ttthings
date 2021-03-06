/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables;

/**
 * This class is generated by jOOQ.
 * <p>
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AuditAdmin extends org.jooq.impl.TableImpl<pan.auditdb.tables.records.AuditAdminRecord> {

    /**
     * The singleton instance of <code>pandora_audit.audit_admin</code>
     */
    public static final pan.auditdb.tables.AuditAdmin AUDIT_ADMIN = new pan.auditdb.tables.AuditAdmin();
    private static final long serialVersionUID = 872918135;
    /**
     * The column <code>pandora_audit.audit_admin.tuakiriUniqueId</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.AuditAdminRecord, java.lang.String> TUAKIRIUNIQUEID = createField("tuakiriUniqueId", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * Create a <code>pandora_audit.audit_admin</code> table reference
     */
    public AuditAdmin() {
        this("audit_admin", null);
    }

    /**
     * Create an aliased <code>pandora_audit.audit_admin</code> table reference
     */
    public AuditAdmin(java.lang.String alias) {
        this(alias, pan.auditdb.tables.AuditAdmin.AUDIT_ADMIN);
    }

    private AuditAdmin(java.lang.String alias, org.jooq.Table<pan.auditdb.tables.records.AuditAdminRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditAdmin(java.lang.String alias, org.jooq.Table<pan.auditdb.tables.records.AuditAdminRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, pan.auditdb.PandoraAudit.PANDORA_AUDIT, aliased, parameters, "InnoDB free: 8458240 kB");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public pan.auditdb.tables.AuditAdmin as(java.lang.String alias) {
        return new pan.auditdb.tables.AuditAdmin(alias, this);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<pan.auditdb.tables.records.AuditAdminRecord> getRecordType() {
        return pan.auditdb.tables.records.AuditAdminRecord.class;
    }

    /**
     * Rename this table
     */
    public pan.auditdb.tables.AuditAdmin rename(java.lang.String name) {
        return new pan.auditdb.tables.AuditAdmin(name, null);
    }
}
