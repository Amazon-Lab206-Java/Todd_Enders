import java.util.HashMap;
import java.util.Map;
public class SongListTest{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Have a Cigar", "Come on over here, boy, have a cigar, you're gonna go far...");
        trackList.put("Latch", "Now I've got you in my space...");
        trackList.put("Golden Cage", "You no longer care if it's another day...");
        trackList.put("Zorbing", "Lying in your attic...");
        String song = trackList.get("Latch");
        for (Map.Entry<String, String> entry: trackList.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        } 
        // or
        for (String key : trackList.keySet()){
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}