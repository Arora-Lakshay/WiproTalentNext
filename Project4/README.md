# How to Compile and Run Project4

The folder `Project4` in the current directory is the main package that contains the complete source code for this project.

NOTE - I'm not using any kind of IDE (such as Ecllipse or NetBeans).

## How to Compile

Use the following commands in the terminal to compile the package.
### `$ cd Project4`
### `$ javac Project4\Project4.java`

The above commands will Compile whole package and generate Bytecode(.class files) for each public class.

## How to Run

After the compilation, make sure you must be in the `Project4` directory.
Use the following commands in the terminal to generate the outputs.
### `$ java Project4\Project4`

Now, you can perform various operations provided by the employee management system according to the choices provided through terminal.

## What is Edb.ser file in `Project4` package ?
Whenever a new Employee is added by the user then the details of that employee is serialized by the java program and this serialized output is stored in the file called `Edb.ser`. Also, the same file is used to fetch out the employee's data and are deserialized by the java program at the time of displaying them.

NOTE - Don't modify or delete `Edb.ser` file explicitly, it is required to have this file in the package for java program to run properly. The java program itself performs read and write operations to store employee data.