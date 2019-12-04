package Outfit;

import java.util.ArrayList;

public abstract class OutfitClass
{
    public abstract void putInOutfit(ArrayList<OutfitClass> listClothing, ArrayList<OutfitClass> outfits, WardrobeLists wardrobeLists);
    public abstract void replaceInOutfit(ArrayList<OutfitClass> listClothing, ArrayList<OutfitClass> outfits, int index);

}
