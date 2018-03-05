package CS335;



public interface Subject {
	
	public void subscribeObserver(Observer observer);
	public void unSubscribeObserver(Observer observer);
	public void notifyObservers(String x);
	public String subjectDetails();
}
