import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int red; //variable to store value of red
        int green;//variable to store value of green
        int blue;//variable to store value of blue

        ArrayList<String> ppmidentifier = new ArrayList<String>();//to read the first line of the file
        ArrayList<Integer> size = new ArrayList<Integer>();//to store the size of the image
        ArrayList<Integer> maxcolor = new ArrayList<Integer>();//to store the maxcolor value
        PrintWriter out = null; //initailizes the printwriter as null
        String fileName = "grayscale.ppm";//variable to pass in the name of the output file

        Pixel[][] pixel = new Pixel[500][500];//2d array list to store the remaining elements for manipulation
        try {//start of try and catch
            File file = new File(args[0]);//file reader to read in the file
            Scanner scan = new Scanner(file);//Scanner to go through the file
            String ppm = scan.next();//Gets the identifier for the ppm file
            ppmidentifier.add(ppm);//stores the identifier in an arraylist
            int size2 = scan.nextInt();//Gets the width of the image
            int size3 = scan.nextInt();//Gets the height of the image
            size.add(size2);//stores the width in the size arraylist
            size.add(size3);//stores the height in the size arraylist
            int maxcolorvalue = scan.nextInt();//gets the maxcolor value of the image
            maxcolor.add(maxcolorvalue);//adds the maxcolor value in a arraylist

            int y = 0;//variable to keep track of column
            int x = 0;//variable to keep track of width
            while (scan.hasNextLong()) {//Scans the rest of the file
                Pixel pix = new Pixel();//Makes a new pixel everytime it goes through the while loop
                red = scan.nextInt();//Gets the red pixel value
                pix.setred(red);//sets the red pixel value to the red variable
                green = scan.nextInt();//Gets the green pixel value
                pix.setgreen(green);//sets the green pixel value to the green variable
                blue = scan.nextInt();//Gets the blue pixel value
                pix.setblue(blue);//sets the blue pixel value to blue variable

                pix.makeitgray();//makes the pixel gray

                try {
                    pixel[x][y] = pix;//adds the pixel to the 2d arraylist
                }//end of try
                catch (IndexOutOfBoundsException e) {//if outofbounds catches the exception
                    y = 0;//sets y to zero.
                    x++;//increments the rows by 1
                    pixel[x][y] = pix;// adds the pixel
                }
                y++;//increments the column by one
            }//end of while
            scan.close();//when done with all data of the file it stops scanning


        } catch (FileNotFoundException e) {//if file not found catches the FILENOTFOUND EXCEPTION
            System.out.println("file not found");//prints the message
        }//end of catchc

        try {
            out = new PrintWriter(fileName);//gives the printwriter the file to write as
        } catch(FileNotFoundException e) {
            e.printStackTrace();//prints the message if the paramenter for printwriter cannot be made into a file
        }//end of try and catch

        out.println(ppmidentifier.get(0));//prints out the firstline of the ppm file into a file
        for(int i = 0; i < size.size(); i++){
            out.print(size.get(i) + " ");//prints out the size of the image into a file
        }//end of for
        out.print(maxcolor.get(0));//prints out the max color value in a file

        for (int i = 0; i < 500; i++) {//nested loop to go through the 2d array and print out the data in a file
            for (int j = 0; j < 500; j++) {
                if(j % 18 == 0){
                    out.println("");//begins a new line after column 18
                }
                out.print(pixel[i][j].getgray() + " ");//prints the first pixel in the file
                out.print(pixel[i][j].getgray() + " ");//prints the second pixel in the file
                out.print(pixel[i][j].getgray() + " ");//prints the third pixel in the file

            }//end of for loop


        }//end of for loop


    }//end of main





}//end of main




