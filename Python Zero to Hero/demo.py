# -5 to 256 -> variable int share the same addresses for the integer value between the range of -5 to 256 
# beyond the range of -5 to 256, varibale doesn't share the same address, they share the seperate address
# eg.....
# a = 10;
# b = a;
# c = 10;  ...... a, b, c they all will share the same address.id(a)

# a = 257;
# b = a;
# c = 257;  ....... a, b share the same address, but c will have the different address 

a = 6
b = a;
# print(a);
# print(b);
id(a);
id(b);