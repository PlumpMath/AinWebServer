package gov.polisen.orm.models;

public class PermissionsOnCasesKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column permissionsondeployments.deploymentid
	 * @mbggenerated  Sat Apr 05 11:34:16 CEST 2014
	 */
	private Integer	deploymentid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column permissionsondeployments.userid
	 * @mbggenerated  Sat Apr 05 11:34:16 CEST 2014
	 */
	private Integer	userid;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table permissionsondeployments
	 * @mbggenerated  Sat Apr 05 11:34:16 CEST 2014
	 */
	public PermissionsOnCasesKey(Integer deploymentid, Integer userid) {
		this.deploymentid = deploymentid;
		this.userid = userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column permissionsondeployments.deploymentid
	 * @return  the value of permissionsondeployments.deploymentid
	 * @mbggenerated  Sat Apr 05 11:34:16 CEST 2014
	 */
	public Integer getDeploymentid() {
		return deploymentid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column permissionsondeployments.userid
	 * @return  the value of permissionsondeployments.userid
	 * @mbggenerated  Sat Apr 05 11:34:16 CEST 2014
	 */
	public Integer getUserid() {
		return userid;
	}
}