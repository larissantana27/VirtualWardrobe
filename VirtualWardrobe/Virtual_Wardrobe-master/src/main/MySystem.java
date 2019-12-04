package main;

import java.util.*;
import java.lang.*;
import java.util.Random;

import Outfit.OutfitClass;
import Outfit.WardrobeLists;
import TypeOfClothing.Clothing;
import TypeOfClothing.Bottom;
import TypeOfClothing.Top;
import TypeOfClothing.OnePieceSet;
import TypeOfClothing.Covering;

import Shoes.Shoes;

public class MySystem
{
	int option;

	ArrayList<OutfitClass> MyTops = new ArrayList();
	ArrayList<OutfitClass> MyBottons = new ArrayList();
	ArrayList<OutfitClass> MyOnePieceSets = new ArrayList();
	ArrayList<OutfitClass> MyCoverings = new ArrayList();
	ArrayList<OutfitClass> MyShoes = new ArrayList();


	ArrayList<OutfitClass> Outfit = new ArrayList();
	ArrayList<ArrayList<OutfitClass>> allMyOutfits = new ArrayList();

	WardrobeLists wardrobeLists = new WardrobeLists();

	int totalNumberOfPieces = 0;
	int totalNumberOfShoes = 0;

	String color;
	String appropriateClimate;
	String appropriateOccasion;
	String bottomSize;
	String topSize;
	String onePieceSetType;
	String onePieceSetLenght;
	String coveringType;

	String shoesType;
	String shoesColor;

	boolean keepGoing = true;
	boolean exists = false;

