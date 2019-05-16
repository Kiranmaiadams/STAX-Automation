package Interfaces;

public interface HomePage {

	public String SelectSortOption(String SortOption) throws InterruptedException;
	
	public void VerifySortResults(String SortOption);
	
	public void VerifySortResultsPerDay(String SortOption);
	
	public void VerifyDefaultResultsCountInHomePage();
	
	public void VerifyViewMoreButton() throws InterruptedException;
	
	public void VerifyViewMoreResults();
	
	public void ClickReset();
	
	public void userSearchesonAutoSearch(String SearchString);
	
	public void userSearchesCountryFromAutoSearch(String Country);
}
