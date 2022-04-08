class Association{
	String eng;
	String esp;
	String fr;

	public Association(String eng, String fr, String esp){
		this.eng = eng;
		this.fr = fr;
		this.esp = esp;
	}

	int compareTo(Association a){
		return eng.compareTo(a.getEng());
	}

	String getEng(){
		return eng;
	}

	String get(){
		return esp;
	}

	String getFr(){
		return fr;
	}

	boolean equals(Association a){
		if(eng.equals(a.getEng())){
			if(fr.equals(a.getFr())){
				if(esp.equals(a.get())){
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString(){
		return eng + ", " + fr + ": " + esp + ".";
	}
}