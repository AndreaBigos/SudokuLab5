package pkgEnum;

public enum eGameDifficulty {
	
	EASY, MEDIUM, HARD;
	
	private int iDifficulty;

	private static java.util.Map<java.lang.Integer,eGameDifficulty>	lookup;
	
	public static eGameDifficulty get(int iDifficulty)
	{
		return lookup.get(iDifficulty);
	}
	
	public int getiDifficulty()
	{
		return iDifficulty;
	}
	
	public static eGameDifficulty valueOf(java.lang.String name)
	{
		for(eGameDifficulty d : eGameDifficulty.values())
			lookup.put(d.getiDifficulty(), d);
	}
	
	public static eGameDifficulty values()
	{
		
	}
	
}
