package pw2;

public class Exercise2 {
	public static class Node {
		private String name;
		private Node left, right;
		Node(String name){
			this.name = name;
			right = left = null;
		}
		public String toString() {
			return "("+name+")";
		}
		public void addChild(Node n) {
			if(this.left==null) {
				this.left = n;
			}else {
				this.right = n;
			}
		}
		public void printDescendant(Node n) {
			if(n!=null) {
				System.out.print(n.toString());
			}else {
				return;
			}
			printDescendant(n.left);
			printDescendant(n.right);
		}
	}
	
	Node root;
	Exercise2(String name){
		root = new Node(name);
	}
	
	public static void main(String[] args) {
		Exercise2 tree = new Exercise2("A");
		Node bb = new Node("X");
		Node cc= new Node("Y");
		Node dd = new Node("Z");
		Node ee = new Node("K");
		Node ff = new Node("L");
		tree.root.addChild(bb);
		tree.root.addChild(cc);
		bb.addChild(dd);
		bb.addChild(ee);
		cc.addChild(ff);
		System.out.print("For the X root and his childred: ");
		tree.root.printDescendant(bb);
		System.out.print("\nFor the A root and all his children: ");
		tree.root.printDescendant(tree.root);
		System.out.print("\nFor the Y root and all his children: ");
		tree.root.printDescendant(cc);
	}

}
