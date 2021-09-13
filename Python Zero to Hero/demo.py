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
print(id(a));   #-------> 2884405803312
print(id(b));   #-------> 2884405803312
print(id(c));   #-------> 2884405803088