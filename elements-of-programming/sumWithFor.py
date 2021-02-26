import sys
import stdio

n = int(sys.argv[1])
total = 0

for i in range(n+1):
    total += i
stdio.writeln(total)
