import sys
import stdio

a = float(sys.argv[1])
b = float(sys.argv[2])


if a >= 0.0 and a <= 1.0 and b >= 0.0 and b <= 1.0:
    stdio.writeln(True)
else:
    stdio.writeln(False)
