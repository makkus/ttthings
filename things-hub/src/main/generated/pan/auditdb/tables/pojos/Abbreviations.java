/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 * <p>
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Abbreviations implements java.io.Serializable {

    private static final long serialVersionUID = -1761349536;
    private java.lang.String decode;
    private java.lang.String id;

    public Abbreviations() {
    }

    public Abbreviations(
            java.lang.String id,
            java.lang.String decode
    ) {
        this.id = id;
        this.decode = decode;
    }

    public java.lang.String getDecode() {
        return this.decode;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public void setDecode(java.lang.String decode) {
        this.decode = decode;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }
}
