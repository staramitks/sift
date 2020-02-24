package com.sift.app.dto;

public class StockLeaderDTO {
	
	private int siftRank;
	private String name;
	private double price;
	private double peRatio;
	private double marketCap;
	private float divYield;
	private float roe;
	private String stockCategory;
	/**
	 * @return the siftRank
	 */
	public int getSiftRank() {
		return siftRank;
	}
	/**
	 * @param siftRank the siftRank to set
	 */
	public void setSiftRank(int siftRank) {
		this.siftRank = siftRank;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the peRatio
	 */
	public double getPeRatio() {
		return peRatio;
	}
	/**
	 * @param peRatio the peRatio to set
	 */
	public void setPeRatio(double peRatio) {
		this.peRatio = peRatio;
	}
	/**
	 * @return the marketCap
	 */
	public double getMarketCap() {
		return marketCap;
	}
	/**
	 * @param marketCap the marketCap to set
	 */
	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}
	/**
	 * @return the divYield
	 */
	public float getDivYield() {
		return divYield;
	}
	/**
	 * @param divYield the divYield to set
	 */
	public void setDivYield(float divYield) {
		this.divYield = divYield;
	}
	/**
	 * @return the roe
	 */
	public float getRoe() {
		return roe;
	}
	/**
	 * @param roe the roe to set
	 */
	public void setRoe(float roe) {
		this.roe = roe;
	}
	public String getStockCategory() {
		return stockCategory;
	}
	public void setStockCategory(String stockCategory) {
		this.stockCategory = stockCategory;
	}
	public StockLeaderDTO(int siftRank, String name, double price, double peRatio, double marketCap, float divYield,
			float roe, String stockCategory) {
		super();
		this.siftRank = siftRank;
		this.name = name;
		this.price = price;
		this.peRatio = peRatio;
		this.marketCap = marketCap;
		this.divYield = divYield;
		this.roe = roe;
		this.stockCategory = stockCategory;
	}
	
	

}
