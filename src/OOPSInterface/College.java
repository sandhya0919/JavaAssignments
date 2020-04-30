package OOPSInterface;

public class College implements Medical, NonMedical, Commerce{
	
	
	@Override
	public void Biology() {
	System.out.println("Biology");
	}

	@Override
	public void Science() {
		
		System.out.println("Science");
		
	}

	@Override
	public void Mathematics() {
	
	System.out.println("Mathematics");	
	
	}

	@Override
	public void Economics() {
		
		System.out.println("Economics");
	}

	
//	NonOverride methods
	
	public void ScienceLab() {
		
		System.out.println("SienceLab");
	}
	
	public void Library() {
		System.out.println("Library");
	}
}
