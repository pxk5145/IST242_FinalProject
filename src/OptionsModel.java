
public class OptionsModel {
    String userName;
    int difficultyOP;
    
    OptionsModel()
    {
        
    }
    
    public void setPlayerName(String Name)
    {
        this.userName = userName;
    }
    
    public void setDifficulty(int num)
    {
        this.difficultyOP = difficultyOP;
    }
    
    public String grabPlayerName()
    {
        return this.userName;
    }
    
    public int grabDifficulty()
    {
        return this.difficultyOP;
    }
}
