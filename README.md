# SimpleCalculator

## This calculator is created using Java, Below is a step by description of how it was created

* The class Cal is created for all the arithemtic function that will later on be used in the main calculator file
* A test case is conducted to insure that all the arithemtic functions function as proposed
* The main Calculator is then created
* After which an executable file for the calculator is created which is also included in this repo.

## How to execute the calculator.exe file

* Download the Calculator.exe file
* Run it on your deskstop/computer

## How to create your own calculator.exe file using the Cal and calculator file


Create an executable jar with ECLIPSE
.......................................................

1. Choose a this repo after which you must have downloaded it.
2. Right click on the project
3. Select Export
4. Java>>>> Runnable Jar file
5. At Launch configuration: select calculator.java
6. At Export destination, select where you want this Jar file exported to
7. Finish


Create an executable jar with IntelliJ
-----------------------------------------
1. File , Project Structure , Artifacts , (+) , JAR ,  jar from module with dependencies
2. Main Class: select calculator.java
3. OK
3. Change output directory to where you want this JAR saved to
6. Apply , OK
7. Build (top of window in IntelliJ) , Build Artifacts , Build


PART II

If you want an icon, convert an image to a .ico file
----------------------------------------------------
1. https://icoconvert.com/ (this is a decent site)
2. Choose your image (file type my vary)
3. Upload
4. Convert to ICO
5. Download your icon

Use Launch4j to create an .exe with custom icon
----------------------------------------------
1. Install Launch4j http://launch4j.sourceforge.net/
2. Output file: browse for the output destination and name your file ending with .exe
3. Jar: browse for where you saved your jar or executable jar file
4. (Optional) Icon: browse for your custom icon (must be .ico)
5. navigate to JRE tab
6. Bundled JRE path: Browse for location of your jdk (Example C:\Program Files\Java\jdk-14.0.1)
7. At the top of window, click the Build Wrapper (gear icon)
8. name and save the Lauch4j config file where you want
9. Your application.exe should be saved to your output file location (no longer need previous files)


After running, your calculator should look like this
----------------------------------------------------

![Screenshot (504)](https://user-images.githubusercontent.com/86835129/165236082-f07f92eb-4ef8-4605-8063-a5c957a5370e.png)
