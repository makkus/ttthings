/**
 * This class is generated by jOOQ
 */
package projectdb.tables.records;

/**
 * This class is generated by jOOQ.
 * <p>
 * NeSI and CeR staff
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AdviserRecord extends org.jooq.impl.UpdatableRecordImpl<projectdb.tables.records.AdviserRecord> implements org.jooq.Record16<Integer, String, String, String, String, String, String, String, String, String, String, String, Byte, String, String, java.sql.Timestamp> {

    private static final long serialVersionUID = 1378604107;

    /**
     * Create a detached AdviserRecord
     */
    public AdviserRecord() {
        super(projectdb.tables.Adviser.ADVISER);
    }

    /**
     * Create a detached, initialised AdviserRecord
     */
    public AdviserRecord(Integer id, String fullname, String email, String phone, String address, String institution, String division, String department, String pictureurl, String startdate, String enddate, String notes, Byte isadmin, String tuakiriuniqueid, String tuakiritoken, java.sql.Timestamp lastmodified) {
        super(projectdb.tables.Adviser.ADVISER);

        setValue(0, id);
        setValue(1, fullname);
        setValue(2, email);
        setValue(3, phone);
        setValue(4, address);
        setValue(5, institution);
        setValue(6, division);
        setValue(7, department);
        setValue(8, pictureurl);
        setValue(9, startdate);
        setValue(10, enddate);
        setValue(11, notes);
        setValue(12, isadmin);
        setValue(13, tuakiriuniqueid);
        setValue(14, tuakiritoken);
        setValue(15, lastmodified);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Integer> field1() {
        return projectdb.tables.Adviser.ADVISER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field10() {
        return projectdb.tables.Adviser.ADVISER.STARTDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field11() {
        return projectdb.tables.Adviser.ADVISER.ENDDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field12() {
        return projectdb.tables.Adviser.ADVISER.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<Byte> field13() {
        return projectdb.tables.Adviser.ADVISER.ISADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field14() {
        return projectdb.tables.Adviser.ADVISER.TUAKIRIUNIQUEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field15() {
        return projectdb.tables.Adviser.ADVISER.TUAKIRITOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.sql.Timestamp> field16() {
        return projectdb.tables.Adviser.ADVISER.LASTMODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field2() {
        return projectdb.tables.Adviser.ADVISER.FULLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field3() {
        return projectdb.tables.Adviser.ADVISER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field4() {
        return projectdb.tables.Adviser.ADVISER.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field5() {
        return projectdb.tables.Adviser.ADVISER.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field6() {
        return projectdb.tables.Adviser.ADVISER.INSTITUTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field7() {
        return projectdb.tables.Adviser.ADVISER.DIVISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field8() {
        return projectdb.tables.Adviser.ADVISER.DEPARTMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<String> field9() {
        return projectdb.tables.Adviser.ADVISER.PICTUREURL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row16<Integer, String, String, String, String, String, String, String, String, String, String, String, Byte, String, String, java.sql.Timestamp> fieldsRow() {
        return (org.jooq.Row16) super.fieldsRow();
    }

    /**
     * Getter for <code>projectdb.adviser.address</code>.
     */
    public String getAddress() {
        return (String) getValue(4);
    }

    /**
     * Getter for <code>projectdb.adviser.department</code>.
     */
    public String getDepartment() {
        return (String) getValue(7);
    }

    /**
     * Getter for <code>projectdb.adviser.division</code>.
     */
    public String getDivision() {
        return (String) getValue(6);
    }

    /**
     * Getter for <code>projectdb.adviser.email</code>.
     */
    public String getEmail() {
        return (String) getValue(2);
    }

    /**
     * Getter for <code>projectdb.adviser.endDate</code>.
     */
    public String getEnddate() {
        return (String) getValue(10);
    }

    /**
     * Getter for <code>projectdb.adviser.fullName</code>.
     */
    public String getFullname() {
        return (String) getValue(1);
    }

    /**
     * Getter for <code>projectdb.adviser.id</code>.
     */
    public Integer getId() {
        return (Integer) getValue(0);
    }

    /**
     * Getter for <code>projectdb.adviser.institution</code>.
     */
    public String getInstitution() {
        return (String) getValue(5);
    }

    /**
     * Getter for <code>projectdb.adviser.isAdmin</code>.
     */
    public Byte getIsadmin() {
        return (Byte) getValue(12);
    }

    /**
     * Getter for <code>projectdb.adviser.lastModified</code>. Indicates when this record was last modified
     */
    public java.sql.Timestamp getLastmodified() {
        return (java.sql.Timestamp) getValue(15);
    }

    /**
     * Getter for <code>projectdb.adviser.notes</code>.
     */
    public String getNotes() {
        return (String) getValue(11);
    }

    /**
     * Getter for <code>projectdb.adviser.phone</code>.
     */
    public String getPhone() {
        return (String) getValue(3);
    }

    /**
     * Getter for <code>projectdb.adviser.pictureUrl</code>.
     */
    public String getPictureurl() {
        return (String) getValue(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.adviser.startDate</code>.
     */
    public String getStartdate() {
        return (String) getValue(9);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>projectdb.adviser.tuakiriToken</code>.
     */
    public String getTuakiritoken() {
        return (String) getValue(14);
    }

    /**
     * Getter for <code>projectdb.adviser.tuakiriUniqueId</code>.
     */
    public String getTuakiriuniqueid() {
        return (String) getValue(13);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * Setter for <code>projectdb.adviser.address</code>.
     */
    public void setAddress(String value) {
        setValue(4, value);
    }

    /**
     * Setter for <code>projectdb.adviser.department</code>.
     */
    public void setDepartment(String value) {
        setValue(7, value);
    }

    /**
     * Setter for <code>projectdb.adviser.division</code>.
     */
    public void setDivision(String value) {
        setValue(6, value);
    }

    /**
     * Setter for <code>projectdb.adviser.email</code>.
     */
    public void setEmail(String value) {
        setValue(2, value);
    }

    /**
     * Setter for <code>projectdb.adviser.endDate</code>.
     */
    public void setEnddate(String value) {
        setValue(10, value);
    }

    /**
     * Setter for <code>projectdb.adviser.fullName</code>.
     */
    public void setFullname(String value) {
        setValue(1, value);
    }

    /**
     * Setter for <code>projectdb.adviser.id</code>.
     */
    public void setId(Integer value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>projectdb.adviser.institution</code>.
     */
    public void setInstitution(String value) {
        setValue(5, value);
    }

    /**
     * Setter for <code>projectdb.adviser.isAdmin</code>.
     */
    public void setIsadmin(Byte value) {
        setValue(12, value);
    }

    /**
     * Setter for <code>projectdb.adviser.lastModified</code>. Indicates when this record was last modified
     */
    public void setLastmodified(java.sql.Timestamp value) {
        setValue(15, value);
    }

    /**
     * Setter for <code>projectdb.adviser.notes</code>.
     */
    public void setNotes(String value) {
        setValue(11, value);
    }

    /**
     * Setter for <code>projectdb.adviser.phone</code>.
     */
    public void setPhone(String value) {
        setValue(3, value);
    }

    /**
     * Setter for <code>projectdb.adviser.pictureUrl</code>.
     */
    public void setPictureurl(String value) {
        setValue(8, value);
    }

    /**
     * Setter for <code>projectdb.adviser.startDate</code>.
     */
    public void setStartdate(String value) {
        setValue(9, value);
    }

    /**
     * Setter for <code>projectdb.adviser.tuakiriToken</code>.
     */
    public void setTuakiritoken(String value) {
        setValue(14, value);
    }

    /**
     * Setter for <code>projectdb.adviser.tuakiriUniqueId</code>.
     */
    public void setTuakiriuniqueid(String value) {
        setValue(13, value);
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
    public AdviserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getStartdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value10(String value) {
        setStartdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getEnddate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value11(String value) {
        setEnddate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value12(String value) {
        setNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getIsadmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value13(Byte value) {
        setIsadmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getTuakiriuniqueid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value14(String value) {
        setTuakiriuniqueid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getTuakiritoken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value15(String value) {
        setTuakiritoken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.sql.Timestamp value16() {
        return getLastmodified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value16(java.sql.Timestamp value) {
        setLastmodified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFullname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value2(String value) {
        setFullname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value4(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value5(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getInstitution();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value6(String value) {
        setInstitution(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDivision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value7(String value) {
        setDivision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDepartment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value8(String value) {
        setDepartment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPictureurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord value9(String value) {
        setPictureurl(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public AdviserRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, Byte value13, String value14, String value15, java.sql.Timestamp value16) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row16<Integer, String, String, String, String, String, String, String, String, String, String, String, Byte, String, String, java.sql.Timestamp> valuesRow() {
        return (org.jooq.Row16) super.valuesRow();
    }
}
