/**
 * This class is generated by jOOQ
 */
package projectdb.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ResearcherDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.ResearcherRecord, projectdb.tables.pojos.Researcher, Integer> {

    /**
     * Create a new ResearcherDao without any panAuditConfiguration
     */
    public ResearcherDao() {
        super(projectdb.tables.Researcher.RESEARCHER, projectdb.tables.pojos.Researcher.class);
    }

    /**
     * Create a new ResearcherDao with an attached panAuditConfiguration
     */
    public ResearcherDao(org.jooq.Configuration configuration) {
        super(projectdb.tables.Researcher.RESEARCHER, projectdb.tables.pojos.Researcher.class, configuration);
    }

    /**
     * Fetch records that have <code>department IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByDepartment(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.DEPARTMENT, values);
    }

    /**
     * Fetch records that have <code>division IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByDivision(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.DIVISION, values);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByEmail(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>endDate IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByEnddate(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.ENDDATE, values);
    }

    /**
     * Fetch records that have <code>fullName IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByFullname(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.FULLNAME, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchById(Integer... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.ID, values);
    }

    /**
     * Fetch records that have <code>institution IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByInstitution(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.INSTITUTION, values);
    }

    /**
     * Fetch records that have <code>institutionalRoleId IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByInstitutionalroleid(Integer... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.INSTITUTIONALROLEID, values);
    }

    /**
     * Fetch records that have <code>lastModified IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByLastmodified(java.sql.Timestamp... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.LASTMODIFIED, values);
    }

    /**
     * Fetch records that have <code>notes IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByNotes(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.NOTES, values);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByPhone(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.PHONE, values);
    }

    /**
     * Fetch records that have <code>pictureUrl IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByPictureurl(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.PICTUREURL, values);
    }

    /**
     * Fetch records that have <code>preferredName IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByPreferredname(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.PREFERREDNAME, values);
    }

    /**
     * Fetch records that have <code>startDate IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByStartdate(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.STARTDATE, values);
    }

    /**
     * Fetch records that have <code>statusId IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByStatusid(Integer... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.STATUSID, values);
    }

    /**
     * Fetch records that have <code>tuakiriToken IN (values)</code>
     */
    public java.util.List<projectdb.tables.pojos.Researcher> fetchByTuakiritoken(String... values) {
        return fetch(projectdb.tables.Researcher.RESEARCHER.TUAKIRITOKEN, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public projectdb.tables.pojos.Researcher fetchOneById(Integer value) {
        return fetchOne(projectdb.tables.Researcher.RESEARCHER.ID, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(projectdb.tables.pojos.Researcher object) {
        return object.getId();
    }
}
