
public class Tour{
	Node first = new Node();
	
	
	public Tour() {
	    first = new Node();
		first = null;
		// TODO Auto-generated constructor stub
	}
	public Tour(Point a, Point b, Point c, Point d){
	     Node n1 = new Node();
	     Node n2 = new Node();
	     Node n3 = new Node();
	     	     
	     first.p = a;
	     first.next = n1;
	     n1.p = b;
	     n1.next = n2;
	     n2.p = c;
	     n2.next = n3;
	     n3.p = d;
	     n3.next = first;
	    
		
	}
	
	 
		 void show() {
			Node aux = first;
			do{
				System.out.println(aux.p.toString());
				aux = aux.next;
			}while(aux != first);    
		}
		void draw() {
			// TODO Auto-generated method stub
			Node aux = first;
			if(first==null){
				return;
			}else{
				do{
					aux.p.drawTo(aux.next.p);
					aux = aux.next;
				}while(aux != first);
			}
			

		}
		///////////////////////
		public int size(){
			int d;
			Node aux = new Node();
			aux = first;
			if(first==null){
			return 0;
			
			}else{
				for(d=1;aux.next!=first;aux = aux.next){
					d = d + 1;
				}
			}
			return d;
		}
		///////////////////////
		public double distance(){
			 Node aux;
			 aux = first;
			 double d=0;
			 
			 if(first == null){				 
				 return d;
			 }else{			 
			 do{
				 d += aux.p.distanceTo(aux.next.p);;
				 aux = aux.next;
			 }while(aux != first);
			 return d;
			 }
		}
		/////////////////////
		void insertNearest(Point p){
			 Node aux = new Node();
			 aux = first;			
			 Node nearest = new Node();
			 nearest = null;
			 Node novo = new Node();
			 novo.p = p;
			 			 
			 if(first==null){				 
				 first = novo;
				 novo.next = first;
				 return;
			 }			 			
			 double dist= Double.POSITIVE_INFINITY;			 			 
			 do{		 
				 if((novo.p.distanceTo(aux.p))<dist){					 
				 dist = novo.p.distanceTo(aux.p);
				 nearest = aux;
				 }
				 aux = aux.next;
		}while(aux!=first);
		  novo.next = nearest.next;
		 nearest.next = novo;	
			 }
		 
		 ///////////////////////
		 void insertSmallest(Point p){
			 Node aux = new Node();
			 Node a = new Node();
			 aux = first;
			 a = first;
			 Node novo = new Node();
			 novo.p = p;	
			 double distAnt,distNova,total,menor;
			 menor = Double.POSITIVE_INFINITY;
			 total = this.distance();
			 			 
			 
			 if(first==null){
				 first = novo;
				 first.next = first;
				 return;
			 }
			 if(first.next==first){
				 novo.next = first.next;
				 first.next = novo;
				 return;
			 }
			 distNova = first.p.distanceTo(p) + p.distanceTo(first.next.p);
			 distAnt = first.p.distanceTo(first.next.p);
			 menor = total - distAnt + distNova;
			 aux = aux.next; 
			 do{				 
				 distNova = aux.p.distanceTo(p) + p.distanceTo(aux.next.p);
				 distAnt = aux.p.distanceTo(aux.next.p);				 
				 if(total - distAnt + distNova <= menor){
					 a = aux;
					 menor = total - distAnt + distNova;
				 }						 
				 aux = aux.next;				
			 }while(aux!=first);
			
			novo.next = a.next;
			a.next = novo;
		 }
		 ///////////////////////
		 void insertInOrder(Point p){
			 
			 Node novo = new Node();			 
			 novo.p = p;
			 if(first==null){
				 first = novo;
				 first.next = first;
			 }else{
				 Node aux = first;
				 do{
					 aux = aux.next;
				 }while(aux.next!=first);
				 	 
				 aux.next = novo;
				 novo.next = first;
			 }
		 }
		 ///////////////////////
	/**
	 * @param args
	 */
                 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setXscale(0, 600);
		StdDraw.setYscale(0, 600);
		
		 Point a = new Point(100.0, 100.0);
		 Point b = new Point(500.0, 100.0);
		 Point c = new Point(500.0, 500.0);
		 Point d = new Point(100.0, 500.0);
		 
		 Tour squareTour = new Tour(a, b, c, d);
		 squareTour.show();
		 System.out.println(squareTour.distance());		 
		 squareTour.draw();
		 
	}
        
	
}
