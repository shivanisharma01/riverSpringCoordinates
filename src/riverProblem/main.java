package riverProblem;

public class main {
	
	
	static LinkedList<River> rivers=new LinkedList<River>();
	
	
	public static void main(String[] args) {
		String tempRiverName;
		int tempX;
		int tempY;
		int tempZ;
		
		/////////////////////////////////River 1
		
		tempRiverName="Nile";
		//Points for River 1
		tempX=100;
		tempY=10;
		tempZ=25;
		Point p1=new Point(tempX,tempY,tempZ);
		
		tempX=200;
		tempY=500;
		tempZ=26;
		Point p2=new Point(tempX,tempY,tempZ);
		
		tempX=300;
		tempY=300;
		tempZ=27;
		Point p3=new Point(tempX,tempY,tempZ);
		
		tempX=400;
		tempY=400;
		tempZ=28;
		Point p4=new Point(tempX,tempY,tempZ);
		
		LinkedList<Point> pointsRiver1=new LinkedList<Point>();
		pointsRiver1.add(p1);
		pointsRiver1.add(p2);
		pointsRiver1.add(p3);
		pointsRiver1.add(p4);
		
		River river1=new River(tempRiverName, pointsRiver1);
		
		rivers.add(river1);
		
		/////////////////////////////////River 2
		
		tempRiverName="Amazon River";
		//Points for River 2
		tempX=400;
		tempY=400;
		tempZ=28;
		Point p5=new Point(tempX,tempY,tempZ);
		
		tempX=50;
		tempY=500;
		tempZ=20;
		Point p6=new Point(tempX,tempY,tempZ);
		
		tempX=60;
		tempY=300;
		tempZ=19;
		Point p7=new Point(tempX,tempY,tempZ);
		
		tempX=70;
		tempY=400;
		tempZ=19;
		Point p8=new Point(tempX,tempY,tempZ);
		
		LinkedList<Point> pointsRiver2=new LinkedList<Point>();
		pointsRiver2.add(p5);
		pointsRiver2.add(p6);
		pointsRiver2.add(p7);
		pointsRiver2.add(p8);
		
		River river2=new River(tempRiverName, pointsRiver2);
		
		rivers.add(river2);
		
		
		
		/////////////////////////////////River 3
				
		tempRiverName="Indus River";
		//Points for River 3
		tempX=70;
		tempY=400;
		tempZ=19;
		Point p9=new Point(tempX,tempY,tempZ);
		
		tempX=90;
		tempY=350;
		tempZ=20;
		Point p10=new Point(tempX,tempY,tempZ);
		
		tempX=100;
		tempY=302;
		tempZ=16;
		Point p11=new Point(tempX,tempY,tempZ);
		
		tempX=98;
		tempY=400;
		tempZ=15;
		Point p12=new Point(tempX,tempY,tempZ);
		
		LinkedList<Point> pointsRiver3=new LinkedList<Point>();
		pointsRiver3.add(p9);
		pointsRiver3.add(p10);
		pointsRiver3.add(p11);
		pointsRiver3.add(p12);
		
		River river3=new River(tempRiverName, pointsRiver3);
		
		rivers.add(river3);
		
		
		/////////////////////////////////River 4
		
		tempRiverName="Volga River";
		//Points for River 4
		tempX=98;
		tempY=400;
		tempZ=15;
		Point p13=new Point(tempX,tempY,tempZ);
		
		tempX=80;
		tempY=350;
		tempZ=14;
		Point p14=new Point(tempX,tempY,tempZ);
		
		tempX=100;
		tempY=304;
		tempZ=14;
		Point p15=new Point(tempX,tempY,tempZ);
		
		tempX=98;
		tempY=400;
		tempZ=13;
		Point p16=new Point(tempX,tempY,tempZ);
		
		LinkedList<Point> pointsRiver4=new LinkedList<Point>();
		pointsRiver4.add(p13);
		pointsRiver4.add(p14);
		pointsRiver4.add(p15);
		pointsRiver4.add(p16);
		
		River river4=new River(tempRiverName, pointsRiver4);
		
		rivers.add(river4);
		
		
		System.out.println("/////////////////////Rivers//////////////////////\n");
		for(int i=rivers.size()-1;i>=0;i--)
		{
			System.out.println(rivers.get(i).toString());
		}
		
		
		System.out.println("/////////////////////Points to check navigation//////////////////////\n");
		
		/// X, Y, Z for first Point
		int x1=100;
		int y1=10;
		int z1=25;
		
		Point point1=new Point(x1, y1, z1);
		System.out.println("From Point ::");
		System.out.println(point1.toString());
		
		/// X, Y, Z for second Point
		int x2=98;
		int y2=400;
		int z2=15;
		
		System.out.println();
		Point point2=new Point(x2, y2, z2);
		System.out.println("To Point ::");
		System.out.println(point2.toString());
		
		System.out.println();
		
		for(int i=0;i<rivers.size();i++)
		{
			if(rivers.get(i).getPoints().get(0).getX()== x1)
				if(rivers.get(i).getPoints().get(0).getY()== y1)
					if(rivers.get(i).getPoints().get(0).getZ()== z1)
					{
						int tX=rivers.get(i).getPoints().get(3).getX();
						int tY=rivers.get(i).getPoints().get(3).getY();
						int tZ=rivers.get(i).getPoints().get(3).getZ();
						
						for(int j=0;j<rivers.size();j++)
						{
							if(j+1<rivers.size())
							if(rivers.get(j+1).getPoints().get(0).getX()== tX)
								if(rivers.get(j+1).getPoints().get(0).getY()== tY)
									if(rivers.get(j+1).getPoints().get(0).getZ()== tZ)
									{
										System.out.println(rivers.get(i).getRiverName() + " ==> "+ rivers.get(j+1).getRiverName());
										int ttX=rivers.get(j+1).getPoints().get(3).getX();
										int ttY=rivers.get(j+1).getPoints().get(3).getY();
										int ttZ=rivers.get(j+1).getPoints().get(3).getZ();
										
										for(int k=0;k<rivers.size();k++)
										{
											if(k+2<rivers.size())
											if(rivers.get(k+2).getPoints().get(0).getX()== ttX)
												if(rivers.get(k+2).getPoints().get(0).getY()== ttY)
													if(rivers.get(k+2).getPoints().get(0).getZ()== ttZ)
													{
														System.out.println(rivers.get(j+1).getRiverName() + " ==> "+ rivers.get(k+2).getRiverName());
														int tttX=rivers.get(k+2).getPoints().get(3).getX();
														int tttY=rivers.get(k+2).getPoints().get(3).getY();
														int tttZ=rivers.get(k+2).getPoints().get(3).getZ();
													}
										}
									}
						}
					}
		}
		
		
		
		
	}


}
