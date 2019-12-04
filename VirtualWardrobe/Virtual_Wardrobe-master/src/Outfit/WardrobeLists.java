package Outfit;

import TypeOfClothing.*;
import main.InputTreatment;

import java.util.ArrayList;

public class WardrobeLists
{
    private ArrayList<Clothing> favoritesList = new ArrayList();
    private ArrayList<Clothing> piecesToWearMore = new ArrayList();
    private ArrayList<Clothing> wishToPurchase = new ArrayList();
    private ArrayList<Clothing> inNeedOfRepair = new ArrayList();

    public ArrayList<Clothing> getFavoritesList()
    {

        return this.favoritesList;
    }

    public void addInFavoritesList(ArrayList<OutfitClass> MyTops, ArrayList<OutfitClass> MyBottons,
                                    ArrayList<OutfitClass> MyOnePieceSets, ArrayList<OutfitClass> MyCoverings)
    {
        String color;
        String appropriateClimate;
        String appropriateOccasion;
        String bottomSize;
        String topSize;
        String onePieceSetType;
        String onePieceSetLenght;
        String coveringType;
        boolean keepGoing = true;
        boolean exists = false;
        int option;

        System.out.println("Witch type of clothing would you like to add?");
        System.out.println("(1) Bottons");
        System.out.println("(2) Tops");
        System.out.println("(3) One piece sets");
        System.out.println("(4) Covering");

        option = InputTreatment.fourOptions();

        switch (option)
        {
            case 1:

                while (keepGoing)
                {
                    System.out.println("Choose your bottom characteristics");

                    System.out.println("Color: ");
                    color = InputTreatment.readString();

                    System.out.println("Appropriate Climate: ");
                    appropriateClimate = InputTreatment.readString();

                    System.out.println("Appropriate Occasion: ");
                    appropriateOccasion = InputTreatment.readString();

                    System.out.println("Size: ");
                    bottomSize = InputTreatment.readString();

                    for (OutfitClass outfitBottom: MyBottons)
                    {
                        Bottom OutfitBottom = (Bottom)outfitBottom;
                        if (OutfitBottom.getColor().equalsIgnoreCase(color)
                                && OutfitBottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitBottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitBottom.getSize().equalsIgnoreCase(bottomSize))
                        {
                            favoritesList.add(OutfitBottom);
                            System.out.println("The piece was added!");
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

                    for (OutfitClass outfitTop: MyTops)
                    {
                        Top OutfitTop = (Top)outfitTop;
                        if (OutfitTop.getColor().equalsIgnoreCase(color)
                                && OutfitTop.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitTop.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitTop.getSize().equalsIgnoreCase(topSize))
                        {
                            favoritesList.add(OutfitTop);
                            System.out.println("The piece was added!");
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

            case 3:

                while (keepGoing)
                {
                    System.out.println("Choose your One piece Set characteristics");

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

                    for (OutfitClass outfitOnePieceSet : MyOnePieceSets)
                    {
                        OnePieceSet OutfitOnePieceSet = (OnePieceSet)outfitOnePieceSet;
                        if (OutfitOnePieceSet.getColor().equalsIgnoreCase(color)
                                && OutfitOnePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitOnePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitOnePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
                                && OutfitOnePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
                        {
                            favoritesList.add(OutfitOnePieceSet);
                            System.out.println("The piece was added!");
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

            case 4:

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

                    for (OutfitClass outfitCovering: MyCoverings)
                    {
                        Covering OutfitCovering = (Covering) outfitCovering;
                        if (OutfitCovering.getColor().equalsIgnoreCase(color)
                                && OutfitCovering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitCovering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitCovering.getCoveringType().equalsIgnoreCase(coveringType))
                        {
                            favoritesList.add(OutfitCovering);
                            System.out.println("The piece was added!");
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
        }
    }

    public void SeeFavoritesList()
    {
        if (favoritesList.isEmpty())
        {
            System.out.println("You don't have items in this list yet!");
        }
        else
        {
            System.out.println("This is your Favorites List");
            System.out.println(favoritesList);
        }
    }

    public void removeFromFavoritesList()
    {
        String color;
        String appropriateClimate;
        String appropriateOccasion;
        String bottomSize;
        String topSize;
        String onePieceSetType;
        String onePieceSetLenght;
        String coveringType;
        boolean exists = false;
        int option;

        System.out.println("Witch of theses four types of Clothing you're removing?");
        System.out.println("(1) Bottons");
        System.out.println("(2) Tops");
        System.out.println("(3) One piece sets");
        System.out.println("(4) Covering");

        option = InputTreatment.fourOptions();

        System.out.println("Please complete the characteristics of the piece.");

        switch (option)
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

                for (Clothing outfitBottom: favoritesList)
                {
                    if (outfitBottom.getColor().equalsIgnoreCase(color)
                            && outfitBottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && outfitBottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && outfitBottom.getSize().equalsIgnoreCase(bottomSize))
                    {
                        favoritesList.remove(outfitBottom);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
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

                for (Clothing outfitTop: favoritesList)
                {
                    if (outfitTop.getColor().equalsIgnoreCase(color)
                            && outfitTop.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && outfitTop.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && outfitTop.getSize().equalsIgnoreCase(topSize))
                    {
                        favoritesList.remove(outfitTop);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
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

                for (Clothing outfitOnePieceSet : favoritesList)
                {
                    OnePieceSet OutfitOnePieceSet = (OnePieceSet)outfitOnePieceSet;

                    if (OutfitOnePieceSet.getColor().equalsIgnoreCase(color)
                            && OutfitOnePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && OutfitOnePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && OutfitOnePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
                            && OutfitOnePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
                    {
                        favoritesList.remove(OutfitOnePieceSet);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
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

                for (Clothing outfitCovering: favoritesList)
                {
                    Covering OutfitCovering = (Covering) outfitCovering;
                    if (OutfitCovering.getColor().equalsIgnoreCase(color)
                            && OutfitCovering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && OutfitCovering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && OutfitCovering.getCoveringType().equalsIgnoreCase(coveringType))
                    {
                        favoritesList.remove(OutfitCovering);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
                }

                break;
        }
    }

    public ArrayList<Clothing> getPiecesToWearMore()
    {
        return this.piecesToWearMore;
    }

    public void addInPiecesToWearMore(ArrayList<OutfitClass> MyTops, ArrayList<OutfitClass> MyBottons,
                                      ArrayList<OutfitClass> MyOnePieceSets, ArrayList<OutfitClass> MyCoverings)
    {
        String color;
        String appropriateClimate;
        String appropriateOccasion;
        String bottomSize;
        String topSize;
        String onePieceSetType;
        String onePieceSetLenght;
        String coveringType;
        boolean keepGoing = true;
        boolean exists = false;
        int option;

        System.out.println("Witch type of clothing would you like to add?");
        System.out.println("(1) Bottons");
        System.out.println("(2) Tops");
        System.out.println("(3) One piece sets");
        System.out.println("(4) Covering");

        option = InputTreatment.fourOptions();

        switch (option)
        {
            case 1:

                while (keepGoing)
                {
                    System.out.println("Choose your bottom characteristics");

                    System.out.println("Color: ");
                    color = InputTreatment.readString();

                    System.out.println("Appropriate Climate: ");
                    appropriateClimate = InputTreatment.readString();

                    System.out.println("Appropriate Occasion: ");
                    appropriateOccasion = InputTreatment.readString();

                    System.out.println("Size: ");
                    bottomSize = InputTreatment.readString();

                    for (OutfitClass outfitBottom : MyBottons)
                    {
                        Bottom OutfitBottom = (Bottom)outfitBottom;
                        if (OutfitBottom.getColor().equalsIgnoreCase(color)
                                && OutfitBottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitBottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitBottom.getSize().equalsIgnoreCase(bottomSize))
                        {
                            piecesToWearMore.add(OutfitBottom);
                            System.out.println("The piece was added!");
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

                    for (OutfitClass outfitTop : MyTops)
                    {
                        Top OutfitTop = (Top)outfitTop;
                        if (OutfitTop.getColor().equalsIgnoreCase(color)
                                && OutfitTop.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitTop.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitTop.getSize().equalsIgnoreCase(topSize))
                        {
                            piecesToWearMore.add(OutfitTop);
                            System.out.println("The piece was added!");
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

            case 3:

                while (keepGoing)
                {
                    System.out.println("Choose your One piece Set characteristics");

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

                    for (OutfitClass outfitOnePieceSet : MyOnePieceSets)
                    {
                        OnePieceSet OutfitOnePieceSet = (OnePieceSet)outfitOnePieceSet;
                        if (OutfitOnePieceSet.getColor().equalsIgnoreCase(color)
                                && OutfitOnePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitOnePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitOnePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
                                && OutfitOnePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
                        {
                            piecesToWearMore.add(OutfitOnePieceSet);
                            System.out.println("The piece was added!");
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

            case 4:

                while (keepGoing) {
                    System.out.println("Choose your Covering characteristics");

                    System.out.println("Color: ");
                    color = InputTreatment.readString();

                    System.out.println("Appropriate Climate: ");
                    appropriateClimate = InputTreatment.readString();

                    System.out.println("Appropriate Occasion: ");
                    appropriateOccasion = InputTreatment.readString();

                    System.out.println("Type: ");
                    coveringType = InputTreatment.readString();

                    for (OutfitClass outfitCovering : MyCoverings)
                    {
                        Covering OutfitCovering = (Covering)outfitCovering;
                        if (OutfitCovering.getColor().equalsIgnoreCase(color)
                                && OutfitCovering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitCovering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitCovering.getCoveringType().equalsIgnoreCase(coveringType))
                        {
                            piecesToWearMore.add(OutfitCovering);
                            System.out.println("The piece was added!");
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

    public void SeePiecesToWearMore()
    {
        if (piecesToWearMore.isEmpty())
        {
            System.out.println("You don't have items in this list yet!");
        }
        else
        {
            System.out.println("This is your Pieces To Wear More List");
            System.out.println(piecesToWearMore);
        }
    }

    public void removeFromPiecesToWearMore()
    {
        String color;
        String appropriateClimate;
        String appropriateOccasion;
        String bottomSize;
        String topSize;
        String onePieceSetType;
        String onePieceSetLenght;
        String coveringType;
        boolean exists = false;
        int option;

        System.out.println("Witch of theses four types of Clothing you're removing?");
        System.out.println("(1) Bottons");
        System.out.println("(2) Tops");
        System.out.println("(3) One piece sets");
        System.out.println("(4) Covering");

        option = InputTreatment.fourOptions();

        System.out.println("Please complete the characteristics of the piece.");

        switch (option)
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

                for (Clothing outfitBottom : piecesToWearMore)
                {

                    if (outfitBottom.getColor().equalsIgnoreCase(color)
                            && outfitBottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && outfitBottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && outfitBottom.getSize().equalsIgnoreCase(bottomSize))
                    {
                        piecesToWearMore.remove(outfitBottom);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
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

                for (Clothing outfitTop : piecesToWearMore)
                {
                    if (outfitTop.getColor().equalsIgnoreCase(color)
                            && outfitTop.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && outfitTop.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && outfitTop.getSize().equalsIgnoreCase(topSize))
                    {
                        piecesToWearMore.remove(outfitTop);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
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

                for (Clothing outfitOnePieceSet : piecesToWearMore)
                {
                    OnePieceSet OutfitOnePieceSet = (OnePieceSet)outfitOnePieceSet;

                    if (OutfitOnePieceSet.getColor().equalsIgnoreCase(color)
                            && OutfitOnePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && OutfitOnePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && OutfitOnePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
                            && OutfitOnePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
                    {
                        piecesToWearMore.remove(OutfitOnePieceSet);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
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

                for (Clothing outfitCovering : piecesToWearMore)
                {
                    Covering OutfitCovering = (Covering)outfitCovering;

                    if (OutfitCovering.getColor().equalsIgnoreCase(color)
                            && OutfitCovering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && OutfitCovering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && OutfitCovering.getCoveringType().equalsIgnoreCase(coveringType))
                    {
                        piecesToWearMore.remove(OutfitCovering);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
                }
        }
    }

    public ArrayList<Clothing> getWishToPurchase()
    {
        return this.wishToPurchase;
    }

    public void addInWishToPurchase()
    {
        String color;
        String appropriateClimate;
        String appropriateOccasion;
        String bottomSize;
        String topSize;
        String onePieceSetType;
        String onePieceSetLenght;
        String coveringType;
        boolean keepGoing = true;
        int option;

        while (keepGoing)
        {
            System.out.println("Witch of theses four types of clothing are ");

            System.out.println("(1) Bottom!");
            System.out.println("(2) Top!");
            System.out.println("(3) One piece set!");
            System.out.println("(4) Covering!");

            option = InputTreatment.fourOptions();

            System.out.println("Please complete the characteristics of the piece you're adding!");

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

                    Bottom newBottom = new Bottom(color, appropriateClimate, appropriateOccasion, 0, bottomSize);

                    wishToPurchase.add(newBottom);

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

                    Top newTop = new Top(color, appropriateClimate, appropriateOccasion, 0, topSize);

                    wishToPurchase.add(newTop);

                    break;

                case 3:

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

                    OnePieceSet newOnePieceSet = new OnePieceSet(color, appropriateClimate, appropriateOccasion, 0, onePieceSetType, onePieceSetLenght);

                    wishToPurchase.add(newOnePieceSet);

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

                    Covering newCovering = new Covering(color, appropriateClimate, appropriateOccasion, 0, coveringType);

                    wishToPurchase.add(newCovering);

                    break;
            }

            System.out.println("The piece was added in your wish to purchase list!");

            System.out.println("Would you like to add another peace?\n");

            System.out.println("(1) Yes");
            System.out.println("(0) No");

            option = InputTreatment.twoOptions_0_1();

            if (option == 0) keepGoing = false;
        }
    }

    public void seeWishToPurchase()
    {
        if (wishToPurchase.isEmpty())
        {
            System.out.println("You don't have items in this list yet!");
        }
        else
        {
            System.out.println("This is your wish to purchase List");
            System.out.println(wishToPurchase);
        }
    }

    public void removeFromWishToPurchase()
    {
        String color;
        String appropriateClimate;
        String appropriateOccasion;
        String bottomSize;
        String topSize;
        String onePieceSetType;
        String onePieceSetLenght;
        String coveringType;
        boolean exists = false;
        int option;

        System.out.println("Witch of theses four types of Clothing you're removing?");

        System.out.println("(1) Bottom!");
        System.out.println("(2) Top!");
        System.out.println("(3) One piece set!");
        System.out.println("(4) Covering!");

        option = InputTreatment.fourOptions();

        System.out.println("Please complete the characteristics of the piece.");

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

                for (OutfitClass outfitBottom : wishToPurchase)
                {
                    Bottom OutfitBottom = (Bottom)outfitBottom;
                    if (OutfitBottom.getColor().equalsIgnoreCase(color)
                            && OutfitBottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && OutfitBottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && OutfitBottom.getSize().equalsIgnoreCase(bottomSize))
                    {
                        wishToPurchase.remove(OutfitBottom);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
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

                for (OutfitClass OutfitTop: wishToPurchase)
                {
                    Top top = (Top) OutfitTop;

                    if (top.getColor().equalsIgnoreCase(color)
                            && top.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && top.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && top.getSize().equalsIgnoreCase(topSize))
                    {
                        wishToPurchase.remove(OutfitTop);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
                }

                break;

            case 3:

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

                for (OutfitClass OutfitOnePieceSet: wishToPurchase)
                {
                    OnePieceSet onePieceSet = (OnePieceSet) OutfitOnePieceSet;

                    if (onePieceSet.getColor().equalsIgnoreCase(color)
                            && onePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && onePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && onePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
                            && onePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
                    {
                        wishToPurchase.remove(OutfitOnePieceSet);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
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

                for (Clothing outfitCovering : wishToPurchase)
                {
                    Covering OutfitCovering = (Covering)outfitCovering;

                    if (OutfitCovering.getColor().equalsIgnoreCase(color)
                            && OutfitCovering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && OutfitCovering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && OutfitCovering.getCoveringType().equalsIgnoreCase(coveringType))
                    {
                        wishToPurchase.remove(OutfitCovering);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
                }

                break;
        }
    }

    public ArrayList<Clothing> getInNeedOfRepair()
    {
        return this.inNeedOfRepair;
    }

    public void addInInNeedOfRepair(ArrayList<OutfitClass> MyTops, ArrayList<OutfitClass> MyBottons,
                                    ArrayList<OutfitClass> MyOnePieceSets, ArrayList<OutfitClass> MyCoverings)
    {
        String color;
        String appropriateClimate;
        String appropriateOccasion;
        String bottomSize;
        String topSize;
        String onePieceSetType;
        String onePieceSetLenght;
        String coveringType;
        boolean keepGoing = true;
        boolean exists = false;
        int option;

        System.out.println("Witch type of clothing would you like to add?");
        System.out.println("(1) Bottons");
        System.out.println("(2) Tops");
        System.out.println("(3) One piece sets");
        System.out.println("(4) Covering");

        option = InputTreatment.fourOptions();

        switch (option)
        {
            case 1:

                while (keepGoing)
                {
                    System.out.println("Choose your bottom characteristics");

                    System.out.println("Color: ");
                    color = InputTreatment.readString();

                    System.out.println("Appropriate Climate: ");
                    appropriateClimate = InputTreatment.readString();

                    System.out.println("Appropriate Occasion: ");
                    appropriateOccasion = InputTreatment.readString();

                    System.out.println("Size: ");
                    bottomSize = InputTreatment.readString();

                    for (OutfitClass outfitBottom: MyBottons)
                    {
                        Bottom OutfitBottom = (Bottom)outfitBottom;
                        if (OutfitBottom.getColor().equalsIgnoreCase(color)
                                && OutfitBottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitBottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitBottom.getSize().equalsIgnoreCase(bottomSize))
                        {
                            inNeedOfRepair.add(OutfitBottom);
                            System.out.println("The piece was added!");
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

                    for (OutfitClass outfitTop: MyTops)
                    {
                        Top OutfitTop = (Top)outfitTop;
                        if (OutfitTop.getColor().equalsIgnoreCase(color)
                                && OutfitTop.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitTop.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitTop.getSize().equalsIgnoreCase(topSize))
                        {
                            inNeedOfRepair.add(OutfitTop);
                            System.out.println("The piece was added!");
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

            case 3:

                while (keepGoing)
                {
                    System.out.println("Choose your One piece Set characteristics");

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

                    for (OutfitClass outfitOnePieceSet : MyOnePieceSets)
                    {
                        OnePieceSet OutfitOnePieceSet = (OnePieceSet)outfitOnePieceSet;
                        if (OutfitOnePieceSet.getColor().equalsIgnoreCase(color)
                                && OutfitOnePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitOnePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitOnePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
                                && OutfitOnePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
                        {
                            inNeedOfRepair.add(OutfitOnePieceSet);
                            System.out.println("The piece was added!");
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

            case 4:

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

                    for (OutfitClass outfitCovering: MyCoverings)
                    {
                        Covering OutfitCovering = (Covering) outfitCovering;
                        if (OutfitCovering.getColor().equalsIgnoreCase(color)
                                && OutfitCovering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitCovering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitCovering.getCoveringType().equalsIgnoreCase(coveringType))
                        {
                            inNeedOfRepair.add(OutfitCovering);
                            System.out.println("The piece was added!");
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
        }
    }

    public void seeInNeedOfRepair()
    {
        if (inNeedOfRepair.isEmpty())
        {
            System.out.println("You don't have items in this list yet!");
        }
        else
        {
            System.out.println("This is your in need of repair List");
            System.out.println(inNeedOfRepair);
        }
    }

    public void removeFromInNeedOfRepair()
    {
        String color;
        String appropriateClimate;
        String appropriateOccasion;
        String bottomSize;
        String topSize;
        String onePieceSetType;
        String onePieceSetLenght;
        String coveringType;
        boolean exists = false;
        int option;

        System.out.println("Witch of theses four types of Clothing you're removing?");

        System.out.println("(1) Bottom!");
        System.out.println("(2) Top!");
        System.out.println("(3) One piece set!");
        System.out.println("(4) Covering!");

        option = InputTreatment.fourOptions();

        System.out.println("Please complete the characteristics of the piece.");

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

                for (OutfitClass outfitBottom : inNeedOfRepair)
                {
                    Bottom OutfitBottom = (Bottom)outfitBottom;
                    if (OutfitBottom.getColor().equalsIgnoreCase(color)
                            && OutfitBottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && OutfitBottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && OutfitBottom.getSize().equalsIgnoreCase(bottomSize))
                    {
                        inNeedOfRepair.remove(OutfitBottom);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
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

                for (OutfitClass OutfitTop: inNeedOfRepair)
                {
                    Top top = (Top) OutfitTop;

                    if (top.getColor().equalsIgnoreCase(color)
                            && top.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && top.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && top.getSize().equalsIgnoreCase(topSize))
                    {
                        inNeedOfRepair.remove(OutfitTop);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
                }

                break;

            case 3:

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

                for (OutfitClass OutfitOnePieceSet: inNeedOfRepair)
                {
                    OnePieceSet onePieceSet = (OnePieceSet) OutfitOnePieceSet;

                    if (onePieceSet.getColor().equalsIgnoreCase(color)
                            && onePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && onePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && onePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
                            && onePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
                    {
                        inNeedOfRepair.remove(OutfitOnePieceSet);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
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

                for (Clothing outfitCovering : inNeedOfRepair)
                {
                    Covering OutfitCovering = (Covering)outfitCovering;

                    if (OutfitCovering.getColor().equalsIgnoreCase(color)
                            && OutfitCovering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                            && OutfitCovering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                            && OutfitCovering.getCoveringType().equalsIgnoreCase(coveringType))
                    {
                        inNeedOfRepair.remove(OutfitCovering);
                        System.out.println("The piece was removed!");
                        exists = true;
                        break;
                    }
                }
                if (!exists)
                {
                    System.out.println("There is not a piece with this characteristics in this list.");
                }

                break;
        }
    }
}
