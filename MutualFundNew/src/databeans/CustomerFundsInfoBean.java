package databeans;


public class CustomerFundsInfoBean {
	private int fund_id;
	private String fund_name;
	private String fund_symbol;
	private long shares;
	public int getFund_id() {
		return fund_id;
	}
	public void setFund_id(int fund_id) {
		this.fund_id = fund_id;
	}
	public String getFund_name() {
		return fund_name;
	}
	public void setFund_name(String fund_name) {
		this.fund_name = fund_name;
	}
	public String getFund_symbol() {
		return fund_symbol;
	}
	public void setFund_symbol(String fund_symbol) {
		this.fund_symbol = fund_symbol;
	}
	public long getShares() {
		return shares;
	}
	public void setShares(long shares) {
		this.shares = shares;
	}

}
