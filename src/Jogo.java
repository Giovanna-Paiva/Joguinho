import model.Cenario;
import model.Enemy;
import model.GameObject;
import model.Hero;
import model.SceneObject;

public class Jogo {
	public static void main(String args[]) {
		
		GameObject c,s,e,h;
		
		c = new Cenario(0,0);
		s = new SceneObject(10,10,true);
		e = new Enemy(25,0,10);
		h = new Hero(15,0,10,3,1);
		
		c.update();
		System.out.println("--------------------------------");
		s.draw();
		System.out.println("--------------------------------");
		e.update();
		System.out.println("--------------------------------");
		h.draw();		
		System.out.println("--------------------------------");
		h.update();
		
		
		
	}
}