	public void run()
	{
		System.out.println("Welcome to your Virtual Wardrobe!");

		while(keepGoing)
		{
			System.out.println("Please choose a function you would like to execute.");

			System.out.println("(1) To add in your wardrobe;");

			System.out.println("(2) To see how many pieces of an specific type you have in your wardrobe;");

			System.out.println("(3) To administrate a list;");

			System.out.println("(4) To generate an outfit;");

			System.out.println("(5) To see all the outfits you already used;");

			System.out.println("(6) To remove from the wardrobe a piece or a pair you are selling or donating");

			option = InputTreatment.sixOptions();

			int option_2;

			switch (option)
			{
				case 1:

					System.out.println("(1) A piece of clothing;");
					System.out.println("(2) A pair of shoes;");

					option_2 = InputTreatment.twoOptions_1_2();

					if (option_2 == 1) addInWardrobe(wardrobeLists);
					else if (option_2 == 2) addInShoeCollection();

					break;

				case 2:

					System.out.println("(1) Pieces of clothing;");
					System.out.println("(2) Pair of shoes;");

					option_2 = InputTreatment.twoOptions_1_2();

					if (option_2 == 1)
					{
						System.out.println("(1) Would you like to see how many pieces in general?");
						System.out.println("(2) Would you like to see how many pieces of an specific type?");

						option_2 = InputTreatment.twoOptions_1_2();

						if (option_2 == 1) totalOfClothing();
						else if (option_2 == 2)
						{
							System.out.println("Witch type?");
							System.out.println("(1) Bottons");
							System.out.println("(2) Tops");
							System.out.println("(3) One piece sets");
							System.out.println("(4) Covering");

							option_2 = InputTreatment.fourOptions();

							switch (option_2)
							{
								case 1:

									totalOfBottons();
									break;

								case 2:

									totalOfTops();
									break;

								case 3:

									totalOfOnePieceSets();
									break;

								case 4:

									totalOfCoverings();
									break;
							}
						}

						option_2 = 1;
					}

					else if (option_2 == 2) totalOfShoes();

					break;

				case 3:

					System.out.println("(1) Favorites list;");
					System.out.println("(2) List of Pieces you would like to wear more;");
					System.out.println("(3) List of Pieces you would like to purchase;");
					System.out.println("(4) List of Pieces that need repair;");

					option_2 = InputTreatment.fourOptions();

					switch (option_2)
					{
						case 1:

							System.out.println("(1) Add a piece of your wardrobe in the list;");
							System.out.println("(2) See all the piece that are in the list;");
							System.out.println("(3) Remove a piece from the list;");

							option_2 = InputTreatment.threeOptions();

							if (option_2 == 1)
							{
								if (totalNumberOfPieces == 0)
								{
									System.out.println("You have no pieces in your wardrobe!");
									System.out.println("Please add, so you can use this function.");
									run();
								}
								else
								{
									wardrobeLists.addInFavoritesList( MyTops,  MyBottons, MyOnePieceSets,  MyCoverings);
								}

							}
							else if (option_2 == 2) wardrobeLists.SeeFavoritesList();
							else wardrobeLists.removeFromFavoritesList();

							break;

						case 2:

							System.out.println("(1) Add a piece of your wardrobe in the list;");
							System.out.println("(2) See all the piece that are in the list;");
							System.out.println("(3) Remove a piece from the list;");

							option_2 = InputTreatment.threeOptions();

							if (option_2 == 1)
							{
								if (totalNumberOfPieces == 0)
								{
									System.out.println("You have no pieces in your wardrobe!");
									System.out.println("Please add, so you can use this function.");
									run();
								} else
								{
									wardrobeLists.addInPiecesToWearMore(MyTops, MyBottons, MyOnePieceSets, MyCoverings);
								}
							}
							else if (option_2 == 2) wardrobeLists.SeePiecesToWearMore();
							else wardrobeLists.removeFromPiecesToWearMore();

							break;

						case 3:

							System.out.println("(1) Add a piece of your wardrobe in the list;");
							System.out.println("(2) See all the piece that are in the list;");
							System.out.println("(3) Remove a piece from the list;");

							option_2 = InputTreatment.threeOptions();

							if (option_2 == 1)
							{
								 wardrobeLists.addInWishToPurchase();
							}
							else if (option_2 == 2) wardrobeLists.seeWishToPurchase();
							else wardrobeLists.removeFromWishToPurchase();

							break;

						case 4:

							System.out.println("(1) Add a piece of your wardrobe in the list;");
							System.out.println("(2) See all the piece that are in the list;");
							System.out.println("(3) Remove a piece from the list;");

							option_2 = InputTreatment.threeOptions();

							if (option_2 == 1)
							{
								if (totalNumberOfPieces == 0)
								{
									System.out.println("You have no pieces in your wardrobe!");
									System.out.println("Please add, so you can use this function.");
									run();
								}
								else
								{
									wardrobeLists.addInInNeedOfRepair( MyTops, MyBottons, MyOnePieceSets, MyCoverings);
								}
							}
							else if (option_2 == 2)
							{
								//System.out.println(wardrobeLists.getInNeedOfRepair());
								wardrobeLists.seeInNeedOfRepair();
							}

							else wardrobeLists.removeFromInNeedOfRepair();

							break;
					}

					break;

				case 4:

					if (MyShoes.isEmpty())
					{
						System.out.println("You have no shoes in you wardrobe");
						System.out.println("A pair of shoes is an essential part of an outfit");
						System.out.println("Please purchase a pair to use this function");
						run();
					}
					else
					{
						System.out.println("(1) To choose the Pieces to generate an outfit;");
						System.out.println("(2) To randomly generate an outfit;");
						option_2 = InputTreatment.twoOptions_1_2();

						if (option_2 == 1) generateOutfitByChoice();
						else if (option_2 == 2) randomlyGenerateOutfit();
					}

					break;

				case 5:

					seeAllMyOutfits();
					break;

				case 6:

					removeFromWardrobe();
			}

			keepGoing = true;

			System.out.println("Would you like to continue using the Virtual Wardrobe?");

			System.out.println("(1) Yes");
			System.out.println("(0) No");

			option = InputTreatment.twoOptions_0_1();

			if (option == 0) keepGoing = false;
		}
	}

