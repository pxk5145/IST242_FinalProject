
import java.awt.event.*;
import javax.swing.JButton;

public class OptionsController {
    OptionsModel o_model;
    OptionsView o_view;
    OptionsController(OptionsModel o_model, OptionsView o_view)
    {
        this.o_model = o_model;
        this.o_view = o_view;
        
        class ButtonListener implements ActionListener {
            public void actionPerformed (ActionEvent e)
            {
                JButton clickSource = (JButton) e.getSource();
                if (clickSource == o_view.getretButton())
                {
                    o_model.setPlayerName(o_view.getPlayerName());
                    o_model.setDifficulty(o_view.getDifficulty());
                }
            }
        }
        
        o_view.addButtonListener(new ButtonListener());
    }
    
}
