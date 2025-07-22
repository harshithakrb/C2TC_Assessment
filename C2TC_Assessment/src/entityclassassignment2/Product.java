package entityclassassignment2;

public class Product {

		int id;
		String name;
		int cost;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", cost=" + cost + "]";
		}
	
		
		

	}
	