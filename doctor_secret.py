st=input()
lst=st.split(" ")
title=int(lst[0])
pages=int(lst[1])
if( len(title)<=23 and pages>=500 and pages<=1000):
    print("Take Medicine")
else:
    print("Don't take Medicine")