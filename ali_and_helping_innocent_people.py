st1=input()
lst=['A','E','I','O','U','Y']
print(st1[0],st1[1],st1[2],st1[3],st1[4],st1[5],st1[6],st1[7],st1[8])
if( (int(st1[0])+int(st1[1]))%2==0 and (int(st1[3])+int(st1[4]))%2==0 and (int(st1[4])+int(st1[5]))%2==0 and (int(st1[7])+int(st1[8]))%2==0 ):
    print("HELLO")
    if st1[2] not in lst:
        print("valid")
    else:
        print("invalid")
else:
    print("invalid~~")