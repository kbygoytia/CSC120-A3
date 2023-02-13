import java.util.*;

// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;

class Conversation {

// You will start the conversation here.
  public static void main(String[] arguments) {
    String[] unchanged_terms = {"okay", "interesting", "Hm....", "crazy", "cool"};

    List<String> convo_transcript = new ArrayList<>();
    // String[] convo_trancript = new ArrayList();
    int rounds;
    Scanner userInput = new Scanner(System.in);
    System.out.print("How many rounds? ");
    rounds = userInput.nextInt();
    convo_transcript.add("Hi there! What's on your mind? ");
    System.out.println("Hi there! What's on your mind?");

    for (int i = 0; i < rounds; i+=1){
      Scanner userPhrase = new Scanner(System.in);
      String userInput1 = userPhrase.nextLine();
      String[] mirror_words = {"I", "am", "you", "are", "my", "You", "My", "Are"};
      String[] split_words = userInput1.split(" ");
      System.out.println(Arrays.toString(split_words));
  
      for (String word : split_words) {
        int index = Arrays.asList(split_words).indexOf(word);
        if (word == mirror_words[0]) {
        
        }
        
      
     
      // split userPhrase
      // for i in userPhrase.length()
      // if i == "I"
      // userPhrase[i]
        else {
          Random random = new Random();
          int index = random.nextInt(unchanged_terms.length);
          convo_transcript.add(userInput1);
          convo_transcript.add(unchanged_terms[index]);
          System.out.println(unchanged_terms[index]);
        }
    }
      convo_transcript.add("See ya!");
      System.out.println("See ya! \n");
      System.out.println("TRANSCRIPT:");
    // transcript_final = convo_transcript
      for (int i=0; i < convo_transcript.size(); i++ ) {
        System.out.println(convo_transcript.get(i));
      }
       //We need to figure out how to make it print not as a list 
      // final_transcript = Arrays.toString(convo_transcript).replace("[","").replace(",","").replace("]","");
      // System.out.print(final_transcript); //We need to figure out how to make it print not as a list 
    
  }
}
