#Take input of a salary if the salary is grater than 10k add bonus 2000 or else add 1000
salary=int(input("Enter your salary: "))
if salary>10000:
    salary+=2000
else:
    salary+=1000
print("Your salary with bonus: ", salary)
