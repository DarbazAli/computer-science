import stdio

# Cast out integers from 1000 to 1999
for i in range(1000, 2000):
    stdio.write(str(i) + '  ')
    # use 10 integers per line, if current number is divisble by 5, go to a new line
    if i % 5 == 0:
        stdio.writeln()
