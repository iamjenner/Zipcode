# Zipcode

    Zipcode.java is a class that can convert a zipcode into a barcode, and conversely, a barcode into its corresponding zipcode.
    This class has 12 instance variables: zip, barcode, and bar0-bar9.
    zip is an integer that represents the zipcode the user wants to convert into a barcode.
    barcode is a String that represents the barcode the user wants to convert into a zipcode.
    bar0-bar9 are all Strings that represent the barcode segments of the digits 0-9.

    This class has two overloaded constructors because they each have different signatures. The first constructor is Zipode(int code)
    and the second constructor is Zipcode(String bar). Depending on whether the user wants to convert a zipocde or a barcode, the System
    will go to the corresponding constructor with the associated arguments.

    The getBar(int x) method returns the corresponding bar segment associated with the number passed through the argument.
    I decided to use a switch/case statement because I am testing the equality of the number against several values specified
    in the cases. It is much cleaner to read than use multiple if/else statements. I use this method as a helper method for 
    executing the getBarcode() method.

    The getCheckDigit() method is also a helper method for the getBarcode() method. This method returns the check digit that will
    make the sum of the digits in the zipcode a multiple of 10. I decided to make this method to make the getBarcode() cleaner. I
    created a new variable named code and assigned it to the value of zip because I was I wanted to modify zip without actually
    changing the value of zip. 
    
    The getBarcode() method is the method that returns a String of the corresponding barcode of zip. I first found the barcode
    for the check digit using the getCheckDigit() method and the getBar() method. I created a new variable named code and assigned
    it to the value of zip because I was I wanted to modify zip without actually changing the value of zip. I set barcode equal to
    this and added the full-height frame bar on the end. I then made a loop to iterate 5 times because there are 5 numbers in a 
    zipcode and in case the zipcode started with multiple zeros. I used mod to look at each number in code, and isolated that number
    in a separate variable called num. I then created a String named temp and assigned it to the String that was returned using
    getBar(num). I then added temp to the begining of barcode, and divided code/10 to get rid of the number I already converted.
    Once every number was converted into its barcode, I added the full-height frame bar to the begining of barcode and returned
    barcode.

    The convertBarToDigit(String bar) method returns a String of the number the bar in the argument represents. I used if/else statements
    because I was not sure if Strings could be used in switch/case statements since I was using the .equals() method. This method
    is used as a helper method in getZIPcode(). If the bar in the argument is not equal to any of the instance variables bar0-bar9,
    the method returns "ERROR" to indicate to the user that a mistake was made in the barcode they gave. 

    The getZIPcode() method returns the zipcode of the corresponding barcode. I used a for-loop for this method because it is 
    easier to isolate the barcode segments using this type of loop. I started it after the first frame bar, and made the loop end Once
    it got to the check digit barcode. After every iteration, i was increased by 5 so that a bar segment would get looked at only once.
