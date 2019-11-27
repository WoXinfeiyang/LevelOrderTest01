import java.util.LinkedList;


public class LevelOrderTest01 {
	
	public static void levelOrder01(BTNode header){
		if(header!=null){
			LinkedList<BTNode> linkedList=new LinkedList<BTNode>();
			linkedList.offer(header);
			BTNode node;
			while(!linkedList.isEmpty()){
				node=linkedList.poll();
				System.out.println(node.data+"");
				if(node.left!=null){
					linkedList.offer(node.left);
				}
				if(node.right!=null){
					linkedList.offer(node.right);
				}
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BTNode node2=new BTNode(2,null,null);
		BTNode node3=new BTNode(3,null,null);
		BTNode node1=new BTNode(1,node2,node3);
		
		levelOrder01(node1);
	}

}
