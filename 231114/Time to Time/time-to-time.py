a, b, c, d = tuple(map(int, input().split()))

big_time = 60 * c + d
small_time = 60 * a + b

print(big_time - small_time)