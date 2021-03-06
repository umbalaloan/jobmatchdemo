package model;

// default package
// Generated Mar 15, 2014 7:27:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Subject generated by hbm2java
 */
@Entity
@Table(name = "subject")
public class Subject implements java.io.Serializable {

	private String subjectId;
	private String subjectName;
	private byte subjectCredit;
	private Set<Subjectassignment> subjectassignments = new HashSet<Subjectassignment>(
			0);
	private Set<Subjectandtopic> subjectandtopics = new HashSet<Subjectandtopic>(
			0);

	public Subject() {
	}

	public Subject(String subjectId, String subjectName, byte subjectCredit) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectCredit = subjectCredit;
	}

	public Subject(String subjectId, String subjectName, byte subjectCredit,
			Set<Subjectassignment> subjectassignments,
			Set<Subjectandtopic> subjectandtopics) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectCredit = subjectCredit;
		this.subjectassignments = subjectassignments;
		this.subjectandtopics = subjectandtopics;
	}

	@Id
	@Column(name = "SUBJECT_ID", unique = true, nullable = false, length = 10)
	public String getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	@Column(name = "SUBJECT_NAME", nullable = false, length = 100)
	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Column(name = "SUBJECT_CREDIT", nullable = false)
	public byte getSubjectCredit() {
		return this.subjectCredit;
	}

	public void setSubjectCredit(byte subjectCredit) {
		this.subjectCredit = subjectCredit;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
	public Set<Subjectassignment> getSubjectassignments() {
		return this.subjectassignments;
	}

	public void setSubjectassignments(Set<Subjectassignment> subjectassignments) {
		this.subjectassignments = subjectassignments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subject")
	public Set<Subjectandtopic> getSubjectandtopics() {
		return this.subjectandtopics;
	}

	public void setSubjectandtopics(Set<Subjectandtopic> subjectandtopics) {
		this.subjectandtopics = subjectandtopics;
	}

}
