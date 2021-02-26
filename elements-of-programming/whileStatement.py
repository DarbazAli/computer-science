import stdio
i = 1
while i <= 10:
    if i == 1:
        stdio.writeln(str(i) + 'st Hello')
    elif i == 2:
        stdio.writeln(str(i) + 'nd Hello')
    elif i == 3:
        stdio.writeln(str(i) + 'rd Hello')
    else:
        stdio.writeln(str(i) + 'th Hello')
    i = i + 1
