m1, d1, m2, d2 = tuple(map(int, input().split()))

months = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

big_days = 0
small_days = 0

for i in range(1, m2+1):
    big_days += months[i]
big_days += d2

for i in range(1, m1+1):
    small_days += months[i]
small_days += d1

print(big_days - small_days)