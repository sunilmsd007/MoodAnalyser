public class AnalyseMood {

        String message;
             //Parameterized constructor
        AnalyseMood(String message){
                this.message=message;
          }

	//method to analyse mood by reading string
	public String moodAnalyser() throws MoodAnalysisException {
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
                 //when user provides null input, informing the user by returning Invalid mood
                       throw new MoodAnalysisException("Invalid Mood");
                }
                       return message;
	}
	public static void main(String[] args) {
		AnalyseMood obj = new AnalyseMood(null);
                try{
                    System.out.println(obj.moodAnalyser());
                   }catch (Exception p) {
			p.printStackTrace();
                    }
       }
}
