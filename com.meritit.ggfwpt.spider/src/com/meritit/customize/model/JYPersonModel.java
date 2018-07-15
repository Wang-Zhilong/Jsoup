package com.meritit.customize.model;
/**
 * 就业人口
 * @author merit
 *
 */
public class JYPersonModel {
	
	private String taskid;
	private String ruleid;
	private String id;
	private String inserttime;
	private String url;
	
	private String insertdate;
	private String statdate;
	private String datefreq;
	private String country;
	private String province;
	private String city;
	
	private String district;
	private String areacode;
	private String value;
	private String dim_1ind;
	private String dim_2ind;
	private String dim_3ind;
	private String unit;
	public JYPersonModel(String taskid, String ruleid, String id,
			String inserttime, String url, String insertdate, String statdate,
			String datefreq, String country, String province, String city,
			String district, String areacode, String value, String dim_1ind,
			String dim_2ind, String dim_3ind, String unit) {
		super();
		this.taskid = taskid;
		this.ruleid = ruleid;
		this.id = id;
		this.inserttime = inserttime;
		this.url = url;
		this.insertdate = insertdate;
		this.statdate = statdate;
		this.datefreq = datefreq;
		this.country = country;
		this.province = province;
		this.city = city;
		this.district = district;
		this.areacode = areacode;
		this.value = value;
		this.dim_1ind = dim_1ind;
		this.dim_2ind = dim_2ind;
		this.dim_3ind = dim_3ind;
		this.unit = unit;
	}
	
	public JYPersonModel(){
		super();
	}
	
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public String getRuleid() {
		return ruleid;
	}
	public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInserttime() {
		return inserttime;
	}
	public void setInserttime(String inserttime) {
		this.inserttime = inserttime;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	public String getStatdate() {
		return statdate;
	}
	public void setStatdate(String statdate) {
		this.statdate = statdate;
	}
	public String getDatefreq() {
		return datefreq;
	}
	public void setDatefreq(String datefreq) {
		this.datefreq = datefreq;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getAreacode() {
		return areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDim_1ind() {
		return dim_1ind;
	}
	public void setDim_1ind(String dim_1ind) {
		this.dim_1ind = dim_1ind;
	}
	public String getDim_2ind() {
		return dim_2ind;
	}
	public void setDim_2ind(String dim_2ind) {
		this.dim_2ind = dim_2ind;
	}
	public String getDim_3ind() {
		return dim_3ind;
	}
	public void setDim_3ind(String dim_3ind) {
		this.dim_3ind = dim_3ind;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
}