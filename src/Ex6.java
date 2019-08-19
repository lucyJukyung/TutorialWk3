import java.util.Scanner;

public class Ex6 {
    public static void main (String[] args){
        //declare length, width, frame type, color, and crown
        double length, width, size;
        int frame, color_num, crown_num;
        //frame type price
        double regular = 0.15, fancy = 0.25, frame_cost;
        //color price
        double color = 0.10, color_cost = 0;
        //crown price
        double crown = 0.35;
        //grand total
        double total = 0;
        //while loop terminator
        boolean done = false;
        String frame_type = "", color_opt = "";

        while(!done){
            //prompt user input for length
            System.out.print("Enter size of length in inch: ");
            Scanner lengthInput = new Scanner(System.in);
            length = lengthInput.nextInt();

            //prompt user input for width
            System.out.print("Enter size of width in inch: ");
            Scanner widthInput = new Scanner(System.in);
            width = widthInput.nextInt();

            //prompt user input for fram type
            System.out.print("Enter type of frame: \n1. Regular Frame $0.15 per inch\n2. Fancy Frame $0.25 per inch\n");
            Scanner frameInput = new Scanner(System.in);
            frame = frameInput.nextInt();

            //prompt user input for color
            System.out.print("Choose color: \n1. None\n2. Add $0.10 per inch\n");
            Scanner colorInput = new Scanner(System.in);
            color_num = colorInput.nextInt();

            //prompt user input for crown
            System.out.print("Enter the number of crown. $0.35 per crown: ");
            Scanner crownInput = new Scanner(System.in);
            crown_num = crownInput.nextInt();

            //calculate size
            size = length * width;

            //summary
            if(length != 0 && width != 0 && frame  != 0 && color != 0){
                //frame cost
                if(frame == 1){
                    frame_cost = regular;
                    frame_type = "Regular";
                }
                else{
                    frame_cost = fancy;
                    frame_type = "Fancy";
                }
                //color cost
                if(color_num == 2){
                    color_cost = color;
                    color_opt = "Yes";
                }
                else {
                    color_opt = "No";
                }
                //crown cost
                if(crown_num > 0){
                    crown = crown_num * crown;
                }

                //calculate total
                total = (size * frame_cost) + (size * color_cost) + crown;

                //print final selection
                System.out.println("Frame Size: " + length + " X " + width + " = " + size);
                System.out.println("Frame Type: " + frame_type);
                System.out.println("Color Option: " + color_opt);
                System.out.println("Crown Option: " + crown_num);
                System.out.println("Grand Total: $" + total);

                //finish while loop
                done = true;
            }
            else{
                System.out.println("Confirm your options!");
            }
        }

    }
}
