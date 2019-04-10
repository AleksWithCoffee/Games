package olek.com.MavenProject;

public enum Marka {
	BMW("hehe"){
		@Override
		public void giveASound() {
			System.out.println("wrr wrrr");
		}
	}, MERCEDES("lala"){
		@Override
		public void giveASound() {
			System.out.println("wrum wrum");
		}
	}, POLONEZ("didi"){
		
	};
	private String sound;

	private Marka(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}
	public void giveASound() {
		System.out.println("bip bip");
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
}
