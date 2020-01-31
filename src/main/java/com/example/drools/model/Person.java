package com.example.drools.model;

import java.math.BigDecimal;

public class Person {

	private Long id;
	private String name;
	private BigDecimal monthlyIncome;
	private BigDecimal monthlyExpenses;
	private Boolean isReportedByRiskCentral;
	private String status;
	
	/**
	 * Constructor.
	 * @param id
	 * @param name
	 * @param monthlyIncome
	 * @param monthlyExpenses
	 * @param isReportedByRiskCentral
	 */
	public Person(Long id, String name, BigDecimal monthlyIncome, BigDecimal monthlyExpenses,
			Boolean isReportedByRiskCentral) {
		super();
		this.id = id;
		this.name = name;
		this.monthlyIncome = monthlyIncome;
		this.monthlyExpenses = monthlyExpenses;
		this.isReportedByRiskCentral = isReportedByRiskCentral;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(BigDecimal monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public BigDecimal getMonthlyExpenses() {
		return monthlyExpenses;
	}
	public void setMonthlyExpenses(BigDecimal monthlyExpenses) {
		this.monthlyExpenses = monthlyExpenses;
	}
	public Boolean getIsReportedByRiskCentral() {
		return isReportedByRiskCentral;
	}
	public void setIsReportedByRiskCentral(Boolean isReportedByRiskCentral) {
		this.isReportedByRiskCentral = isReportedByRiskCentral;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", monthlyIncome=" + monthlyIncome + ", monthlyExpenses="
				+ monthlyExpenses + ", isReportedByRiskCentral=" + isReportedByRiskCentral + ", status=" + status + "]";
	}

	
	
	
}
