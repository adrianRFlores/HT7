class Association{
	String base;
	String esp;

	public Association(String base, String esp){
		this.base = base;
		this.esp = esp;
	}

	int compareTo(Association a){
		return base.compareTo(a.getBase());
	}

	String getBase(){
		return base;
	}

	String get(){
		return esp;
	}

	boolean equals(Association a){
		if(base.equals(a.getBase())){
			return true;
		}
		return false;
	}

	@Override
	public String toString(){
		return "(" + base + ", " + esp + ")";
	}
}