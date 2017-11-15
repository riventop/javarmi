# javarmi
A Java Remote Method Invocation example implementation

## Step 1
Navigate to the order directory.

## Step 2
Compile all the files in the the directory, using this command in a cmd window.
 ``` cmd
 javac *.java
 ```
## Step 3
Type this in the cmd window to start the RMI registry in Windows:
``` cmd
start rmiregistry
```
and this in Linux/Unix:
``` cmd
$ rmiregistry &
```
**Note:** it is important that you run this command int the order directory or where your class files were generated from the previous step. It wil not work otherwise.
In Linux you can check this by running the command:
``` cmd 
$ps 
```

## Step 4: Starting the Server and Client
### Starting the Server
To Start the Server,execute the Server.java file using this command a command line window:
``` cmd
java Server
```
This should start the server and output a 'Server ready' message in the command window.
If this doesn't work make sure that the RMI registry daemon is running in the directory where your classes were generated.

### Starting the Client
Open **another** command window in the same directory and execute the Client file like so:
```cmd
java Client
```
This should not produce an output. If it reports connection refused error, again, make sure the RMI registry is running.
If this is successful you should see some output in the window that you run the Server.

**Note:**
This will bind the current output to the registry. If you change anything, you will need to end/kill the rmiregistry process and repeat the process from **Step 3**.
