package ie.playstore;

import java.util.*;

public class PlayStore {
	
	private static PlayStore ps = new PlayStore();
	private Map<String,Playable> map = new HashMap<String, Playable>();
	
	private PlayStore(){	
	}
	
	public static PlayStore getInstance(){
		if(ps == null){
			ps = new PlayStore();
		}
		System.out.println("Playstore " + ps);
		return ps;
	}
	
	public void add(Playable p){  // Constant time O(1)
		this.add(p);
	}
	
	public void remove(Playable p){  // Constant time O(1)
		this.remove(p);
	}
	
	public int size(){  // Constant time O(1)
		return this.size();
	}
	
	public void play(String name){ // Constant time O(1)
		this.play(name);
	}
	
	public Playable find(String name){  // Constant time O(1)
		return this.find(name);
	}

	@Override
	public String toString() {
		return "PlayStore";
	}
	
	
}
