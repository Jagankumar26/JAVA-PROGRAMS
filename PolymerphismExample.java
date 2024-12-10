package first_project;
 class Media
{
	public  void play() {
		System.out.println("this is from Media class");
	}
	
}
 class Audio extends Media
 {
	 public void play()
	 {
		 System.out.println("Audio will be played..");
	 }
 }
 class video extends Media
 {
	 public void play()
	 {
		 System.out.println("video will be displayed...");
	 }
 }
public class PolymerphismExample {
//	Design a class Media with a method play(). Extend this into classes Audio and Video where each subclass provides its own implementation of play(). Demonstrate runtime polymorphism by calling the play() method through a reference of type Media.
	public static void main(String[] args) {
	Media mobj=new video();
	mobj.play();
	Media m2obj=new Audio();
	m2obj.play();

	}

}
