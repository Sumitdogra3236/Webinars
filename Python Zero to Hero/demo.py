# -5 to 256 -> variable int share the same addresses for the integer value between the range of -5 to 256 
# beyond the range of -5 to 256, varibale doesn't share the same address, they share the seperate address
# eg.....
# a = 10;
# b = a;
# c = 10;  ...... a, b, c they all will share the same address.id(a)

# a = 257;
# b = a;
# c = 257;  ....... a, b share the same address, but c will have the different address 

# a = 6
# b = a;
# c = 6
# print(id(a)); ----> 2572345436624
# print(id(b)); ----> 2572345436624
# print(id(c)); ----> 2572345436624

a = 400;
b = a;
c = 400;
# print(id(a));   #-------> 2884405803312
# print(id(b));   #-------> 2884405803312
# print(id(c));   #-------> 2884405803088

# Operator 
# and Operator -> if and operator gets the first condition false , it will never check the second condition, and return false

# print(10 > 5 and 3 < 4); # ----> True
# print(10 > 5 and 3 < Sumit) # ----> Error -> name 'Sumit' is not defined 
# print(10 < 5 and 3 < Sumit) # ----> False 

# or Operator -> if one of the expresion is True gives true 
# print(10 > 20 or 5 > Sumit) # ----> Error -> name 'Sumit' is not defined
# print(20 > 10 or 5 > Sumit) # ----> True

# in operator -> membership operator
a = "PythonProgramming";
print("P" in a); # ----> True
print("X" in a); # ----> False
print("X" not in a); # Inverter ----> True

# is operator -> identity operator
# return that the variable pointed to same memory object or not
x = 30
y = 30
print(x == y) # ----> True
print(x is y) # ----> True

m = 300;
n = 300;
print(m == n) # ----> True
print(m is n) # ----> False