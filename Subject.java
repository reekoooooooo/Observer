package Observer;

public interface Subject {
	public void registerObserver(Observer observer); void
	public void removeObserver(Observer observer); void
	public void notifyObservers(Cry cry); void
}