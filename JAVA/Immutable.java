public final class Immutable{
		final int x;
		final double d;
		
	public Immutable(int x, double d) {
			this.x=x;
			this.d=d;
			}
	 public int getX() {
		 return x;
	 }
	public double getD() {
		return d;
		
	}
	}
	class XYZ{
		public static void main(String[] args) {
			Immutable i = new Immutable(100,200);
			System.out.println("integer ="+ i.getX());
			System.out.println("double="+ i.getD());
			}
	}

