public class AnalyseMood {

        String message;
             //Parameterized constructor
        AnalyseMood(String message){
                this.message=message;
          }

	//method to analyse mood by reading string
	public String moodAnalyser() {
                try{
		if (message.contains("Happy")) {
			return "Happy";
		}
                else if (message.contains("Sad")) {
			return "Sad";
		}
                else if(message.contains("any")) {
                        return "Happy";
		}
                }catch(Exception e){
                 //when user provides null input, handling the exception by returning Happy
                       return "Happy";
                }
                       return message;
	}
	public static void main(String[] args) {
		AnalyseMood obj = new AnalyseMood(null);
                System.out.println(obj.moodAnalyser());
       }
}
