package Viikko7;

import java.util.ArrayList;

public class Playlist {
	
	// 1.ATRIBUUTIT ELI OMINAISUUDET = OLIOMUUTTUJAT
	
	private ArrayList <Song> songs;
	
	// 2. KONSTRUKTORIT
	
	public Playlist() {
		// luodaan uusi song-lista
		songs = new ArrayList<Song>();
	}
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	public Song getSong(int index) {
		if (index < songs.size()) {
		Song song = songs.get(index);
		return song;
		} else {
			return null;
		}
		
	}	
	 public int getTotalLength() {
		int duration = 0;
		 for (int i = 0; i < songs.size(); i++) {
			 duration = duration + songs.get(i).getLength();
		}
		 return duration;
	 }

	@Override
	public String toString() {
		String paluu = "";
		int index = 1;
		for (int i = 0; i < songs.size(); i++) {
			Song thisSong = songs.get(i);
			paluu = paluu + "\n" + index + ": " + thisSong.getTitle() + " by " + 
			thisSong.getArtist().getName();
			index = index + 1;
		}
		return paluu;
	
	 
	}
}
