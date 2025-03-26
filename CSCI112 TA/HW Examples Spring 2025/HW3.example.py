# Questions 1
x = 7 
y =9 
print(f'1.{x > 5}') # True
print(f'2.{(x > 5) and (y < 20)}') #True
print(f'3.{(x > 10) and (y < 20)}') # False
print(f'4.{(x > 10) or (y < 20)}') #True
print(f'5.{(x > 10) or (y > 20)}') #False
print(f'6.{not (x > 10)}') # True
print(f'7.{not ((x > 5)and(y < 20))}') # False

#Question 2 - Pass/Fail
final = int(input("Enter final score: "))
bonus = int(input("Enter bonus score: "))
print(f'Final Score is {final}')
print(f'Bonus score is {bonus}')

if (final + bonus) >= 80: #Pass condition
    print("Course Passed")
else: 
    print("Course Failed")
    
#Question 3 - Square Root Fucntion
def root(num:int) -> float: 
    """get square root of integer n """
    return num ** 0.5 #can also use math.sqrt(num)

num = int(input('Enter a number: '))
print(f'The root of {num} is {root(num)}') #Print statement could also be inside the function

#Problem 4 - Minutes to seconds function 
def min_to_sec(min:int)-> int: 
    """convert minutes to seconds and print results"""
    sec = min * 60 
    return sec 

min = int(input("Enter number of minutes"))
print(f'{min} minutes is {min_to_sec(min)} seconds') #Print statement could also be inside the function

#Problem 5 - Tip Caculator Function
def tip(bill: float, tp: float) -> float: 
    """calculate the total bill including tip - given percentage"""
    return bill  * (1 + tp)

bill = float(input("How much was the bill? "))
tp = float(input("What percent was the tip"))
print(f'A tip of {tp}% on a bill of ${bill} makes the total ${tip(bill,tp)}') #Print statement could also be inside the function

#Problem 6 - Bank Withdraw Function
def withdraw(balance: float, num_out: float) -> float: 
    """take funds from bank account if funds are available"""
    if num_out > balance: 
        print("Insufficient funds")
    else: 
        balance -= num_out
        print("New balance:", balance)

balance = float(input("What is you account balance? "))
num_out = float(input("How much did you spend? "))
print(f'With a balance of ${balance} and a purchase of ${num_out}')
withdraw(balance, num_out)
    




