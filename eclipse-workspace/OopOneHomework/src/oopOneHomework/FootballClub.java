package oopOneHomework;

public class FootballClub {

		private String name; 
		private int trophy; 
		private String captain;
		private String stadium;
		
		public FootballClub() {
			
		}
		
		public FootballClub(String captain, int trophy) {
			this.captain = captain; 
			this.trophy = trophy;
		}
		
		public FootballClub(String name, int trophy, String location) {
			this.name = name; 
			this.trophy = trophy; 
			this.stadium = stadium;
		}

		public String getName() {
			return name;
		}
		
		public int getTrophy() {
			return trophy;
		}
		
		public String getStadium() {
			return stadium;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public void setTrophy(int trophy) {
			this.trophy = trophy;
		}

		public void setStadium(String stadium) {
			this.stadium = stadium;
		}
		
		public boolean theMostPopular() {
			return true; 
		}
		
		public String onlyUsa() {
			return "How can you call it Soccer?";
		}
		
		public static void main(String[] args) {
			FootballClub footballClub = new FootballClub("Real Madrid", 119, "Santiago Bernabeu");
			System.out.println(footballClub.trophy);
			
		}
		

		
		
		
		
		


	
}
