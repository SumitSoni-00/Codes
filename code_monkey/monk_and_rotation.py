test1=int(input())
i=1
while(i<=test1):
    n_k=input()
    lst=n_k.split(" ")
    print(lst)
    n=int(lst[0])
    k=int(lst[1])
    arr=input()
    lst=arr.split(" ")
    lst=list(map(int,lst))
    print(lst)
    lst2=lst[-k:]
    lst=lst[-n:-k]
    #lst.remove(lst[-k:])
    lst2.extend(lst)
    print(lst2)
    i+=1