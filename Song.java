package Viikko7;

public class Song {

		
		private String title;
		private Artist artist;
		
		private int year;
		private int length;
		
		public Song() {

		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Artist getArtist() {
			return artist;
		}

		public void setArtist(Artist artist) {
			this.artist = artist;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		@Override
		public String toString() {
			String paluu = "";
			if (this.artist == null) {
				paluu = title;
			} else {
			paluu = title + " by " + artist; 
				
			}
			return paluu;
		}



}
