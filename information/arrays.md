An array itself is an object that can store objects or primitives. An object is a value which points to a value(references). If an array has a string as one of its elements then the computer sees a pointer to a memory address which the actual string value has been stored to

String[] arr = new String[3];

arr -----> [ref][ref][ref]
                |   |   |
            Null  Null   Null

String[] arr = new int[3];

arr ----> [null][null][null]
Null meaning there are no values due to no values being declared for the array. 