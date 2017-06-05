end = input("Enter your end value for your sequence: ")

for num in range(1,end):
    for factor in range(2,num):
        if num%factor == 0:
            factor2=num/factor
            break
    else:
        print(num)