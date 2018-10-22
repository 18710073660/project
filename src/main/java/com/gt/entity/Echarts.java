package com.gt.entity;

import java.util.List;

public class Echarts {
	
	private List<String> legend;
	private List<String> axis;
	private List<Series> series;
	
	public Echarts() {
		super();
	}

	public Echarts(List<String> legend, List<String> axis, List<Series> series) {
		super();
		this.legend = legend;
		this.axis = axis;
		this.series = series;
	}
	

	public List<String> getLegend() {
		return legend;
	}
	public void setLegend(List<String> legend) {
		this.legend = legend;
	}
	public List<String> getAxis() {
		return axis;
	}
	public void setAxis(List<String> axis) {
		this.axis = axis;
	}

	public List<Series> getSeries() {
		return series;
	}

	public void setSeries(List<Series> series) {
		this.series = series;
	}

}
