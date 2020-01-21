
public enum Arithmetic {
	SUM{
		public int operation(int x,int y){
			return x+y;
		}
	},
	SUBSTRACT{
		public int operation(int x, int y){
			return x-y;
		}
	},
	MULTIPLY{
		public int operation(int x, int y){
			return x*y;
		}
	};
	public abstract int operation (int x, int y);
}
