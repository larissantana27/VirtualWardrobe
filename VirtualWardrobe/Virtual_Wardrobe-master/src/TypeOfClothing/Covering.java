package TypeOfClothing;

import Outfit.WardrobeLists;
import main.InputTreatment;
import Outfit.OutfitClass;
import java.util.ArrayList;

public class Covering extends Clothing
{
	private String coveringType;
	
	public Covering (String color, String appropriateClimate, String appropriateOccasion,
					 											int howManyTimesThePeaceWasUsed, String coveringType)
	{
		super(color, appropriateClimate, appropriateOccasion, howManyTimesThePeaceWasUsed);
		this.coveringType = coveringType;
	}
	
	public String getCoveringType() 
	{
		return this.coveringType;
	}

	@Override
	public String toString()
	{
		return String.format
				("\nColor: %s;\nAppropriate Climate: %s;\nAppropriate Occasion: %s;\nHow many times the piece was used: %d;\nSize: %s;\n",
						super.getColor(), super.getAppropriateClimate(), super.getAppropriateOccasion(),
						super.getHowManyTimesThePieceWasUsed(), this.coveringType);
	}

	public void putInOutfit(ArrayList<OutfitClass> MyCoverings, ArrayList<OutfitClass> outfits, WardrobeLists wardrobeLists)
	{
		String color;
		String appropriateClimate;
		String appropriateOccasion;
		String coveringType;
		boolean keepGoing = true;
		boolean exists = false;

		while (keepGoing)
		{
			System.out.println("Choose your Covering characteristics");

			System.out.println("Color: ");
			color = InputTreatment.readString();

			System.out.println("Appropriate Climate: ");
			appropriateClimate = InputTreatment.readString();

			System.out.println("Appropriate Occasion: ");
			appropriateOccasion = InputTreatment.readString();

			System.out.println("Type: ");
			coveringType = InputTreatment.readString();

			boolean available = true;

			for (Clothing OutfitCovering : wardrobeLists.getInNeedOfRepair())
			{
				Covering covering = (Covering)OutfitCovering;

				if (covering.getColor().equalsIgnoreCase(color)
						&& covering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
						&& covering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
						&& covering.getCoveringType().equalsIgnoreCase(coveringType))
				{
					System.out.println("This piece is currently unavailable because it is in the inNeedOfRepair list!");
					available = false;
					keepGoing = true;
					break;
				}
			}

			if (available)
			{
				for (OutfitClass OutfitCovering: MyCoverings)
				{
					Covering covering = (Covering)OutfitCovering;

					if (covering.getColor().equalsIgnoreCase(color)
							&& covering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
							&& covering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
							&& covering.getCoveringType().equalsIgnoreCase(coveringType))
					{
						outfits.add(OutfitCovering);
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

	public void replaceInOutfit(ArrayList<OutfitClass> MyCoverings, ArrayList<OutfitClass> outfits, int index)
	{
		String color;
		String appropriateClimate;
		String appropriateOccasion;
		String coveringType;
		boolean keepGoing = true;
		boolean exists = false;


		while (keepGoing)
		{
			System.out.println("Choose your Covering characteristics");

			System.out.println("Color: ");
			color = InputTreatment.readString();

			System.out.println("Appropriate Climate: ");
			appropriateClimate = InputTreatment.readString();

			System.out.println("Appropriate Occasion: ");
			appropriateOccasion = InputTreatment.readString();

			System.out.println("Size: ");
			coveringType = InputTreatment.readString();

			for (OutfitClass OutfitCovering: MyCoverings)
			{
				Covering covering = (Covering) OutfitCovering;

				if (covering.getColor().equalsIgnoreCase(color)
						&& covering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
						&& covering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
						&& covering.getCoveringType().equalsIgnoreCase(coveringType))
				{
					outfits.set(index, OutfitCovering);
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
