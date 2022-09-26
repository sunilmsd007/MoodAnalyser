public class AnalyseMood {

        String message;
             //Parameterized constructor
        AnalyseMood(String message){
                this.message=message;
          }

	//method to analyse mood by reading string
	public String moodAnalyser() {
		if (message.contains("Happy")) {
			return "Happy";
		}
                else if (message.contains("Sad")) {
			return "Sad";
		}
                else if(message.contains("any")) {
                        return "Happy";
                else {
			return null;
		}
	}
}
