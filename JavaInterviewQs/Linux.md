# Linux Interview Questions:

## Aditazz

### 1. Command to List Sockets?  Open and Closed
Reference: https://superuser.com/questions/529830/get-a-list-of-open-ports-in-linux

Answer:
$ netstat -lntup
	-l = only services which are listening on some port
	-n = show port number, don't try to resolve the service name
	-t = tcp ports
	-u = udp ports
	-p = name of the program

You can run netstat command to view open ports:
$ netstat -a
$ netstat -nat | grep LISTEN

$ cat /proc/net/tcp -> list of open tcp sockets
$ cat /proc/net/udp -> list of open udp sockets
$ cat /proc/net/raw -> list all the raw sockets

$ lsof -> "list open files", to report a list of all open files and the processes that opened them.


### 2. How to open a Socket?
Reference: https://askubuntu.com/questions/301787/opening-a-port-for-listening

Answer:
Netcat command
$ nc -l 8082


### 3. Command to check Memory Usage?
Reference: https://www.linux.com/blog/5-commands-check-memory-usage-linux

Answer:
$ free -m
	OR
$ cat /proc/meminfo
	OR
$ vmstat -s


### 4. Command to check Disk Usage?
Reference:
 https://www.tecmint.com/check-linux-disk-usage-of-files-and-directories/
 https://www.tecmint.com/how-to-check-disk-space-in-linux/

Answer:
du (Disk Usage) Commands to Find Disk Usage of Files and Directories
$ du -h /mnt1/analytics/arvind/

df -> To check Disk Space in Linux
$ df -h


### 5. How to Creating an SSH key on Linux
Reference: https://confluence.atlassian.com/bitbucketserver/creating-ssh-keys-776639788.html

Answer:
1. Check for existing SSH keys
$ cd ~/.ssh

Check to see if you have a key already:
$ ls id_*

2. Back up old SSH keys
$ mkdir key_backup
$ cp id_rsa* key_backup

3. Generate a new key
If you don't have an existing SSH key that you wish to use, generate one as follows:
$ ssh-keygen -t rsa -C "gnarvind@gmail.com"

Windows: Note that the ssh-keygen command is only available if you have already installed Git (with Git Bash).
If the .ssh directory doesn't exist, the system creates one for you.

