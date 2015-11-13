package StableMarriage;

import java.util.HashMap;

public class DatingAgency {
	
	private HashMap<String, Man> men;
	private HashMap<String, Woman> women;
	
	public DatingAgency(HashMap<String, Man> men, HashMap<String, Woman> women) {
		this.men = men;
		this.women = women;
	}
	
	public void matching() {
		//add your code here
		String[] s={"David","Jack","James"}; // creat a String array to store key
		int i;
		// while ∃ a free man, the while loop will run(because be guaranteed that every man will have a partner finally)
		while(men.get(s[0]).partner==null || men.get(s[1]).partner==null ||men.get(s[2]).partner==null){
			for (i=0;i<3;i++) // every time from David to James
			{
				if (men.get(s[i]).partner==null) // only a free man run
				{
					while (men.get(s[i]).getProposal_index()<3){ // just loop, because can find partner certainly
						String w=men.get(s[i]).proposalGoal(); // w = m's highest ranked woman to whom he has not yet proposed
						if (!women.get(w).hasPartner()) // if w is free
						{
							men.get(s[i]).partner=w; // (m, w) become engaged
							women.get(w).partner=s[i];
							break; // find partner,jump loop
						}
						else{ // else some pair (m', w) already exists
							if (women.get(w).evaluateProposal(s[i])) // if w prefers m to m'
							{
								men.get(women.get(w).partner).partner=null; // m' becomes free
								men.get(s[i]).partner=w; // (m, w) become engaged
								women.get(w).partner=s[i];
								break; // // find partner,jump loop
							}
						}
					}
				}	
			}
		}
		
	}
	
	public void printResult() {
		// add your code here
		String[] s={"David","Jack","James"};
		for (int i=0;i<3;i++)
		{
			System.out.println(s[i] + "<->" + men.get(s[i]).partner);
		}
	}

}

