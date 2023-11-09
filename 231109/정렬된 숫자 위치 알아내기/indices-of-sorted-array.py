class Nums:
    def __init__(self, n, i):
        self.num = n
        self.idx = i 


n = int(input())

num_arr = tuple(map(int, input().split()))

nums = []
for idx, elem in enumerate(num_arr, start=1):
    nums.append(Nums(elem, idx))

nums.sort(key=lambda x: x.num)


ans = [0] * (n + 1)
for i, elem in enumerate(nums):
    ans[elem.idx] = i + 1

for i in range(1, n + 1):
    print(ans[i], end=" ")