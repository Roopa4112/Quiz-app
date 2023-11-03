package quiz.application;


import javax.swing.*;

import java.awt.*;

import java.awt.event.*;


public class Quiz extends JFrame implements ActionListener {
    
  
  String questions[][] = new String[15][5];
    
String answers[][] = new String[15][5];
   
 String useranswers[][] = new String[15][5];
   
 JLabel qno, question;
    
JRadioButton opt1, opt2, opt3, opt4;
 
   ButtonGroup groupoptions;
   
 JButton next, submit, lifeline;
 
   
    public static int timer = 15;
 
   public static int ans_given = 0;
  
  public static int count = 0;
 
   public static int score = 0;
  
  
    String name;
    
 
   Quiz(String name) {
    
    this.name = name;
       
 setBounds(50, 0, 1150, 750);
  
      getContentPane().setBackground(Color.WHITE);
   
     setLayout(null);
        
       
 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz1.jpg"));
      
  JLabel image = new JLabel(i1);
      
  image.setBounds(0, 0, 1440, 396);
     
   add(image);
        
  
      qno = new JLabel();
  
      qno.setBounds(100, 450, 50, 30);
    
    qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
    
    add(qno);
        
      
 question = new JLabel();
  
      question.setBounds(150, 450, 900, 30);
 
       question.setFont(new Font("Tahoma", Font.PLAIN, 24));
  
      add(question);
        
     
      questions[0][0] = "Who is the president of India.?";
      questions[0][1] = "Dropadi Murmu";
      questions[0][2] = "Adul Khan";  
      questions[0][3] = "Shiva Kumar";    
      questions[0][4] = "John Patel";

     questions[1][0] = "Which is considered as oldest civilization of the world?";
     questions[1][1] = "Mesopotamian Civilization";
     questions[1][2] = "Harappan Civilization";    
     questions[1][3] = "Chinese Civilization";    
     questions[1][4] = "Egyptian Civilization";
    
     questions[2][0] = "Which place is said to be the cathedral city of India?";      
     questions[2][1] = "Banaras";   
     questions[2][2] = "Kancheepuram";
     questions[2][3] = "Madurai";  
     questions[2][4] = "Bhubaneswar";
       
     questions[3][0] = "Who is known as the ' Saint of the gutters '?";    
     questions[3][1] = "B.R.Ambedkar";      
     questions[3][2] = "Mother Teresa";
     questions[3][3] = "Mahatma Gandhi";
     questions[3][4] = "Baba Amte";
         
        
      questions[4][0] = "Which place is said to be the cathedral city of India?";     	
       questions[4][1] = "Banaras";         
       questions[4][2] = "Kancheepuram";
       questions[4][3] = "Madurai";        
       questions[4][4] = "Bhubaneswar";

       
      questions[5][0] = " If a book costs $12.50 and its price is increased by 20%, what is the new price? ";
      questions[5][1] = " $14.50";    
      questions[5][2] = "$15.00";   
      questions[5][3] = "$15.50";   
      questions[5][4] = "$16.00";

      questions[6][0] = "If 4 workers can complete a project in 10 days, how many workers are needed to complete the project in 5 days?";     
      questions[6][1] = "2 workers";   
      questions[6][2] = "4 workers";     
      questions[6][3] = "6 workers";      
      questions[6][4] = "8 workers";

      questions[7][0] = "If a car travels 240 miles in 4 hours, what is its average speed in miles per hour?";    
      questions[7][1] = "40 mph";
      questions[7][2] = "50 mph";    
      questions[7][3] = "60 mph";
      questions[7][4] = "70 mph";
        
      questions[8][0] = " If the sum of two consecutive integers is 49, what are the integers? ";        
      questions[8][1] = "23 and 24";         
      questions[8][2] = " 24 and 25";
      questions[8][3] = " 25 and 26";         
      questions[8][4] = "26 and 27";
                      
      questions[9][0] = "If the ratio of boys to girls in a class is 3:5 and there are 24 girls, how many boys are there? ";           
      questions[9][1] = "12 boys";            
      questions[9][2] = "15 boys";
      questions[9][3] = "18 boys";            
      questions[9][4] = "20 boys";
                                          
              
      questions[10][0] = "11.What is the return type of the main() method in Java?";
      questions[10][1] = "int";               
      questions[10][2] = " Object";
      questions[10][3] = "void";               
      questions[10][4] = "String";
       
      questions[11][0] = "Which keyword is used for accessing the features of a package?";    
      questions[11][1] = "import";
      questions[11][2] = "package"; 
      questions[11][3] = "extends";
      questions[11][4] = "export";

      questions[12][0] = "What is the difference between method overloading and method overriding in Java?";      
      questions[12][1] = "Method overloading occurs within the same class, while method overriding occurs between different classes.";     
      questions[12][2] = "Method overloading involves creating multiple methods with the same name but different parameters, while method overriding involves providing a different implementation for an inherited method.";       
      questions[12][3] = "Method overloading is a compile-time polymorphism concept, while method overriding is a runtime polymorphism concept. ";     
      questions[12][4] = "All of the above";
     
      questions[13][0] = "What is the purpose of the \"final\" keyword in Java? ";     
      questions[13][1] = "To prevent the inheritance of a class ";     
      questions[13][2] = "To prevent overriding of a method ";     
      questions[13][3] = "To prevent modification of a variable's value";     
      questions[13][4] = "All of the above";     

      questions[14][0] = "What is the difference between a class and an object in Java?";  
      questions[14][1] = "A class is a blueprint for creating objects, while an object is an instance of a class.";      
      questions[14][2] = "A class is a single entity, while an object is a collection of entities.";  
      questions[14][3] = "A class contains data and methods, while an object only contains data."; 
      questions[14][4] = "A class cannot be instantiated, while an object can be created and used.";
  



  

      
    answers[0][1] = "Dropadi Murmu"; 
   answers[1][1] = "Mesopotamian Civilization";  
   answers[2][4] = "Bhubaneswar";
   answers[3][4] = "Mother Teresa";
   answers[4][4] = "Bhubaneswar";
   
   
     answers[5][2] = "$15.00";   
     answers[6][3] = "6 workers";
     answers[7][2] = "50 mph"; 
     answers[8][2] = "24 and 25";
     answers[9][1] = "12 boys";
     
     answers[10][3] = "void";
     answers[11][1] = "import";
     answers[12][4] = "All of the above";
     answers[13][4] = "All of the above";
     answers[14][1] = "A class is a blueprint for creating objects, while an object is an instance of a class.";
 
     
    

    opt1 = new JRadioButton();
       
 opt1.setBounds(170, 520, 700, 30);
       
 opt1.setBackground(Color.WHITE);
       
 opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
   
     add(opt1);
        
 
       
opt2 = new JRadioButton();

        opt2.setBounds(170, 560, 700, 30);
     
   opt2.setBackground(Color.WHITE);
     
   opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
    
    add(opt2);
 
       
     
   opt3 = new JRadioButton();
   
     opt3.setBounds(170, 600, 700, 30);
   
     opt3.setBackground(Color.WHITE);
    
    opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
     
   add(opt3);
        
       

 opt4 = new JRadioButton();
    
    opt4.setBounds(170, 640, 700, 30);
     
   opt4.setBackground(Color.WHITE);
  
      opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
     
   add(opt4);
        
       

 groupoptions = new ButtonGroup();
      
  groupoptions.add(opt1);
       
 groupoptions.add(opt2);
     
   groupoptions.add(opt3);
        
groupoptions.add(opt4);
        
       
 next = new JButton("Next");
        
next.setBounds(1100, 550, 200, 40);
       
 next.setFont(new Font("Tahoma", Font.PLAIN, 22));
    
    next.setBackground(new Color(30, 144, 255));
     
   next.setForeground(Color.WHITE);
       
 next.addActionListener(this);
       
 add(next);
 /*
 back = new JButton(" back");
 
 back.setBounds(1100, 590, 200, 40);
       
 back.setFont(new Font("Tahoma", Font.PLAIN, 22));
    
 back.setBackground(new Color(30, 144, 255));
     
 back.setForeground(Color.WHITE);
       
 back.addActionListener(this);
       
 add( back);*/
    
    
        lifeline = new JButton("50-50 Lifeline");
     
   lifeline.setBounds(1100, 610, 200, 40);
       
 lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
   
     lifeline.setBackground(new Color(30, 144, 255));
       
 lifeline.setForeground(Color.WHITE);
       
 lifeline.addActionListener(this);
     
   add(lifeline);
        
       
 submit = new JButton("Submit");
    
    submit.setBounds(1100, 670, 200, 40);
 
       submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
 
       submit.setBackground(new Color(30, 144, 255));
       
 submit.setForeground(Color.WHITE);
      
  submit.addActionListener(this);
       
 submit.setEnabled(false);
    
    add(submit);
   
     
        start(count);
        
    
    setVisible(true);
    }
    
 
   public void actionPerformed(ActionEvent ae) {
       
 if (ae.getSource() == next  ) {
        
    repaint();
            
opt1.setEnabled(true);
            
opt2.setEnabled(true);
            
opt3.setEnabled(true);
         
   opt4.setEnabled(true);
         
   
            ans_given = 1;
        
    if (groupoptions.getSelection() == null) {
           
    useranswers[count][0] = "";
            
} 
else {
          
      useranswers[count][0] = groupoptions.getSelection().getActionCommand();
           
 }
            
           
 if (count == 13) {
            
    next.setEnabled(false);
    //back.setEnabled(false);
                
submit.setEnabled(true);
            }
      
      
            count++;
        
    start(count);
        } 
 
 /* else if (ae.getSource() == back  ) {
     
 repaint();
         
opt1.setEnabled(true);
         
opt2.setEnabled(true);
         
opt3.setEnabled(true);
      
opt4.setEnabled(true);
      

         ans_given = 1;
     
 if (groupoptions.getSelection() == null) {
        
 useranswers[count][0] = "";
         
} 
else {
       
   useranswers[count][0] = groupoptions.getSelection().getActionCommand();
        
}
         
        
if (count == 0) {
         
 next.setEnabled(true);
 back.setEnabled(true);
             
submit.setEnabled(false);
         }
   
   
         count--;
     
 start(count);
     } 
 
 */
else if (ae.getSource() == lifeline) {
      
      if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9  || count== 11 || count==13) {
                
opt2.setEnabled(false);
             
   opt3.setEnabled(false);
            } 
else {
                opt1.setEnabled(false);
             
   opt4.setEnabled(false);
            }
            
lifeline.setEnabled(false);
        } 
else if (ae.getSource() == submit) {
           
 ans_given = 1;
            if (groupoptions.getSelection() == null) {
                
useranswers[count][0] = "";
            }
 else {
               
 useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

     
       for (int i = 0; i < useranswers.length; i++) {
              
  if (useranswers[i][0].equals(answers[i][1])) {
                  
  score += 10;
                } else {
                    score += 0;
                }
            }
         
   setVisible(false);
           
 new Score(name, score);
        }
    }
    
   
 public void paint(Graphics g) {
    
    super.paint(g);
        
       
 String time = "Time left - " + timer + " seconds"; // 15
       
 g.setColor(Color.RED);
    
    g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
 
       if (timer > 0) { 
         
   g.drawString(time, 1100, 500);
        } 
else {
            g.drawString("Times up!!", 1100, 500);
        }
        
     
   timer--; // 14
        
       
 try {
            
Thread.sleep(1000);
          
  repaint();
        }
 catch (Exception e) {
           
 e.printStackTrace();
        }
        
        
if (ans_given == 1) {
            
ans_given = 0;
           
 timer = 15;
        } 
else if (timer < 0) {
          
  timer = 15;
            
opt1.setEnabled(true);
            
opt2.setEnabled(true);
           
 opt3.setEnabled(true);
            
opt4.setEnabled(true);
            
          
  if (count == 13) {
               
 next.setEnabled(false);
                
submit.setEnabled(true);
            }
           
 if (count == 14) { // submit button
              

  if (groupoptions.getSelection() == null) {
              
     useranswers[count][0] = "";
                } 
else {
                   
 useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
              
  for (int i = 0; i < useranswers.length; i++) {
               
     if (useranswers[i][0].equals(answers[i][5])) {
                       
 score += 10;
                    }
 else {
                       
 score += 0;
                    }
                }
             
   setVisible(false);
          
      new Score(name, score);
            } 
else { // next button
               
 if (groupoptions.getSelection() == null) {
                  
 useranswers[count][0] = "";
                } 
else {
                  
  useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
  
  public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
     
   question.setText(questions[count][0]);
       
 opt1.setText(questions[count][1]);
   
     opt1.setActionCommand(questions[count][1]);
        
      
  opt2.setText(questions[count][2]);
        
opt2.setActionCommand(questions[count][2]);
        
      
  opt3.setText(questions[count][3]);
      
  opt3.setActionCommand(questions[count][3]);
        
   
     opt4.setText(questions[count][4]);
       
 opt4.setActionCommand(questions[count][4]);
        

        groupoptions.clearSelection();
    }
    
   
 public static void main(String[] args) {
       
 new Quiz("User");
    }
}
