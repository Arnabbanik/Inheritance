
public class Volume extends Area{
  
	public int height;
	
	public Volume(int height,int length, int breath) {
		super(length, breath);
		// TODO Auto-generated constructor stub
		this.height = height;
	}

	public void vresult() {
		int ar = super.Resultarea();
		int vr = ar * height;
		System.out.println("volume: "+ vr+" area: "+ar);
	}
    

 
}