	public void addInWardrobe(WardrobeLists wardrobe)
	{
		while (keepGoing)
		{
			System.out.println("Witch of theses four types of clothing are ");

			System.out.println("(1) Bottom!");
			System.out.println("(2) Top!");
			System.out.println("(3) One peace set!");
			System.out.println("(4) Covering!");

			option = InputTreatment.fourOptions();

			System.out.println("Please complete the characteristics of the peace you're adding!");

			switch(option)
			{
				case 1:

					System.out.println("Color: ");

					color = InputTreatment.readString();

					System.out.println("Appropriate Climate: ");
					appropriateClimate = InputTreatment.readString();

					System.out.println("Appropriate Occasion: ");
					appropriateOccasion = InputTreatment.readString();

					System.out.println("Size: ");
					bottomSize = InputTreatment.readString();

					exists = false;

					for (Clothing OutfitBottom: wardrobeLists.getWishToPurchase())
					{
						if (OutfitBottom.getColor().equalsIgnoreCase(color)
								&& OutfitBottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
								&& OutfitBottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
								&& OutfitBottom.getSize().equalsIgnoreCase(bottomSize))
						{
							MyBottons.add(OutfitBottom);
							wardrobe.getWishToPurchase().remove(OutfitBottom);
							System.out.println("This item was in your wish to purchase list.");
							System.out.println("It was automatically removed!");
							exists = true;
							break;
						}
					}

					if (!exists)
					{
						Bottom newBottom = new Bottom(color, appropriateClimate, appropriateOccasion, 0, bottomSize);
						MyBottons.add(newBottom);
						System.out.println("This are your bottons in the moment:\n" + MyBottons);
					}

					break;

				case 2:

					System.out.println("Color: ");
					color = InputTreatment.readString();

					System.out.println("Appropriate Climate: ");
					appropriateClimate = InputTreatment.readString();

					System.out.println("Appropriate Occasion: ");
					appropriateOccasion = InputTreatment.readString();

					System.out.println("Size: ");
					topSize = InputTreatment.readString();

					exists = false;

					for (Clothing OutfitTop: wardrobeLists.getWishToPurchase())
					{
						if (OutfitTop.getColor().equalsIgnoreCase(color)
								&& OutfitTop.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
								&& OutfitTop.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
								&& OutfitTop.getSize().equalsIgnoreCase(topSize))
						{
							MyBottons.add(OutfitTop);
							wardrobe.getWishToPurchase().remove(OutfitTop);
							System.out.println("This item was in your wish to purchase list.");
							System.out.println("It was automatically removed!");
							exists = true;
							break;
						}
					}

					if (!exists)
					{
						Top newTop = new Top(color, appropriateClimate, appropriateOccasion, 0, topSize);
						MyTops.add(newTop);
						System.out.println("This are your Tops in the moment:\n" + MyTops);
					}

					break;

				case 3:

					System.out.println("Color: ");
					color = InputTreatment.readString();

					System.out.println("Appropriate Climate: ");
					appropriateClimate = InputTreatment.readString();

					System.out.println("Appropriate Occasion: ");
					appropriateOccasion = InputTreatment.readString();

					System.out.println("One peace set type: ");
					onePieceSetType = InputTreatment.readString();

					System.out.println("Size: ");
					onePieceSetLenght = InputTreatment.readString();

					for (Clothing OutfitOnePieceSet: wardrobeLists.getWishToPurchase())
					{
						OnePieceSet onePieceSet = (OnePieceSet) OutfitOnePieceSet;

						if (onePieceSet.getColor().equalsIgnoreCase(color)
								&& onePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
								&& onePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
								&& onePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
								&& onePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
						{
							MyBottons.add(onePieceSet);
							wardrobe.getWishToPurchase().remove(OutfitOnePieceSet);
							System.out.println("This item was in your wish to purchase list.");
							System.out.println("It was automatically removed!");
							exists = true;
							break;
						}
					}
					if (!exists)
					{
						OnePieceSet newOnePieceSet = new OnePieceSet(color, appropriateClimate, appropriateOccasion,
													0, onePieceSetType, onePieceSetLenght);
						MyOnePieceSets.add(newOnePieceSet);
						System.out.println("This are your One Piece Sets in the moment:\n" + MyOnePieceSets);
					}

					break;

				case 4:

					System.out.println("Color: ");
					color = InputTreatment.readString();

					System.out.println("Appropriate Climate: ");
					appropriateClimate = InputTreatment.readString();

					System.out.println("Appropriate Occasion: ");
					appropriateOccasion = InputTreatment.readString();

					System.out.println("Type: ");
					coveringType = InputTreatment.readString();

					for (Clothing OutfitCovering: wardrobeLists.getWishToPurchase())
					{
						Covering covering = (Covering)OutfitCovering;

						if (covering.getColor().equalsIgnoreCase(color)
								&& covering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
								&& covering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
								&& covering.getCoveringType().equalsIgnoreCase(coveringType))
						{
							MyBottons.add(covering);
							wardrobe.getWishToPurchase().remove(OutfitCovering);
							System.out.println("This item was in your wish to purchase list.");
							System.out.println("It was automatically removed!");
							exists = true;
							break;
						}
					}
					if (!exists)
					{
						Covering newCovering = new Covering(color, appropriateClimate, appropriateOccasion,
																	0, coveringType);
						MyCoverings.add(newCovering);
						System.out.println("This are your Coverings in the moment:\n" + MyCoverings);
					}

					break;
			}

			System.out.println("The peace was added in your wardrobe!");
			totalNumberOfPieces++;

			System.out.println("Would you like to add another peace?\n");

			System.out.println("(1) Yes");
			System.out.println("(0) No");

			option = InputTreatment.twoOptions_0_1();

			if (option == 0) keepGoing = false;
		}
	}

	public void addInShoeCollection()
	{
		while (keepGoing)
		{
			System.out.println("Please complete the characteristics of the pair you're adding!");

			System.out.println("Type: ");
			shoesType = InputTreatment.readString();

			System.out.println("Color: ");
			shoesColor = InputTreatment.readString();

			Shoes newShoes = new Shoes(shoesType, shoesColor, 0);

			MyShoes.add(newShoes);

/*			for (Shoes shoes: MyShoes)
			{
				if (shoes.equals(newShoes))
				{
					wishToPurchase.remove(shoes);
					System.out.println("This pair was in your wish to purchase list.");
					System.out.println("It was automatically removed");
				}
			}*/

			System.out.println("The shoe was added in your collection!");
			totalNumberOfShoes++;

			System.out.println("Would you like to add another pair?\n");

			System.out.println("(1) Yes");
			System.out.println("(0) No");

			option = InputTreatment.twoOptions_0_1();

			if (option == 0) keepGoing = false;
		}
	}

	public void totalOfClothing()
	{
		System.out.println(totalNumberOfPieces);
	}

	public void totalOfBottons()
	{
		System.out.println(MyBottons.size());
	}

	public void totalOfTops()
	{
		System.out.println(MyTops.size());
	}

	public void totalOfOnePieceSets()
	{
		System.out.println(MyOnePieceSets.size());
	}

	public void totalOfCoverings()
	{
		System.out.println(MyCoverings.size());
	}

	public void totalOfShoes()
	{
		System.out.println(totalNumberOfShoes);
	}

	public void generateOutfitByChoice()
	{
		System.out.println("Would you like to make what kind of combination?");

		System.out.println("(1) Bottom and Top");
		System.out.println("(2) One Piece Set");
		System.out.println("(3) One Piece Set and Top");

		option = InputTreatment.threeOptions();

		switch (option)
		{
			case 1:

				if (MyBottons.isEmpty())
				{
					System.out.println("You don't have bottons in your wardrobe");
					run();
				}
				if (MyTops.isEmpty())
				{
					System.out.println("You don't have tops in your wardrobe");
					run();
				}
				if (!MyBottons.isEmpty() && !MyTops.isEmpty())
				{
					MyBottons.get(0).putInOutfit(MyBottons, Outfit, wardrobeLists);
					MyTops.get(0).putInOutfit(MyTops, Outfit, wardrobeLists);
				}

				break;

			case 2:

				if (MyOnePieceSets.isEmpty())
				{
					System.out.println("You don't have one piece sets in your wardrobe");
					run();
				}
				else
				{
					MyOnePieceSets.get(0).putInOutfit(MyOnePieceSets, Outfit, wardrobeLists);
				}

				break;

			case 3:

				if (MyTops.isEmpty())
				{
					System.out.println("You don't have tops in your wardrobe");
					run();
				}
				if (MyOnePieceSets.isEmpty())
				{
					System.out.println("You don't have one piece sets in your wardrobe");
					run();
				}
				if (!MyBottons.isEmpty() && !MyTops.isEmpty())
				{
					MyTops.get(0).putInOutfit(MyTops, Outfit, wardrobeLists);
					MyOnePieceSets.get(0).putInOutfit(MyOnePieceSets, Outfit, wardrobeLists);
				}

				break;
		}

		if (!MyCoverings.isEmpty())
		{
			System.out.println("Would you like to use a covering?");
			System.out.println("(1) Yes");
			System.out.println("(0) No");

			option = InputTreatment.twoOptions_0_1();

			if (option == 1)
			{
				MyCoverings.get(0).putInOutfit(MyCoverings, Outfit, wardrobeLists);
			}
		}

		System.out.println("Now to finish it up choose the pair of shoes you're wearing!");
		MyShoes.get(0).putInOutfit(MyShoes, Outfit, wardrobeLists);

		System.out.println("This is your Outfit!");
		System.out.println(Outfit);

		while (!Outfit.isEmpty())
		{
			System.out.println("Did you like it?");
			System.out.println("(1) Yes! I'm going to use it");
			System.out.println("(2) Yes! But I'm just testing some ideas");
			System.out.println("(3) No! I'd like to change it piece by piece ");
			System.out.println("(4) No! I'd like to star off another outfit");

			option = InputTreatment.fourOptions();

			switch (option)
			{
				case 1:

					for (Object piece : Outfit)
					{
						if (piece instanceof Clothing) ((Clothing) piece).setHowManyTimesThePieceWasUsed();
						else if (piece instanceof Shoes) ((Shoes) piece).setHowManyTimesThePairWasUsed();
					}

					ArrayList<OutfitClass> outfitClone = (ArrayList<OutfitClass>) Outfit.clone();
					allMyOutfits.add(outfitClone);

					System.out.println("(1) favoritesList");
					System.out.println("(2) piecesToWearMore");
					System.out.println("Would you like to add any of these pieces in one of theses lists?");

					System.out.println("(1) yes");
					System.out.println("(0) no");

					option = InputTreatment.twoOptions_0_1();

					if (option == 1)
					{
						System.out.println("(1) favoritesList");
						System.out.println("(2) piecesToWearMore");

						option = InputTreatment.twoOptions_1_2();

						if (option == 1) wardrobeLists.addInFavoritesList(MyTops, MyBottons, MyOnePieceSets, MyCoverings);
						else if (option == 2) wardrobeLists.addInPiecesToWearMore(MyTops, MyBottons, MyOnePieceSets, MyCoverings);
					}

					option = 1;

					Outfit.clear();
					break;

				case 2:

					System.out.println("(1) favoritesList");
					System.out.println("(2) piecesToWearMore");
					System.out.println("Would you like to add any of these pieces in one of theses lists?");

					System.out.println("(1) yes");
					System.out.println("(0) no");

					option = InputTreatment.twoOptions_0_1();

					if (option == 1)
					{
						System.out.println("(1) favoritesList");
						System.out.println("(2) piecesToWearMore");

						option = InputTreatment.twoOptions_1_2();

						if (option == 1) wardrobeLists.addInFavoritesList(MyTops, MyBottons, MyOnePieceSets, MyCoverings);
						else if (option == 2) wardrobeLists.addInPiecesToWearMore(MyTops, MyBottons, MyOnePieceSets, MyCoverings);
					}
					option = 2;

					Outfit.clear();
					break;

				case 3:

					System.out.println("Witch piece would you like to change?");

					String choice;

					//maybe use generics in this case, instead if objects

					for (Object piece : Outfit)
					{
						if (piece instanceof Bottom)
						{
							System.out.println("A Bottom? (yes/no)");

							choice = InputTreatment.yesOrNo();

							if (choice.equalsIgnoreCase("yes"))
							{
								MyBottons.get(0).replaceInOutfit(MyBottons, Outfit, Outfit.indexOf(piece));
							}
						}

						if (piece instanceof Top)
						{
							System.out.println("A Top? (yes/no)");

							choice = InputTreatment.yesOrNo();

							if (choice.equalsIgnoreCase("yes"))
							{
								MyTops.get(0).replaceInOutfit(MyTops, Outfit, Outfit.indexOf(piece));
							}
						}

						if (piece instanceof OnePieceSet)
						{
							System.out.println("A One piece set? (yes/no)");

							choice = InputTreatment.yesOrNo();

							if (choice.equalsIgnoreCase("yes"))
							{
								MyOnePieceSets.get(0).replaceInOutfit(MyOnePieceSets, Outfit, Outfit.indexOf(piece));
							}
						}

						if (piece instanceof Covering)
						{
							System.out.println("A Covering? (yes/no)");

							choice = InputTreatment.yesOrNo();

							if (choice.equalsIgnoreCase("yes"))
							{
								MyCoverings.get(0).replaceInOutfit(MyCoverings, Outfit, Outfit.indexOf(piece));
							}
						}

						if (piece instanceof Shoes)
						{
							System.out.println("A Pair of shoes? (yes/no)");

							choice = InputTreatment.yesOrNo();

							if (choice.equalsIgnoreCase("yes"))
							{
								MyShoes.get(0).replaceInOutfit(MyShoes, Outfit, Outfit.indexOf(piece));
							}
						}
					}

					System.out.println("This is your outfit now!\n" + Outfit);
					break;

				case 4:

					Outfit.clear();
					generateOutfitByChoice();
			}
		}
	}

	public void randomlyGenerateOutfit()
	{
		System.out.println("Would you like to wear what kind of combination?");

		System.out.println("(1) Bottom and Top");
		System.out.println("(2) One Piece Set");
		System.out.println("(3) One Piece Set and Top");

		option = InputTreatment.threeOptions();

		int arrayListSize;
		int randomNumber;
		Random random = new Random();

		Bottom OutfitBottom;
		Top OutfitTop;
		OnePieceSet OutfitOnePieceSet;
		Covering OutfitCovering;
		Shoes OutfitShoes;

		switch (option)
		{
			case 1:

				if (MyBottons.isEmpty())
				{
					System.out.println("You don't have bottons in your wardrobe");
					run();
				}

				if (MyTops.isEmpty())
				{
					System.out.println("You don't have tops in your wardrobe");
					run();
				}
				if (!MyBottons.isEmpty() && !MyTops.isEmpty())
				{
					arrayListSize = MyBottons.size();
					randomNumber = random.nextInt(arrayListSize);

					OutfitBottom = (Bottom)MyBottons.get(randomNumber);
					Outfit.add(OutfitBottom);

					arrayListSize = MyTops.size();
					randomNumber = random.nextInt(arrayListSize);

					OutfitTop = (Top)MyTops.get(randomNumber);
					Outfit.add(OutfitTop);
				}

				break;

			case 2:

				if (MyOnePieceSets.isEmpty())
				{
					System.out.println("You don't have one piece sets in your wardrobe");
					run();
				}
				else
				{
					arrayListSize = MyOnePieceSets.size();
					randomNumber = random.nextInt(arrayListSize);

					OutfitOnePieceSet = (OnePieceSet)MyOnePieceSets.get(randomNumber);
					Outfit.add(OutfitOnePieceSet);
				}

				break;

			case 3:

				if (MyTops.isEmpty())
				{
					System.out.println("You don't have tops in your wardrobe");
					run();
				}
				if (MyOnePieceSets.isEmpty())
				{
					System.out.println("You don't have one piece sets in your wardrobe");
					run();
				}
				if (!MyBottons.isEmpty() && !MyTops.isEmpty())
				{
					arrayListSize = MyTops.size();
					randomNumber = random.nextInt(arrayListSize);

					OutfitTop = (Top)MyTops.get(randomNumber);
					Outfit.add(OutfitTop);

					arrayListSize = MyOnePieceSets.size();
					randomNumber = random.nextInt(arrayListSize);

					OutfitOnePieceSet = (OnePieceSet)MyOnePieceSets.get(randomNumber);
					Outfit.add(OutfitOnePieceSet);
				}

				break;
		}

		if(!MyCoverings.isEmpty())
		{
			System.out.println("Would you like to use a covering?");
			System.out.println("(1) Yes");
			System.out.println("(0) No");

			option = InputTreatment.twoOptions_0_1();

			if (option == 1)
			{
				arrayListSize = MyCoverings.size();
				randomNumber = random.nextInt(arrayListSize);

				OutfitCovering = (Covering) MyCoverings.get(randomNumber);
				Outfit.add(OutfitCovering);
			}
		}

		arrayListSize = MyShoes.size();
		randomNumber = random.nextInt(arrayListSize);

		OutfitShoes = (Shoes) MyShoes.get(randomNumber);
		Outfit.add(OutfitShoes);

		System.out.println("This is your Outfit!");
		System.out.println(Outfit);

		while (!Outfit.isEmpty())
		{
			System.out.println("Did you like it?");
			System.out.println("(1) Yes! I'm going to use it");
			System.out.println("(2) Yes! But I'm just testing some ideas");
			System.out.println("(3) No! I'd like to generate another outfit randomly");

			option = InputTreatment.threeOptions();

			switch (option)
			{
				case 1:

					for (Object piece : Outfit)
					{
						if (piece instanceof Clothing) ((Clothing) piece).setHowManyTimesThePieceWasUsed();
						else if (piece instanceof Shoes) ((Shoes) piece).setHowManyTimesThePairWasUsed();
					}

					ArrayList<OutfitClass> outfitClone = (ArrayList<OutfitClass>) Outfit.clone();
					allMyOutfits.add(outfitClone);

					System.out.println("(1) favoritesList");
					System.out.println("(2) piecesToWearMore");
					System.out.println("Would you like to add any of these pieces in one of theses lists?");

					System.out.println("(1) yes");
					System.out.println("(0) no");

					option = InputTreatment.twoOptions_0_1();

					if (option == 1)
					{
						System.out.println("(1) favoritesList");
						System.out.println("(2) piecesToWearMore");

						option = InputTreatment.twoOptions_1_2();

						if (option == 1) wardrobeLists.addInFavoritesList(MyTops, MyBottons, MyOnePieceSets, MyCoverings);
						else if (option == 2) wardrobeLists.addInPiecesToWearMore(MyTops, MyBottons, MyOnePieceSets, MyCoverings);
					}

					option = 1;

					Outfit.clear();
					break;

				case 2:

					System.out.println("(1) favoritesList");
					System.out.println("(2) piecesToWearMore");
					System.out.println("Would you like to add any of these pieces in one of theses lists?");

					System.out.println("(1) yes");
					System.out.println("(0) no");

					option = InputTreatment.twoOptions_0_1();

					if (option == 1)
					{
						System.out.println("(1) favoritesList");
						System.out.println("(2) piecesToWearMore");

						option = InputTreatment.twoOptions_1_2();

						if (option == 1) wardrobeLists.addInFavoritesList(MyTops, MyBottons, MyOnePieceSets, MyCoverings);
						else if (option == 2) wardrobeLists.addInPiecesToWearMore(MyTops, MyBottons, MyOnePieceSets, MyCoverings);
					}

					option = 2;

					Outfit.clear();
					break;

				case 3:

					Outfit.clear();
					randomlyGenerateOutfit();
			}
		}
	}

	public void seeAllMyOutfits()
	{
		if (allMyOutfits.isEmpty())
		{
			System.out.println("You haven't used any outfit yet!");
		}
		else
		{
			System.out.println("This are all the outfits you have already used!");
			System.out.println(allMyOutfits);
		}
	}

	public void removeFromWardrobe()
	{
		System.out.println("What are you selling or donating?");
		System.out.println("(1) A piece of clothing");
		System.out.println("(2) A pair of shoes");

		option = InputTreatment.twoOptions_1_2();

		switch (option)
		{
			case 1:

				if (totalNumberOfPieces == 0)
				{
					System.out.println("You have no pieces in your wardrobe yet!");
					run();
				}

				System.out.println("What is the type clothing you are removing?");
				System.out.println("(1) Bottom!");
				System.out.println("(2) Top!");
				System.out.println("(3) One peace set!");
				System.out.println("(4) Covering!");

				option = InputTreatment.fourOptions();

				System.out.println("Please complete the characteristics of the peace!");

				switch (option)
				{
					case 1:

						if (MyBottons.isEmpty())
						{
							System.out.println("You have no bottons in your wardrobe yet!");
							run();
						}

						System.out.println("Color: ");

						color = InputTreatment.readString();

						System.out.println("Appropriate Climate: ");
						appropriateClimate = InputTreatment.readString();

						System.out.println("Appropriate Occasion: ");
						appropriateOccasion = InputTreatment.readString();

						System.out.println("Size: ");
						bottomSize = InputTreatment.readString();

						for (OutfitClass removingBottom : MyBottons)
						{
							Bottom bottom = (Bottom) removingBottom;

							if (bottom.getColor().equalsIgnoreCase(color)
									&& bottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
									&& bottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
									&& bottom.getSize().equalsIgnoreCase(bottomSize))
							{
								MyBottons.remove(bottom);
								System.out.println("The item was removed!");

								exists = true;
								keepGoing = false;
								break;
							}
						}
						if (!exists)
						{
							System.out.println("There is not a piece with this characteristics in your wardrobe.");
						}

						break;

					case 2:

						if (MyTops.isEmpty())
						{
							System.out.println("You have no tops in your wardrobe yet!");
							run();
						}

						System.out.println("Color: ");
						color = InputTreatment.readString();

						System.out.println("Appropriate Climate: ");
						appropriateClimate = InputTreatment.readString();

						System.out.println("Appropriate Occasion: ");
						appropriateOccasion = InputTreatment.readString();

						System.out.println("Size: ");
						topSize = InputTreatment.readString();

						for (OutfitClass OutfitTop : MyTops)
						{
							Top top = (Top) OutfitTop;

							if (top.getColor().equalsIgnoreCase(color)
									&& top.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
									&& top.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
									&& top.getSize().equalsIgnoreCase(topSize))
							{
								MyTops.remove(top);
								System.out.println("The item was removed!");

								exists = true;
								keepGoing = false;
								break;
							}
						}
						if (!exists)
						{
							System.out.println("There is not a piece with this characteristics in your wardrobe.");
						}

					case 3:

						if (MyOnePieceSets.isEmpty())
						{
							System.out.println("You have no one piece sets in your wardrobe yet!");
							run();
						}

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

						for (OutfitClass OutfitOnePieceSet : MyOnePieceSets)
						{
							OnePieceSet onePieceSet = (OnePieceSet) OutfitOnePieceSet;

							if (onePieceSet.getColor().equalsIgnoreCase(color)
									&& onePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
									&& onePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
									&& onePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
									&& onePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
							{
								MyOnePieceSets.remove(onePieceSet);
								System.out.println("The item was removed!");

								exists = true;
								keepGoing = false;
								break;
							}
						}
						if (!exists)
						{
							System.out.println("There is not a piece with this characteristics in your wardrobe.");
						}

					case 4:

						if (MyCoverings.isEmpty())
						{
							System.out.println("You have no coverings in your wardrobe yet!");
							run();
						}

						System.out.println("Color: ");
						color = InputTreatment.readString();

						System.out.println("Appropriate Climate: ");
						appropriateClimate = InputTreatment.readString();

						System.out.println("Appropriate Occasion: ");
						appropriateOccasion = InputTreatment.readString();

						System.out.println("Type: ");
						coveringType = InputTreatment.readString();

						for (OutfitClass OutfitCovering : MyCoverings)
						{
							Covering covering = (Covering) OutfitCovering;

							if (covering.getColor().equalsIgnoreCase(color)
									&& covering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
									&& covering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
									&& covering.getCoveringType().equalsIgnoreCase(coveringType))
							{
								MyCoverings.remove(covering);
								System.out.println("The item was removed!");

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

				break;

			case 2:

				if (totalNumberOfShoes == 0)
				{
					System.out.println("You have no shoes in your wardrobe yet!");
					run();
				}
				System.out.println("Please complete the characteristics of the pair of shoes!");

				System.out.println("Type: ");
				shoesType = InputTreatment.readString();

				System.out.println("Color: ");
				shoesColor = InputTreatment.readString();

				for (OutfitClass OutfitShoes: MyShoes)
				{
					Shoes shoes = (Shoes) OutfitShoes;

					if (shoes.getType().equalsIgnoreCase(shoesType)
							&& shoes.getColor().equalsIgnoreCase(shoesColor))
					{
						MyShoes.remove(shoes);
						System.out.println("The item was removed!");

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