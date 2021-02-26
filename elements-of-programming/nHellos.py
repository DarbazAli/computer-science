import sys
import stdio

n = int(sys.argv[1])
i = 1
if n <= 1000:
    while i <= n:
        if i % 10 == 1 or i % 100 == 1:
            stdio.writeln(str(i) + 'st Hello')
        elif i % 10 == 2 or i % 100 == 2:
            stdio.writeln(str(i) + 'nd Hello')
        elif i % 10 == 3 or i % 100 == 3:
            stdio.writeln(str(i) + 'rd Hello')
        else:
            stdio.writeln(str(i) + 'th Hello')
        i += 1

else:
    stdio.writeln(
        'Error: Out of range! please provide a number between 1 - 1000')
