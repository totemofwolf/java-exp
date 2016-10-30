package com.runoob.w0ng.oo.itfc;

public interface Football extends Sports {

	public void homeTeamScored(int points);
	public void visitingTeamScored(int points);
	public void endOfQuarter(int quarter);
}
