/**
 * This class is generated by jOOQ
 */
package projectdb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProjecttypeRecord extends org.jooq.impl.UpdatableRecordImpl<projectdb.tables.records.ProjecttypeRecord> implements org.jooq.Record2<Integer, String> {

    private static final long serialVersionUID = 330102389;

    /**
     * Create a detached ProjecttypeRecord
     */
    public ProjecttypeRecord() {
        super(projectdb.tables.Projecttype.PROJECTTYPE);
    }

    /**
     * Create a detached, initialised ProjecttypeRecord
     */
    public ProjecttypeRecord(Integer id, String name) {
        super(projectdb.tables.Projecttype.PROJECTTYPE);

        setValue(0, id);
        setValue(1, name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Integer> field1() {
        return projectdb.tables.Projecttype.PROJECTTYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field2() {
        return projectdb.tables.Projecttype.PROJECTTYPE.NAME;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<Integer, String> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.projecttype.id</code>.
     */
    public Integer getId() {
        return (Integer) getValue(0);
    }

    /**
     * Getter for <code>projectdb.projecttype.name</code>.
     */
    public String getName() {
        return (String) getValue(1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * Setter for <code>projectdb.projecttype.id</code>.
     */
    public void setId(Integer value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>projectdb.projecttype.name</code>.
     */
    public void setName(String value) {
        setValue(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjecttypeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjecttypeRecord value2(String value) {
        setName(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjecttypeRecord values(Integer value1, String value2) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<Integer, String> valuesRow() {
        return (org.jooq.Row2) super.valuesRow();
    }
}
