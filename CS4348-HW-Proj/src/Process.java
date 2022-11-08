

public class Process{
	
	//arguments for Process
	private int Atime, Stime, Dtime, Dactivity;
	private String Name;
	
	//Process constructor
	public Process(String name, int stime, int dtime, int dactivity, int atime) {
		super();
		Atime = atime;
		Stime = stime;
		Dtime = dtime;
		Dactivity = dactivity;
		Name = name;
	}
	
	//Override toString method for process
	public String toString() {
		String title = String.format("%10s|%12s|%10s|%14s|%17s%n", "Process", "Arrival Time", "Service Time", "Disk I/O time", "Disk I/O Activity");
		String info = String.format("%10s|%12d|%12d|%14d|%17d%n", this.Name, this.Atime, this.Stime, this.Dtime, this.Dactivity);
		return(title + info);
	}
}