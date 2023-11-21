month = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

def date(m):
    time = 0
    for i in range(1, m):
        time += month[i]
    return time


m1, d1, m2, d2 = tuple(map(int, input().split()))
day = input()

big_date = date(m2) + d2
small_date = date(m1) + d1
total = big_date - small_date

print(total // 7 + 1)