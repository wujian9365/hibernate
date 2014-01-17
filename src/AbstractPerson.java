// default package

/**
 * AbstractPerson entity provides the base persistence definition of the Person
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPerson implements java.io.Serializable {

	// Fields

	private String name;
	private Integer age;

	// Constructors

	/** default constructor */
	public AbstractPerson() {
	}

	/** minimal constructor */
	public AbstractPerson(String name) {
		this.name = name;
	}

	/** full constructor */
	public AbstractPerson(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}