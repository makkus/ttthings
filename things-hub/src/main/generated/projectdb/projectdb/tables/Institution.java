/**
 * This class is generated by jOOQ
 */
package projectdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Institution extends org.jooq.impl.TableImpl<projectdb.tables.records.InstitutionRecord> {

	private static final long serialVersionUID = 361574710;

	/**
	 * The singleton instance of <code>projectdb.institution</code>
	 */
	public static final projectdb.tables.Institution INSTITUTION = new projectdb.tables.Institution();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<projectdb.tables.records.InstitutionRecord> getRecordType() {
		return projectdb.tables.records.InstitutionRecord.class;
	}

	/**
	 * The column <code>projectdb.institution.id</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.InstitutionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>projectdb.institution.name</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.InstitutionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>projectdb.institution.code</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.InstitutionRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * Create a <code>projectdb.institution</code> table reference
	 */
	public Institution() {
		this("institution", null);
	}

	/**
	 * Create an aliased <code>projectdb.institution</code> table reference
	 */
	public Institution(String alias) {
		this(alias, projectdb.tables.Institution.INSTITUTION);
	}

	private Institution(String alias, org.jooq.Table<projectdb.tables.records.InstitutionRecord> aliased) {
		this(alias, aliased, null);
	}

	private Institution(String alias, org.jooq.Table<projectdb.tables.records.InstitutionRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, projectdb.Projectdb.PROJECTDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<projectdb.tables.records.InstitutionRecord, Integer> getIdentity() {
		return projectdb.Keys.IDENTITY_INSTITUTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<projectdb.tables.records.InstitutionRecord> getPrimaryKey() {
		return projectdb.Keys.KEY_INSTITUTION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<projectdb.tables.records.InstitutionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<projectdb.tables.records.InstitutionRecord>>asList(projectdb.Keys.KEY_INSTITUTION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public projectdb.tables.Institution as(String alias) {
		return new projectdb.tables.Institution(alias, this);
	}

	/**
	 * Rename this table
	 */
	public projectdb.tables.Institution rename(String name) {
		return new projectdb.tables.Institution(name, null);
	}
}