package algorithm;

public class Network {
	private int ni;
	private int nh;
	private int no;
	
	private Double[] ai;
	private int ah;
	private int ao;
	
	private int wi;
	private int wo;
	
	private int ci;
	private int co;
	

	public Network(int ni, int nh, int no) {
		// number of input, hidden and output nodes
		this.ni = ni + 1;
		this.nh = nh;
		this.no = no;
		
		this.ai = new Double[ni];
		for(int i=0; i < ni; i++){
		    this.ai[i] = 1.0;
		}
		
	}
}