import sys
import stdio

a = int(sys.argv[1])
b = int(sys.argv[2])
c = int(sys.argv[3])

if a == b and a == c and b == c:
    stdio.writeln('Equal')
else:
    stdio.writeln('Not equal')
