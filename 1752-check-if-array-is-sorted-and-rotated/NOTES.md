1) let count=0;
2) now if the array is rotated--[3,4,5,6,1,2]
3) we will compare each index with its next that it is greater or not if it is greater than increase count --the count becomes 1;
4) for sorted array--[1,2,3,4,5,6]
5) from index 0 to n-1 there won't be any​ increment in the count so the count will remain at 0
6) so for both sorted or rotated the count value will be less or equal to 1(count<=1)
7) we will return count <=1;
