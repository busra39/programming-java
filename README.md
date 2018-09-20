# programming-java

Java-test 
3) What sorts of thing might you put in a finalize method?
  Finalize method can be replaced with destructors in C++, however destructors are called always while finalize method may run for once or may not. It is called prior to the garbace collection. So if we want to do something with the object before destruction we can put it. But if we want a code block to be executed absolutely, it should not be put in the finalize method as I mention. I personally do not put close file operations or db connection things in finalize method. I  may put a log operations that I wont need at all but it would be nice to review about objects before destruction.
  
General-test
2)Describe 3 different data structures that could be used to implement an associative array where
both the keys and values are strings, and comment on their relative advantages and
disadvantages?
 HashMap is the first thing that I need to discuss. It stores key and value pairs and implements Map interface. It provides limited methods. The operations are in constant time
 TreeMap also implements sorted map. Therefore, It is an self-balancing binary tree.
 
