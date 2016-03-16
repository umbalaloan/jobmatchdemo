package model;

// default package
// Generated Mar 15, 2014 7:27:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Testsection generated by hbm2java
 */
@Entity
@Table(name = "testsection")
public class Testsection implements java.io.Serializable {

	private Integer testSecId;
	private Test test;
	private String testSecDesc;
	private Set<Tquestion> tquestions = new HashSet<Tquestion>(0);
	private Set<Testsectionitem> testsectionitems = new HashSet<Testsectionitem>(
			0);

	public Testsection() {
	}

	public Testsection(Test test, String testSecDesc,
			Set<Tquestion> tquestions, Set<Testsectionitem> testsectionitems) {
		this.test = test;
		this.testSecDesc = testSecDesc;
		this.tquestions = tquestions;
		this.testsectionitems = testsectionitems;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "TEST_SEC_ID", unique = true, nullable = false)
	public Integer getTestSecId() {
		return this.testSecId;
	}

	public void setTestSecId(Integer testSecId) {
		this.testSecId = testSecId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEST_ID")
	public Test getTest() {
		return this.test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Column(name = "TEST_SEC_DESC", length = 65535)
	public String getTestSecDesc() {
		return this.testSecDesc;
	}

	public void setTestSecDesc(String testSecDesc) {
		this.testSecDesc = testSecDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testsection")
	public Set<Tquestion> getTquestions() {
		return this.tquestions;
	}

	public void setTquestions(Set<Tquestion> tquestions) {
		this.tquestions = tquestions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testsection")
	public Set<Testsectionitem> getTestsectionitems() {
		return this.testsectionitems;
	}

	public void setTestsectionitems(Set<Testsectionitem> testsectionitems) {
		this.testsectionitems = testsectionitems;
	}

}
