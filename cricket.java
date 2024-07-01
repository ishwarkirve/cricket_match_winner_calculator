import java.util.*;
public class cricket {
    
    public static int[] TeamA(int n,int teamBscore)
    {
        Scanner sc=new Scanner(System.in);
        int teamAscore=0,wicketsA=0,extraA=0;
        int ballA=0;
        String run;
        System.out.println("Team A");
        while(ballA<(n*6) && teamAscore<=teamBscore && wicketsA<10)
        {
            int over=ballA/6;
            int ball=ballA%6;
            System.out.println(over+"."+(ball+1)+" ball score = ");
            run=sc.next();
            try
            {
                teamAscore+=Integer.parseInt(run);
                ballA++;
            }
            catch(Exception e)
            {
                if(run.equals("W"))
                {
                    wicketsA++;
                    ballA++;
                }
                else
                {
                    extraA++;
                }
            }
        }
        System.out.println("Extras for Team A = "+extraA);
        System.out.println("Wickets loosed by Team A = "+wicketsA);
        int TeamAarray[]={teamAscore+extraA,wicketsA};
        return TeamAarray;
    }

    public static int[] TeamB(int n,int teamAscore)
    {
        Scanner sc=new Scanner(System.in);
        int teamBscore=0,wicketsB=0,extraB=0;
        System.out.println("Team B");
        int ballB=0;
        String run;
        while(ballB<(n*6) && teamBscore<=teamAscore  && wicketsB<10)
        {
            int over=ballB/6;
            int ball=ballB%6;
            System.out.println(over+"."+(ball+1)+" ball score = ");
            run=sc.next();
            try
            {
                teamBscore+=Integer.parseInt(run);
                ballB++;
            }
            catch(Exception e)
            {
                if(run.equals("W"))
                {
                    wicketsB++;
                    ballB++;
                }
                else
                {
                    extraB++;
                }
            }
               
        }
        System.out.println("Extras for Team B = "+extraB);
        System.out.println("Wickets loosed by Team B = "+wicketsB);
        int TeamBarray[]={teamBscore+extraB,wicketsB};
        return TeamBarray;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of overs in the match = ");
        n=sc.nextInt();
        System.out.println("Which team has won the toss.");
        System.out.println("1.Team A\n2.Team B");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("What is choosen by Team A.");
            System.out.println("1.Batting\n2.Bolling");
            int option=sc.nextInt();
            if(option==1)
            {
                int teamAs[]=TeamA(n,Integer.MAX_VALUE);
                System.out.println("Team A Score = "+teamAs[0]);
                System.out.println("Target for Team B = "+(teamAs[0]+1));
                int teamBs[]=TeamB(n,teamAs[0]);
                System.out.println("Team B Score = "+teamBs[0]);
                if(teamAs==teamBs)
                {
                    System.out.println("Match Tied");
                }
                else if(teamAs[0]>teamBs[0])
                {
                    System.out.println("Team A is Won by "+(teamAs[0]-teamBs[0])+" Runs.");
                }
                else
                {
                    System.out.println("Team B is Won by "+(10-teamBs[1])+" Wickets.");
                }
            }
            else
            {
                int teamBs[]=TeamB(n,Integer.MAX_VALUE);
                System.out.println("Team B Score = "+teamBs[0]);
                System.out.println("Target for Team A = "+(teamBs[0]+1));
                int teamAs[]=TeamA(n,teamBs[0]);
                System.out.println("Team A Score = "+teamAs);
                if(teamAs[0]==teamBs[0])
                {
                    System.out.println("Match Tied");
                }
                else if(teamAs[0]>teamBs[0])
                {
                    System.out.println("Team A is Won by "+(10-teamAs[1])+" Wickets.");
                }
                else
                {
                    System.out.println("Team B is Won by "+(teamBs[0]-teamAs[0])+" Runs.");
                }
            }
        }
        else
        {
            System.out.println("What is choosen by Team B.");
            System.out.println("1.Batting\n2.Bolling");
            int option=sc.nextInt();
            if(option==2)
            {
                int teamAs[]=TeamA(n,Integer.MAX_VALUE);
                System.out.println("Team A Score = "+teamAs[0]);
                System.out.println("Target for Team B = "+(teamAs[0]+1));
                int teamBs[]=TeamB(n,teamAs[0]);
                System.out.println("Team B Score = "+teamBs);
                if(teamAs[0]==teamBs[0])
                {
                    System.out.println("Match Tied");
                }
                else if(teamAs[0]>teamBs[0])
                {
                    System.out.println("Team A is Won by "+(teamAs[0]-teamBs[0])+" Runs.");
                }
                else
                {
                    System.out.println("Team B is Won by "+(10-teamBs[1])+" Wickets.");
                }
            }
            else
            {
                int teamBs[]=TeamB(n,Integer.MAX_VALUE);
                System.out.println("Team B Score = "+teamBs[0]);
                System.out.println("Target for Team A = "+(teamBs[0]+1));
                int teamAs[]=TeamA(n,teamBs[0]);
                System.out.println("Team A Score = "+teamAs[0]);
                if(teamAs[0]==teamBs[0])
                {
                    System.out.println("Match Tied");
                }
                else if(teamAs[0]>teamBs[0])
                {
                    System.out.println("Team A is Won by "+(10-teamAs[1])+" Wickets.");
                }
                else
                {
                    System.out.println("Team B is Won by "+(teamBs[0]-teamAs[0])+" Runs.");
                }
            }
        }
    }
}
