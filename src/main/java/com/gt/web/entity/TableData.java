package com.gt.web.entity;

import java.util.List;

public class TableData<E> {
	private List<E> rows;

	public List<E> getRows() {
		return rows;
	}

	public void setRows(List<E> rows) {
		this.rows = rows;
	}
	
}
