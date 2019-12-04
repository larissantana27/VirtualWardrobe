package TypeOfClothing;

import Outfit.OutfitClass;

public abstract class Clothing extends OutfitClass
{
	private String gColor;
	private String gAppropriateClimate;
	private String gAppropriateOccasion;
	private int howManyTimesThePieceWasUsed;
	private String size;

	public Clothing(String gColor, String gAppropriateClimate, String gAppropriateOccasion,
						int howManyTimesThePieceWasUsed, String size)
	{
		this.gColor = gColor;
		this.gAppropriateClimate = gAppropriateClimate;
		this.gAppropriateOccasion = gAppropriateOccasion;
		this.howManyTimesThePieceWasUsed = howManyTimesThePieceWasUsed;
		this.size = size;
	}

	public Clothing(String gColor, String gAppropriateClimate,
						String gAppropriateOccasion, int howManyTimesThePieceWasUsed)
	{
		this.gColor = gColor;
		this.gAppropriateClimate = gAppropriateClimate;
		this.gAppropriateOccasion = gAppropriateOccasion;
		this.howManyTimesThePieceWasUsed = howManyTimesThePieceWasUsed;
	}

	public String getColor() {
		return gColor;
	}

	public String getAppropriateClimate() {
		return gAppropriateClimate;
	}

	public String getAppropriateOccasion() {
		return gAppropriateOccasion;
	}

	public int getHowManyTimesThePieceWasUsed() {
		return howManyTimesThePieceWasUsed;
	}

	public void setHowManyTimesThePieceWasUsed() {
		this.howManyTimesThePieceWasUsed++;
	}

	public String getSize() {
		return size;
	}
}