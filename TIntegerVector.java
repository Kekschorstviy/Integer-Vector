public class TIntegerVector {

	public static void main(String[] args) {

		IntegerVector iv = new IntegerVector(5);
		
		for (int i = 0; i < iv.getSize(); ++i) {
			iv.setAt(i, Terminal.getInt(i + ":"));
		}
		
		Terminal.put("Contents:\t" + iv);
//		Terminal.put("Sum:     \t" + iv.sum());
		Terminal.put("How it looks like: " + iv.toString());
		Terminal.put("Average: " + iv.average());
		Terminal.put("\n"+ iv.contains(12));
		iv.sort(); // not allowed to call "void" methodes in "Terminal" class



	}

}
