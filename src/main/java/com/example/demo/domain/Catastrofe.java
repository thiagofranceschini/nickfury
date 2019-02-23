package com.example.demo.domain;

import java.util.Date;

public class Catastrofe {

	private Long id;
	private String Local;
	private EnumCatastrofe catastrofe;
	private Date startDate;
	private Date endDate;

	public Catastrofe(Long id, String local, EnumCatastrofe catastrofe, Date startDate, Date endDate) {
		super();
		this.id = id;
		Local = local;
		this.catastrofe = catastrofe;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	

	public Catastrofe() {
		super();
	}

	public String getLocal() {
		return Local;
	}

	public void setLocal(String local) {
		Local = local;
	}

	public EnumCatastrofe getPerigo() {
		return this.catastrofe;
	}

	public void setPerigo(EnumCatastrofe catastrofe) {
		this.catastrofe = catastrofe;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
