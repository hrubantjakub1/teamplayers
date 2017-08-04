package menus;

import com.hello.Coach;
import com.hello.Serviceman;
import com.hello.Sportsman;
import com.hello.TeamPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;
import java.util.Scanner;

import static com.hello.TeamPlayerRepIf.repository;

public class Menu{

    public Menu() {
    }

    @Autowired

    Scanner sc=new Scanner(System.in);


    public void menuBar(){
        System.out.println("1.Add a new teamplayer");
        System.out.println("2.Delete an teamplayer");
        System.out.println("3.Edit an teamplayer");
        System.out.println("4.Show all teamplayer");
        System.out.println("5.Exit");
    }
    public void choose(String firstName, String surname, int age, String gender){
        int ch =0 ,yes =0;
        try{
            while(yes==0){
                System.out.print("Enter your choice:");
                ch = sc.nextInt();
                Menu menu = new Menu();
                switch(ch){
                    case 1:
                        menu.add(firstName, surname, age, gender);
                        break;
                    case 2:
                        menu.delete(surname);
                        break;
                    case 3:
                       menu.delete(surname);
                       this.add(firstName, surname, age, gender);
                        break;
                    case 4:
                        for (Map.Entry<String, TeamPlayer> entry : repository.entrySet()) {
                            System.out.println(entry.getValue());
                        }
                        break;
                    case 5: System.exit(0);

                    default: System.out.println("Invalid choice!");
                }
                System.out.print("Continue? Press 0 to continue:");
                yes=sc.nextInt();
            }
        }catch(Exception e){System.exit(100);}
    }
    public void add(String firstName, String surname, int age, String gender) {
        System.out.println("Enter your teamPlayer:");
        System.out.println("firstName");
        firstName=sc.next();
        System.out.println("surname");
        surname = sc.next();
        System.out.println("age");
        age = sc.nextInt();
        System.out.print("gender");
        gender=sc.next();
        while(true){
            System.out.println("Enter work qualification Sportsman Coach or ServiceMan. Type sp for Sportsman co for Coach se for ServiceMan ");
            String n = sc.next();
            if (n.equals("sp")) {
                repository.put(surname, new Sportsman(firstName, surname, age, gender));
                break;
            }
            else if (n.equals("co")) {
                repository.put(surname, new Coach(firstName, surname, age, gender));
                break;
            }
            else if (n.equals("se")) {
                repository.put(surname, new Serviceman(firstName, surname, age, gender));
                break;
            }
            else System.out.println("Invalid choice!");
            }
        }

    public void delete(String surname){
        System.out.println("Enter surname:");
        surname=sc.next();
        repository.remove(surname);
    }
}
