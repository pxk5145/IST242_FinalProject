

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavController {
    
    NavModel n_model;
    NavView n_view;
    
    //Instance Variables for Options Model, View, and Controller
    OptionsModel o_model;
    OptionsView o_view;
    OptionsController o_Controller;  
           
    // TODO: Create instances of your MainModel and MainController once you implement them
    MainView m_view;
    
    InstructionsView i_view;
    
    CreditsView c_view;
    
    public NavController(NavModel n_model, NavView n_view ) {
        this.n_model = n_model;
        this.n_view = n_view;
        
        o_model = new OptionsModel();        
        o_view = new OptionsView(o_model);
        o_Controller = new OptionsController(o_model, o_view); 
        
        m_view = new MainView(o_model);
        
        i_view = new InstructionsView();
        
        c_view = new CreditsView();
                
        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());
        n_view.addInstructionsButtonListener(new InstructionsButtonListener());
        n_view.addCreditsButtonListener(new CreditsButtonListner());
    }
    class OptionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            n_view.switchToOptionsPanel(o_view);
        }
    }     
 
    class MainButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass a Main View object to our Navigation View
            n_view.switchToMainPanel(m_view);
            m_view.setPlayerText(o_view.getPlayerName());
            m_view.setDiff(o_view.getDifficulty());
        }
    }
    
    class InstructionsButtonListener implements ActionListener {
        public void actionPerformed (ActionEvent e)
        {
            n_view.switchToInstructionsPanel(i_view);
        }
    }
    
    class CreditsButtonListner implements ActionListener {
        public void actionPerformed (ActionEvent e)
        {
            n_view.switchToCreditsPanel(c_view);
        }
    }
    
    //TODO: Add listeners on buttons to switch to other Panels
    
}
