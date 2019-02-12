from threading import Thread
import time
import sys
import fileinput


# processRequest is the thread code
# - pass the connection object here
def processRequest(arg1, arg2):
	# this is just sample code 
	# - replace with web server code that retrieves file and sends it back
	# - close connection after done sending back retrieved file
	for i in range(5):
		print arg1, arg2
		time.sleep(3)



# main execution follows:

#
# write TCP server set up code here
#

threadcnt = 0

while True:
	#
	# write code to accept socket here
	#

	# sample code just reads a line and echoes 5 times in thread
	line = raw_input('Input: ')
	threadcnt += 1

	# this is how a thread is created and started
	t = Thread(target=processRequest, args=(threadcnt, line)) 
	t.start()

