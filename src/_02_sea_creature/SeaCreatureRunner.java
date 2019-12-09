package _02_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
	SeaCreature Spongebob = new SeaCreature("Spongebob");
	SeaCreature Patrick = new SeaCreature("Patrick");
	SeaCreature Squidward = new SeaCreature("Squidward");
	
	Spongebob.eat();
	Spongebob.laugh();
	
	Patrick.eat();
	Patrick.getName();
	Patrick.laugh();
	
	Squidward.eat();
	Squidward.getName();
	Squidward.laugh();
	
	
	}
}
