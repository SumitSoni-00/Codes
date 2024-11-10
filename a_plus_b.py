'''
# Sample code to perform I/O:

name = input()                  # Reading input from STDIN
print('Hi, %s.' % name)         # Writing output to STDOUT

# Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
'''

# Write your code here
while(True):
    try:
        ln=input()
        lst=ln.split(" ")
        res=int(lst[0]) + int(lst[1])
        print(res)
    except EOFError:
        break