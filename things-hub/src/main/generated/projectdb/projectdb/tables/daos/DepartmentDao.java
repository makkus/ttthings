/**
 * This class is generated by jOOQ
 */
package projectdb.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DepartmentDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.DepartmentRecord, projectdb.tables.pojos.Department, Integer> {

	/**
	 * Create a new DepartmentDao without any panAuditConfiguration
	 */
	public DepartmentDao() {
		super(projectdb.tables.Department.DEPARTMENT, projectdb.tables.pojos.Department.class);
	}

	/**
	 * Create a new DepartmentDao with an attached panAuditConfiguration
	 */
	public DepartmentDao(org.jooq.Configuration configuration) {
		super(projectdb.tables.Department.DEPARTMENT, projectdb.tables.pojos.Department.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(projectdb.tables.pojos.Department object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Department> fetchById(Integer... values) {
		return fetch(projectdb.tables.Department.DEPARTMENT.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public projectdb.tables.pojos.Department fetchOneById(Integer value) {
		return fetchOne(projectdb.tables.Department.DEPARTMENT.ID, value);
	}

	/**
	 * Fetch records that have <code>institutionId IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Department> fetchByInstitutionid(Integer... values) {
		return fetch(projectdb.tables.Department.DEPARTMENT.INSTITUTIONID, values);
	}

	/**
	 * Fetch records that have <code>divisionId IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Department> fetchByDivisionid(Integer... values) {
		return fetch(projectdb.tables.Department.DEPARTMENT.DIVISIONID, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Department> fetchByName(String... values) {
		return fetch(projectdb.tables.Department.DEPARTMENT.NAME, values);
	}

	/**
	 * Fetch records that have <code>code IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Department> fetchByCode(String... values) {
		return fetch(projectdb.tables.Department.DEPARTMENT.CODE, values);
	}
}