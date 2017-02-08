package ie.playstore;

public class TestRunner {
	
	public static void main(String[] args) {
		
		PlayStore ps = PlayStore.getInstance();
		
		Guitar g = new Guitar();
		g.play();
		
		Chess ch = new Chess();
		ch.play();
		
		Piano po = new Piano();
		po.play();
		
		Tetris tt = new Tetris();
		tt.play();
		
	}

}
