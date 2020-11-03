package pw2;
public class Exercise1 {
	 public static class Point { 
	     private float x;
	     private float y;
	     public Point(float x , float y){
	         this.x = x;
	         this.y = y;
	     }
	     public float getX(){
	         return x;
	     }
	     public float getY(){
	         return y;
	     }
	     public void setX(float x){
	         this.x = x;
	     }
	     public void setY(float y){
	         this.y = y;
	     }
	     public float distance(){
	         return (float)Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
	     }
	     //below code is overloading distance method.
	     public float distance(Point point){
	         return (float)Math.sqrt(Math.pow(point.getX()-this.x,2)+Math.pow(point.getY()-this.y,2));
	     }
	     public void translate(float dx, float dy){
	         this.x = this.x+dx;
	         this.y = this.y+dy;
	     }
	     public Point barycenter(Point[] points) {
	    	 int x = points.length;
	    	 float zx = 0 , zy = 0;
	    	 for(int j = 0 ; j < x ; j ++) {
	    		 zx+= points[j].x;
	    		 zy+= points[j].y;
	    	 }
	    	 return new Point(zx,zy);
	     }
	}
	public static class Segment {
	    private Point p1;
	    private Point p2;
	    public Segment(Point p1, Point p2){
	        this.p1 = p1;
	        this.p2 = p2;
	    }
	    public void setP1(Point p1) {
	    	this.p1 = p1;
	    }
	    public void setP2(Point p2) {
	    	this.p2 = p2;
	    }
	    public Point getP1(){
	        return p1;
	    }
	    public Point getP2(){
	    	return p2;
	    }
	    public float length(){
	    	return p1.distance(p2);
	    }
	}
    public static void main(String[] args) {
        Point p1 = new Point(3f,4f);
        Point p2 = new Point(18f,24f);
        Point[] points = new Point[3];
    	points[0] = new Point(2f,2f);
    	points[1] = new Point(4f,6f);
    	points[2] = new Point(1.1f,2.2f);
        Segment seg = new Segment(p1,p2);
        System.out.println("The x of p1 is: "+p1.getX());
        System.out.println("The y of p1 is: "+p1.getY());
        System.out.println("Distance from origin to p1 is : "+p1.distance());
        System.out.println("Distance from p2 to p1 is: "+p1.distance(p2));
        System.out.println("The x coordinate of barycenter of points is : "+points[0].barycenter(points).getX());
        System.out.println("The y coordinate of barycenter of points is : "+points[0].barycenter(points).getY());
        p1.translate(1, 2);
        System.out.println("After translating x of p1, x is now: "+p1.getX());
        System.out.println("After translating y of p1, y is now: "+p1.getY());
        p1.translate(-1, -2);
        System.out.println("Length of segment of p1 and p2 is: "+seg.length());
    }
}
