package TypeOfClothing;

import Outfit.WardrobeLists;
import main.InputTreatment;
import Outfit.OutfitClass;
import java.util.ArrayList;

public class OnePieceSet extends Clothing
{
	private String onePieceSetType, onePieceSetLenght;

	public OnePieceSet (String color, String appropriateClimate, String appropriateOccasion,
							int howManyTimesThePeaceWasUsed, String onePieceSetType, String lenght)
	{
		super(color, appropriateClimate, appropriateOccasion, howManyTimesThePeaceWasUsed);
		this.onePieceSetType = onePieceSetType;
		this.onePieceSetLenght = lenght;
	}
	
	public String getOnePieceSetType() 
	{
		return this.onePieceSetType;
	}
	
	public String getOnePieceSetLenght() 
	{
		return this.onePieceSetLenght;
	}

	@Override
	public String toString()
	{
		return String.format
				("\nColor: %s;\nAppropriate Climate: %s;\nAppropriate Occasion: %s;\nHow many times the piece was used: %d;\nSize: %s;\nLenght: %s\n",
						super.getColor(), super.getAppropriateClimate(), super.getAppropriateOccasion(),
						super.getHowManyTimesThePieceWasUsed(), this.onePieceSetType, this.onePieceSetLenght);
	}

	public void putInOutfit(ArrayList<OutfitClass> MyOnePieceSets, ArrayList<OutfitClass> outfits, WardrobeLists wardrobeLists)
	{
		String color;
		String appropriateClimate;
		String appropriateOccasion;
		String onePieceSetType;
		boolean keepGoing = true;
		boolean exists = false;

		while (keepGoing)
		{
			System.out.println("Choose your One piece Set characteristics");

			System.out.println("Color: ");
			color = InputTreatment.readString();

			System.out.println("Appropriate Climate: ");
			appropriateClimate = InputTreatment.readString();

			System.out.println("Appropriate Occasion: ");
			appropriateOccasion = InputTreatment.readString();

			System.out.println("One piece set type: ");
			onePieceSetType = InputTreatment.readString();

			System.out.println("Size: ");
			onePieceSetLenght = InputTreatment.readString();

			boolean available = true;

			for (Clothing OutfitOnePieceSet : wardrobeLists.getInNeedOfRepair())
			{
				OnePieceSet onePieceSet = (OnePieceSet) OutfitOnePieceSet;

				if (onePieceSet.getColor().equalsIgnoreCase(color)
						&& onePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
						&& onePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
						&& onePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
						&& onePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
				{
					System.out.println("This piece is currently unavailable because it is in the inNeedOfRepair list!");
					available = false;
					keepGoing = true;
					break;
				}
			}

			if (available)
			{
				for (OutfitClass OutfitOnePieceSet: MyOnePieceSets)
				{
					OnePieceSet onePieceSet = (OnePieceSet) OutfitOnePieceSet;

					if (onePieceSet.getColor().equalsIgnoreCase(color)
							&& onePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
							&& onePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
							&& onePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
							&& onePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
					{
						outfits.add(OutfitOnePieceSet);
						exists = true;
						keepGoing = false;
						break;
					}
				}
				if (!exists)
				{
					System.out.println("There is not a piece with this characteristics in your wardrobe.");
				}
			}
		}
	}

	public void replaceInOutfit(ArrayList<OutfitClass> MyOnePieceSets, ArrayList<OutfitClass> outfits, int index)
	{
		String color;
		String appropriateClimate;
		String appropriateOccasion;
		String onePieceSetType;
		String onePieceSetLenght;

		boolean keepGoing = true;
		boolean exists = false;

		while (keepGoing)
		{
			System.out.println("Choose your One piece Set characteristics");

			System.out.println("Color: ");
			color = InputTreatment.readString();

			System.out.println("Appropriate Climate: ");
			appropriateClimate = InputTreatment.readString();

			System.out.println("Appropriate Occasion: ");
			appropriateOccasion = InputTreatment.readString();

			System.out.println("One piece set type: ");
			onePieceSetType = InputTreatment.readString();

			System.out.println("Size: ");
			onePieceSetLenght = InputTreatment.readString();

			for (OutfitClass OutfitOnePieceSet: MyOnePieceSets)
			{
				OnePieceSet onePieceSet = (OnePieceSet) OutfitOnePieceSet;

				if (onePieceSet.getColor().equalsIgnoreCase(color)
						&& onePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
						&& onePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
						&& onePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
						&& onePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
				{
					outfits.set(index, OutfitOnePieceSet);
					exists = true;
					keepGoing = false;
					break;
				}
			}
			if (!exists)
			{
				System.out.println("There is not a piece with this characteristics in your wardrobe.");
			}
		}
	}
}
