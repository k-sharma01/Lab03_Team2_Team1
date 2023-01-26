
public class Miner {
	int minerx = 0;
	int minery = 0;
	Gem[] storedgem;

	Miner() {
		this.minerx = 0;
		this.minery = 0;
	}

	Miner(int minerx, int minery) {
		this.minerx = minerx;
		this.minery = minery;
	}

	public boolean checkGem() {
		if (gemArray[minerx][minery] != "Null") {
			return true;
		} else {
			return false;
		}
	}

	public void storeGem() {
			for(int j;storedgem.length>j; j++) {
				if(storedgem[j]=0) {
				storedgem[j] = gemArray[minerx][minery];
			}
		} 
		
	}
}
