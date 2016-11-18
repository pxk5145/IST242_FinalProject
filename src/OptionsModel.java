
public class OptionsModel {
    String playerName;
    int difficulty;
    
    OptionsModel()
    {
        
    }
    
    public void setPlayerName(String Name)
    {
        this.playerName = playerName;
    }
    
    public void setDifficulty(int num)
    {
        this.difficulty = difficulty;
    }
    
    public String grabPlayerName()
    {
        return this.playerName;
    }
    
    public int grabDifficulty()
    {
        return this.difficulty;
    }
}
