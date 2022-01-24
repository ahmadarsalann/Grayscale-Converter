# Grayscale-Converter
The Program converts images from full color into greyscale.

The program idea belongs to my professor Ian Finlayson.

The PPM Image Format
Most image file formats write the image data in binary, and utilize compression in order to keep the file sizes small. Unfortunately, this makes reading them in quite difficult. In contrast, the PPM image format is textual and quite simple and easy to work with.

A PPM image file contains the following:

A line containing “P3”. This is a marker that identifies the file as being a PPM image.
A line contains two integers, separated by a space. These are the width and the height of the image. You can assume that the width and height will both be 500.
A line with one integer, the maximum color value for the image. This should be the value 255.
The rest of the file is composed of 3×W×H values which give the color data of the image. There is one set of three values for each pixel - each is an integer between 0 and 255. The first of these is the red component, the second is the green, and the third is the blue. Together these three values represent the color value for one pixel. The color values will be separated by whitespace.

Greyscale Conversion
To convert an image to greyscale, you can simply average the red, green and blue values for a given pixel, then write that value over the red, green and blue values.

For example, if a pixel has a red value of 250, a green value of 100, and a blue value of 10, it will be a bright orange color. If we wish to convert the color to greyscale, we average 250, 100 and 10 which gives us 120. If we set the red, green and blue values all to 120, we get a grey color roughly as bright as the orange.

If we apply this process to each of the pixels in the image, it will be greyscale.

Program Details
The program should take the input file name as a program parameter (i.e. do not read it in with a Scanner).
You will need to load a PPM image file into a 2D array. If the file is not found, print an error message and exit.
You should create a class to represent a single pixel. It should include the red, green and blue color components as member data.
You should store the image as a 2D array of these pixel objects.
You will then need to write code to apply the greyscale conversion to the 2D array of color objects.
You will then need to write the data back to a file named “greyscale.ppm”. You must make sure that you follow the PPM image format exactly when writing the file so it can be viewed correctly!
