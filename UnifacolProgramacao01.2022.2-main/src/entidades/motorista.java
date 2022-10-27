package entidades;



public class motorista extends Pessoa(){
	
	public  String tempodechegada;
	public  String estrelas;
	public  String chat;
	public  String gps;
	
	
	
	
	public motorista (String tempodechegada, String estrelas, String chat, String gps) {
		
		
		this.estrelas = estrelas;
		this.chat = chat;
		this.gps = gps;
		this.tempodechegada = tempodechegada;
		
	}
	
	public String getTempodechegada() {
		return tempodechegada;
	}

	public void setTempodechegada(String tempodechegada) {
		this.tempodechegada = tempodechegada;
	}

	public String getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(String estrelas) {
		this.estrelas = estrelas;
	}

	public String getChat() {
		return chat;
	}

	public void setChat(String chat) {
		this.chat = chat;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}


	

}
