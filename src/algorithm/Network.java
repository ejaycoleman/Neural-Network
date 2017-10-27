package algorithm;

public class Network {
	private int ni;
	private int nh;
	private int no;
	
	private Double[] ai;
	private Double[] ah;
	private Double[] ao;
	
	private int wi;
	private int wo;
	
	private int ci;
	private int co;
	
	/*private void makeMatrix(int I, int J, int fill) {
	    Double [] m;
	    
	    for (int i=0; i < I; i++) {
	    	    m.add([fill]*J);
	    	}
	    	
	    	return m
	    	    		
	}*/

	public Network(int ni, int nh, int no) {
		// number of input, hidden and output nodes
		this.ni = ni + 1;
		this.nh = nh;
		this.no = no;
		
		this.ai = new Double[ni];
		this.ah = new Double[nh];
		this.ao = new Double[no];
		
		for (int i=0; i < ni; i++) {
		    this.ai[i] = 1.0;
		}
		
		for (int i=0; i < nh; i++) {
		    this.ah[i] = 1.0;
		}
		
		for (int i=0; i < no; i++) {
		    this.ao[i] = 1.0;
		}
		
		/*
		 * 
        this.wi = makeMatrix(this.ni, this.nh)
        this.wo = makeMatrix(this.nh, this.no)

        for (int i=0; i < this.ni; i++) {
            for (int j=0; j < this.nh; j++) {
                this.wi[i][j] = rand(-0.2, 0.2)
            }
        }
        
        for (int j=0; j < this.nh; j++) {
        		for (int k=0; k < this.no; k++) {
                this.wo[j][k] = rand(-2.0, 2.0)
            	}
        }

        this.ci = makeMatrix(this.ni, this.nh)
        this.co = makeMatrix(this.nh, this.no)
        
		*/
		
	}
}