package referanslar;

public class ders101 {
		private String color;
		private String name;
		private int door;
		private int model;
		
		public ders101() {
			/*this.name="bilgi yok";
			this.color="bilgi yok";
			this.door=0;
			this.model=0;*/
			this("bilgi yok","bilgi yok",0,0);
		}
		public ders101(String name,String color) {
			this(color,name,0,0);
			
		}
		
		public ders101(String color,String name,int door,int model){
			this.color=color;
			this.name=name;
			this.door=door;
			this.model=model;
		}
	
	
	public void showInfos() {
		System.out.println("arabanın rengi:"+ this.color);
		System.out.println("arabanın adı:"+ this.name);
		System.out.println("arabanın kapı sayısı:"+ this.door);
		System.out.println("arabanın modeli:"+ this.model);
		System.out.println("\n");
	}
	

}