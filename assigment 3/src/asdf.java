
/*
		 * Start
		    String password = "pass";
		    String AccName = "jacob";
			int errorC = 0;
			String tempName = null;
			String tempPass = null;
			
			PROMPT for account type
			PROMPT for account name
			READ account name
			WHILE account name doesn't equal input name
				INCREMENT errorC
				DISPLAY invalid username
				PROMPT for account name
				READ account name
				IF errorC equals 3
					THEN tempName equals AccName
					
			IF errorC is greater than or equal to 3
				THEN DISPLAY contact administrator
			ELSE
				PROMPT user to enter password
				READ temporary password
				WHILE temporary password does not equal password
					INCREMENT errorC
					PROMPT user for password
					READ temporary password
					IF errorC is equals 3 
						THEN password equals tempPass
						
			IF errorC is greater than or equal to 3
				THEN DISPLAY please contact administrator
			ELSE
				IF input equals student
					THEN DISPLAY"Welcome Student you can only read files
				ELSE
					IF input equals admin
						THEN DISPLAY Welcome Administrator you can update and read files
					ELSE
						DISPLAY Welcome Staff you can update, read, add, and delete files
						
		 
		 */



import java.util.Scanner;
import javax.swing.JOptionPane;
public class asdf {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		
		String password = "pass";
		String AccName = "jacob";
		int errorC = 0;
		String tempName = null;
		String tempPass = null;
		
		String[] choices = { "Admin", "Student", "Staff"};
		String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
		System.out.println(input);
		
			JOptionPane.showMessageDialog ( null, "Please enter account name" );
		
			tempName = keyboard.nextLine();

	
			while(!AccName.equals(tempName))
			{	
				errorC++;
				JOptionPane.showMessageDialog ( null, "Invalid Username" );
				JOptionPane.showMessageDialog ( null, "Please enter account name" );
				tempName = keyboard.nextLine();
				if(errorC == 3)
					tempName = AccName;
			}
			
	
				

			
			if(errorC >= 3)
				JOptionPane.showMessageDialog ( null, "Contact Administrator" ); 
			else
				
				JOptionPane.showMessageDialog ( null, "Please enter password: " ); 
				tempPass = keyboard.nextLine();
		
				while(!password.equals(tempPass))
				{
					errorC++;
					JOptionPane.showMessageDialog ( null, "Please enter password: " ); 
					tempPass = keyboard.nextLine();
					if(errorC == 3)
				
						password = tempPass;
			}
			
			if(errorC >= 3)
				JOptionPane.showMessageDialog ( null, "Contact Administrator" ); 
			else
				if(input == "Student")
					JOptionPane.showMessageDialog ( null, "Welcome Student " + AccName + " you can only read files");
				else
					if(input == "Admin")
						JOptionPane.showMessageDialog ( null, "Welcome Administrator " + AccName +" you can update and read files" );
					else
						JOptionPane.showMessageDialog ( null, "Welcome Staff " + AccName + " you can update, read, add, and delete files." );
						


}






	}

