#!/usr/bin/python
import sys 
try:
    win_file = sys.argv[1]
except:
    print("A filename must be provided!")
try:
    win_file = open(sys.argv[1], 'r+')
except:
    print("Unable to open file - check spelling?")
file_contents = win_file.read()
print(file_contents)
for content in file_contents:
    if content == '\\':
        
    print(content)
print("COMPLETED!")
win_file.close()
