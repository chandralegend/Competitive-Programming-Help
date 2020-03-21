from math import sqrt
from itertools import count,islice
import time

def isPrime(n):
    check = True
    for x in range(2,int(sqrt(n)) + 1):
        if n%x == 0:
            check = False
            break
    return check

def isPrime2(n):
    if n < 2: return False
    return all(n%i for i in islice(count(2), int(sqrt(n)-1)))


