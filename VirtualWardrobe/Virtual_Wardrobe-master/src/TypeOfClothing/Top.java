package TypeOfClothing;

import Outfit.WardrobeLists;
import main.InputTreatment;
import Outfit.OutfitClass;
import java.util.ArrayList;

public class Top extends Clothing
{
	
	public Top (String color, String appropriateClimate, String appropriateOccasion, int howManyTimesThePeaceWasUsed,
				String topSize)
	{
		super(color, appropriateClimate, appropriateOccasion, howManyTimesThePeaceWasUsed, topSize);
	}

	@Override
	public String toString()
	{
		return String.format
				("\nColor: %s;\nAppropriate Climate: %s;\nAppropriate Occasion: %s;\nHow many times the piece was used: %d;\nSize: %s;\n",
						super.getColor(), super.getAppropriateClimate(), super.getAppropriateOccasion(),
						super.getHowManyTimesThePieceWasUsed(), super.getSize());
	}

	public void putInOutfit(ArrayList<OutfitClass> MyTops, ArrayList<OutfitClass> outfits, WardrobeLists wardrobeLists)
	{
		String color;
		String appropriateClimate;
		String appropriateOccasion;
		String topSize;
		boolean keepGoing = true;
		boolean exists = false;

		//WardrobeLists wardrobeLists = new WardrobeLists();

		while (keepGoing)
		{
			System.out.println("Choose your Top characteristics");

			System.out.println("Color: ");
			color = InputTreatment.readString();

			System.out.println("Appropriate Climate: ");
			appropriateClimate = InputTreatment.readString();

			System.out.println("Appropriate Occasion: ");
			appropriateOccasion = InputTreatment.readString();

			System.out.println("Size: ");
			topSize = InputTreatment.readString();

			boolean available = true;

			for (Clothing OutfitTop : wardrobeLists.getInNeedOfRepair())
			{
				if (OutfitTop.getColor().equalsIgnoreCase(color)
						&& OutfitTop.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
						&& OutfitTop.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
						&& OutfitTop.getSize().equalsIgnoreCase(topSize))
				{
					System.out.println("This piece is currently unavailable because it is in the inNeedOfRepair list!");
					available = false;
					keepGoing = true;
					break;
				}
			}

			if (available)
			{
				for (OutfitClass OutfitTop : MyTops)
				{
					Top top = (Top) OutfitTop;

					if (top.getColor().equalsIgnoreCase(color)
							&& top.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
							&& top.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
							&& top.getSize().equalsIgnoreCase(topSize))
					{
						outfits.add(OutfitTop);
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

	public void replaceInOutfit(ArrayList<OutfitClass> MyTops, ArrayList<OutfitClass> outfits, int index)
	{
		String color;
		String appropriateClimate;
		String appropriateOccasion;
		String topSize;
		boolean keepGoing = true;
		boolean exists = false;


		while (keepGoing)
		{
			System.out.println("Choose your Top characteristics");

			System.out.println("Color: ");
			color = InputTreatment.readString();

			System.out.println("Appropriate Climate: ");
			appropriateClimate = InputTreatment.readString();

			System.out.println("Appropriate Occasion: ");
			appropriateOccasion = InputTreatment.readString();

			System.out.println("Size: ");
			topSize = InputTreatment.readString();

			for (OutfitClass OutfitTop: MyTops)
			{
				Top top = (Top) OutfitTop;

				if (top.getColor().equalsIgnoreCase(color)
						&& top.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
						&& top.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
						&& top.getSize().equalsIgnoreCase(topSize))
				{
					outfits.set(index, OutfitTop);
					exists = true;
					keepGoing = false;
					break;
				}
			}
			if (!exists)
			{
				System.out.println("There's is not a piece with this characteristics in your wardrobe.");
			}
		}
	}
}