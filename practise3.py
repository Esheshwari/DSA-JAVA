#Take input as a number and print whether it's prime or not
number=int(input("Enter a number: "))
def is_prime(number):
    if number<2:
        return False
    for i in range(2, int(number**0.5)+1):
        if number % i == 0:
            return False
    return True
if is_prime(number):
    print(f"{number} is a prime number.")
else:
    print(f"{number} is not a prime number.")   
