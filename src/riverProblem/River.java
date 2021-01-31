package riverProblem;

public class River {

	String riverName;
	LinkedList<Point> points=new LinkedList<Point>();
	
	public River(String riverName, LinkedList<Point> points) {
		super();
		this.riverName = riverName;
		this.points = points;
	}

	public String getRiverName() {
		return riverName;
	}

	public void setRiverName(String riverName) {
		this.riverName = riverName;
	}

	public LinkedList<Point> getPoints() {
		return points;
	}

	public void setPoints(LinkedList<Point> points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "RiverName = " + riverName + "\n Points1 = " + points.get(0).toString() + "\n Points2 = " + points.get(1).toString() +
				"\n Points3 = " + points.get(2).toString() +
				"\n Points4 = " + points.get(3).toString() +"\n";
	}
	
	
}
