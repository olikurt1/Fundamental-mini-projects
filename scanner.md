Scanner is an input stream which uses raw byte inputs from keyboard, this is what system.in does. Scanner adds a bufferring meaning input is stored in chunks. It tokenises by splitting input into words or numbers etc and parses. 

Bytes are read from System.in, stored in a buffer, split into tokens using regex and converting tokens into requested types based on requested type such as nextInt or nextLine. 

Sometimes two inputs together means the second one is overwritten by a blank input. This is because the system.in takes the bytes and pressing enter to end input but variable only stores the bytes so the buffer keeps the enter key press which then moves into the next input straight away. 