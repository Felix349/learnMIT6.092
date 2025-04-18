# learnMIT6.092
This repo contains my solutions to the labs in the course MIT 6.092 Introduction To Programming In Java with open course materials.   
[MIT 6.092 course 2010 website](https://ocw.mit.edu/courses/6-092-introduction-to-programming-in-java-january-iap-2010/pages/syllabus/)  
[Textbook](https://greenteapress.com/wp/think-java/)  
[Labs](https://ocw.mit.edu/courses/6-092-introduction-to-programming-in-java-january-iap-2010/pages/assignments/)  
## Notice ##  
- For lab7, the test input file should be changed to testLec7.txt due to some bugs in the original files Mercury.txt and Luna.txt when they are read line by line by BufferedReader.  
**The bug:**  After each line is read, an unknown character maybe "\n" will be read in the next line(which BufferedReader should be able to omit), causing failure to sum up the integer value of each line.
  
- The content in testLec7.txt is the same as Mercury.txt file. To test if Luna.txt is a magic square, you can create a new .txt file with the same content in Luna.txt as well.
