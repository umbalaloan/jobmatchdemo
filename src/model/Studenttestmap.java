package model;

// default package
// Generated Mar 15, 2014 7:27:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Studenttestmap generated by hbm2java
 */
@Entity
@Table(name = "studenttestmap")
public class Studenttestmap implements java.io.Serializable {

	private Integer studentTestId;
	private Test test;
	private Student student;
	private Date studentTestStartdate;
	private Date studentTestStarttime;
	private Date studentTestEnddate;
	private Date studentTestEndtime;
	private Boolean studentTestVisible;

	public Studenttestmap() {
	}

	public Studenttestmap(Test test, Student student,
			Date studentTestStartdate, Date studentTestStarttime,
			Date studentTestEnddate, Date studentTestEndtime,
			Boolean studentTestVisible) {
		this.test = test;
		this.student = student;
		this.studentTestStartdate = studentTestStartdate;
		this.studentTestStarttime = studentTestStarttime;
		this.studentTestEnddate = studentTestEnddate;
		this.studentTestEndtime = studentTestEndtime;
		this.studentTestVisible = studentTestVisible;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "STUDENT_TEST_ID", unique = true, nullable = false)
	public Integer getStudentTestId() {
		return this.studentTestId;
	}

	public void setStudentTestId(Integer studentTestId) {
		this.studentTestId = studentTestId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEST_ID")
	public Test getTest() {
		return this.test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_ID")
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "STUDENT_TEST_STARTDATE", length = 10)
	public Date getStudentTestStartdate() {
		return this.studentTestStartdate;
	}

	public void setStudentTestStartdate(Date studentTestStartdate) {
		this.studentTestStartdate = studentTestStartdate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "STUDENT_TEST_STARTTIME", length = 8)
	public Date getStudentTestStarttime() {
		return this.studentTestStarttime;
	}

	public void setStudentTestStarttime(Date studentTestStarttime) {
		this.studentTestStarttime = studentTestStarttime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "STUDENT_TEST_ENDDATE", length = 10)
	public Date getStudentTestEnddate() {
		return this.studentTestEnddate;
	}

	public void setStudentTestEnddate(Date studentTestEnddate) {
		this.studentTestEnddate = studentTestEnddate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "STUDENT_TEST_ENDTIME", length = 8)
	public Date getStudentTestEndtime() {
		return this.studentTestEndtime;
	}

	public void setStudentTestEndtime(Date studentTestEndtime) {
		this.studentTestEndtime = studentTestEndtime;
	}

	@Column(name = "STUDENT_TEST_VISIBLE")
	public Boolean getStudentTestVisible() {
		return this.studentTestVisible;
	}

	public void setStudentTestVisible(Boolean studentTestVisible) {
		this.studentTestVisible = studentTestVisible;
	}

}