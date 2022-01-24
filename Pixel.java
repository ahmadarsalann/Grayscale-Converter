

public class Pixel {//Class to create a pixel

    private int red;//to store the red pixel value
    private int blue;//to store the blue pixel value
    private int green;//to store the green pixel value
    private int gray;// to store the gray pixel value

    Pixel(){//constructor
        this.red = 0;//initializes the red value as zero
        this.blue = 0;//initializes the blue value as zero
        this.green = 0;//initializes the green value as zero
        this.gray = 0;//initializes the gray value as zero

    }//end of pixel

    public int getgray(){//gets the gray value
        return gray;
    }//end of getgray

    public void setred(int red){//sets the red color value to the variable
        this.red = red;
    }//set of setred

    public void setblue(int blue){//sets the blue color value to the variable
        this.blue = blue;
    }//end of setblue

    public void setgreen(int green){//sets the green color value to the variable
        this.green = green;
    }//end of setgreen

    public void makeitgray(){//takes all three colors divide it and you get gray
        this.gray = (this.red + this.blue + this.green)/3;
    }//end of makeitgray

}//end of pixel method


