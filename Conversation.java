import java.util.*;

class Conversation {
  // static final List<String> unchanged_terms = new ArrayList<>(Arrays.asList("okay", "interesting","Hm....","crazy", "cool")
  // );
 

// You will start the conversation here.
  public static void main(String[] arguments) {
    // add "static" in front of String[] but for some reason it does not like the variable name of the list
    String[] unchanged_terms = {"okay", "interesting", "Hm....", "crazy", "cool"};
    
    List<String> convo_transcript = new ArrayList<>();
    int rounds;
    Scanner userInput = new Scanner(System.in);
    System.out.print("How many rounds? ");
    rounds = userInput.nextInt();
    convo_transcript.add("Hi there! What's on your mind? ");
    System.out.println("Hi there! What's on your mind?");

    for (int i = 0; i < rounds; i+=1){
      Scanner userPhrase = new Scanner(System.in);
      String userInput1 = userPhrase.nextLine();
      String[] mirror_words = {"I", "me", "am", "you", "my", "your", "are", "You"};
      String[] split_words = userInput1.split(" ");
      // System.out.println(Arrays.toString(split_words)); shows the words in a split up string list.
  
      for (String word : split_words) {
        int index = Arrays.asList(split_words).indexOf(word);
        if (word.equals(mirror_words[0])) {
          split_words[index] = "you";

        }
        
        if (word.equals(mirror_words[1])){
          split_words[index] = "you";
        }
        if (word.equals(mirror_words[2])){
          split_words[index] = "are";
        }
        if (word.equals(mirror_words[3])){
          split_words[index] = "I";
        }
        if (word.equals(mirror_words[4])){
          split_words[index] = "your";
        }
        if (word.equals(mirror_words[5])){
          split_words[index] = "my";
        }
        if (word.equals(mirror_words[6])){
          split_words[index] = "am";
        }
        if (word.equals(mirror_words[7])){
          split_words[index] = "I";
        }
      
      }
        String new_sent = String.join(" ", split_words);
        // convo_transcript.add(new_sent);
      if (!userInput1.equals(new_sent)){
        convo_transcript.add(userInput1);
        convo_transcript.add(new_sent);
        System.out.println(new_sent);
      }

      if (userInput1.equals(new_sent)){
        Random random = new Random();
        int index1 = random.nextInt(unchanged_terms.length);
        convo_transcript.add(userInput1);
        convo_transcript.add(unchanged_terms[index1]);
        System.out.println(unchanged_terms[index1]);
      }
      
    }
    convo_transcript.add("See ya!");
    System.out.println("See ya! \n");
    System.out.println("TRANSCRIPT:");
    // transcript_final = convo_transcript
    for (int in=0; in < convo_transcript.size(); in++ ) {
      System.out.println(convo_transcript.get(in));
    }
      
    
      
  }
}
