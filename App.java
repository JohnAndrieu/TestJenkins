public class App {
	
	public int somme(int a, int b) {
		return a+b;
	}
	
    public static void main( String[] args )
    {
        App app = new App();
        int a = 3;
        int b = 5;
        System.out.println("La somme de "+a+" et "+b+" est : "+app.somme(a, b));
    }
}