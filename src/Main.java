import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args)
    {
        double points = Double.parseDouble(JOptionPane.showInputDialog(null, "Antal Poäng:", null));

        if(points < 15 && points > 0)
        {
            JOptionPane.showMessageDialog(null, "Det blir ett F");
        }
        else if((points > 15 || points == 15) && (points < 18))
        {
            JOptionPane.showMessageDialog(null, "Det blir ett E");
        }
        else if((points > 18 || points == 18) && (points < 21))
        {
            JOptionPane.showMessageDialog(null, "Det blir ett D");
        }
        else if((points > 21 || points == 21) && (points < 24))
        {
            JOptionPane.showMessageDialog(null, "Det blir ett C");
        }
        else if((points > 24 || points == 24) && (points < 27))
        {
            JOptionPane.showMessageDialog(null, "Det blir ett B");
        }
        else if((points > 27 || points == 27) && (points < 30 || points == 30))
        {
            JOptionPane.showMessageDialog(null, "Det blir ett A");
        }
        else if(points > 30 || points < 0)
        {
            JOptionPane.showMessageDialog(null, "Är du säker på att du räknat rätt?");
        }
    }
}