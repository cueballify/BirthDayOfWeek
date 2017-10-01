/* 
 * Copyright (C) 2017 Diego Trujillo <diego.trujillo@alumni.nmt.edu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package birthdayofweek;
import java.util.*;  // scanner
import java.sql.*;  // date
import java.text.*; // format date to day of week

/**
 *
 * @author Diego Trujillo <diego.trujillo@alumni.nmt.edu>
 */
public class BirthDayOfWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //format input dates to friendly day of week
        SimpleDateFormat dayOfWeek = new SimpleDateFormat("EEEE"); 
        
        //Ask the user for input
        System.out.println("Hello. Type your Birthday (YYYY-MM-DD):");
        //get the input
        String input = scanner.next();
        //confirm the input
        System.out.println("you entered: "+input);
        
        //cheat by converting the convienently formatted input to a date
        java.util.Date birthdate = java.sql.Date.valueOf(input);
        
        //output
        System.out.println("you were born on " +dayOfWeek.format(birthdate));
        
    }
    
}
