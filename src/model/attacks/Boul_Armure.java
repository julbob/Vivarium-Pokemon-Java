package model.attacks;

import model.Attack;
import model.Feature;
import model.Type;

public class Boul_Armure extends Attack {

	public Boul_Armure() {
		super((short) 2, (float) Float.MAX_VALUE, (short) 40, Type.Normal,Feature.Defense,true);
	}
}