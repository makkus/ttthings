/**
 * This class is generated by jOOQ
 */
package projectdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Institution implements java.io.Serializable {

    private static final long serialVersionUID = -1021425630;
    private java.lang.String code;
    private java.lang.Integer id;
    private java.lang.String name;

    public Institution() {
    }

    public Institution(
            java.lang.Integer id,
            java.lang.String name,
            java.lang.String code
    ) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}
