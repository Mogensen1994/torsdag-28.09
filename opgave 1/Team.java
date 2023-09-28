public class Team{
	private String teamName;
	private int teamRank;
	

	public Team(String teamName,int teamRank){
		this.teamName=teamName;
		this.teamRank=teamRank;
		
	}

	public void setRank(int rank){
		this.teamRank=rank;
	}

	public String toString(){
		return " hold "	+ teamName + " rang" + teamRank;
	}
}