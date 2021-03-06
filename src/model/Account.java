package model;

// default package
// Generated Mar 15, 2014 7:27:54 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account")
public class Account implements java.io.Serializable {

	private String accId;
	private User user;
	private String accPwd;
	private Set<AccountRoleMap> accountRoleMapsForCreatorAccRoleId = new HashSet<AccountRoleMap>(
			0);
	private Set<RolePermissionMap> rolePermissionMaps = new HashSet<RolePermissionMap>(
			0);
	private Set<AccountRoleMap> accountRoleMapsForAccId = new HashSet<AccountRoleMap>(
			0);
	private Set<Logs> logses = new HashSet<Logs>(0);
	public Account() {
	}

	public Account(final String accId, final String accPwd) {
		this.accId = accId;
		this.accPwd = accPwd;
	}

	public Account(final String accId, final User user, final String accPwd,
			final Set<AccountRoleMap> accountRoleMapsForCreatorAccRoleId,
			final Set<RolePermissionMap> rolePermissionMaps,
			final Set<AccountRoleMap> accountRoleMapsForAccId, final Set<Logs> logses) {
		this.accId = accId;
		this.user = user;
		this.accPwd = accPwd;
		this.accountRoleMapsForCreatorAccRoleId = accountRoleMapsForCreatorAccRoleId;
		this.rolePermissionMaps = rolePermissionMaps;
		this.accountRoleMapsForAccId = accountRoleMapsForAccId;
		this.logses = logses;
	}

	@Id
	@Column(name = "ACC_ID", unique = true, nullable = false, length = 100)
	public String getAccId() {
		return this.accId;
	}

	public void setAccId(final String accId) {
		this.accId = accId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	public User getUser() {
		return this.user;
	}

	public void setUser(final User user) {
		this.user = user;
	}

	@Column(name = "ACC_PWD", nullable = false, length = 100)
	public String getAccPwd() {
		return this.accPwd;
	}

	public void setAccPwd(final String accPwd) {
		this.accPwd = accPwd;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accountByCreatorAccRoleId")
	public Set<AccountRoleMap> getAccountRoleMapsForCreatorAccRoleId() {
		return this.accountRoleMapsForCreatorAccRoleId;
	}

	public void setAccountRoleMapsForCreatorAccRoleId(
			final Set<AccountRoleMap> accountRoleMapsForCreatorAccRoleId) {
		this.accountRoleMapsForCreatorAccRoleId = accountRoleMapsForCreatorAccRoleId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<RolePermissionMap> getRolePermissionMaps() {
		return this.rolePermissionMaps;
	}

	public void setRolePermissionMaps(final Set<RolePermissionMap> rolePermissionMaps) {
		this.rolePermissionMaps = rolePermissionMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accountByAccId", cascade = {CascadeType.ALL}, orphanRemoval = true)
	public Set<AccountRoleMap> getAccountRoleMapsForAccId() {
		return this.accountRoleMapsForAccId;
	}

	public void setAccountRoleMapsForAccId(
			final Set<AccountRoleMap> accountRoleMapsForAccId) {
		this.accountRoleMapsForAccId = accountRoleMapsForAccId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Logs> getLogses() {
		return this.logses;
	}

	public void setLogses(Set<Logs> logses) {
		this.logses = logses;
	}

}
