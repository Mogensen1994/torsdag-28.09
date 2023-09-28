public class Main {
	public static void main(String[]args){

	Team team1=new Team("teambull",1);
	team1.setRank(1);
	Team team2=new Team("teamhorse",2);
	Team team3=new Team("teamdog",3);
	Team team4=new Team("teambee",4);
	Team team5=new Team("teamseabass",5);

	System.out.println(team1.toString());
	System.out.println(team2.toString());
	System.out.println(team3.toString());
	System.out.println(team4.toString());
	System.out.println(team5.toString());
	}
}
