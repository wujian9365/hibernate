// default package

/**
 * Person entity. @author MyEclipse Persistence Tools
 */
public class Person extends AbstractPerson implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** minimal constructor */
	public Person(String name) {
		super(name);
	}

	/** full constructor */
	public Person(String name, Integer age) {
		super(name, age);
	}

}
