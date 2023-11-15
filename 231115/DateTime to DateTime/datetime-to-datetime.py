a, b, c = tuple(map(int, input().split()))

day = a - 11
day_min = day * 24 * 60

hour_min = b * 60

minutes = c

total = day_min + hour_min + minutes
part = 11 * 60 + 11

if (total - part < 0):
    print(-1)
else:
    print(total - part)