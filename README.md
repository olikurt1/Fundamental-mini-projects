This repository is simple practice of concepts before combining them and then combining them into more complex functional programs. 

It will also include learning each concept under the hood. 

//////////////////////////
JVM, ClassPath, packages

The JVM is the machine/program that executes class files in java. Whatever folder the terminal is sitting in when the program is executed is the working directory of that program now. This means that any subfolder within that directory becomes a package that needs declaring if there is a program in that subfolder. 

VS code determines the working directory based on the folder that was opened through vs code meaning the command code "folderName", folderName becomes the working directory when a program is run through vsCode. ClassPath root becomes folderName/etc/etc. 

Maven pom.xml also has to be at the root/working directory to ensure that the files depending on it use it. In this case, pom.xml would be sibling to OOPtime. 

In a properly defined project, There has to be a source root "src/" within the working directory, pom.xml would have to be sibling to "src/". 