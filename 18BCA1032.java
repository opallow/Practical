/*Practical NO.10*/
import java.awt.*;  
import java.awt.event.*;  
class Test{  
	public static void main(String args[]) 
	{  
		Frame f=new Frame("Color Changer"); 
        		Button change=new Button("Change the Color"); 
        		Choice choice=new Choice();  
        		choice.setBounds(60,50,150,30); 
        		change.setBounds(60,80,150,30);
    
        		choice.setBackground(Color.LIGHT_PINK); 
        		change.setBackground(Color.LIGHT_PINK); 
        
        		choice.add("Green");  
       		choice.add("Red");  
        		choice.add("Blue");  
        		choice.add("Brown");  
        		choice.add("Grey");
        		
		change.addActionListener(new ActionListener() 
	{  
          public void actionPerformed(ActionEvent e) 
	{ 
               	int index = choice.getSelectedIndex();
                	switch(index)
		{
                    case 0:
                        f.setBackground(Color.GREEN);
                        break;
                    case 1:
                        f.setBackground(Color.RED);
                        break;
                    case 2:
                        f.setBackground(Color.BLUE);
                        break;
                    case 3:
                        f.setBackground(Color.BROWN);
                        break;
                    case 4:
                        f.setBackground(Color.GREY);
                        break; 
                }      
            }  
        });
        
        		f.add(choice);
        		f.add(change); 
	    	f.setSize(250,250);  
	    	f.setLayout(null);  
	    	f.setVisible(true);      
	}  
}  
