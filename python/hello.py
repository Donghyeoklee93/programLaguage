# ch1
print("hello, World")


# ch2
a = 1
print(a)
print(type(a))

b = 1.24
print(b)
print(type(b))

c = 4.24e10
print(c)
print(type(c))

d = 4.24e-10
print(d)
print(type(d))

e = 0o177
print(e)
print(type(e))

f = 0xABC
print(f)
print(type(f))

a = 3
b = 4
print(a+b)
print(a-b)
print(a*b)  # a to the power of b
print(a*b)
print(a/b)
print(a//b)  # quotient
print(a % b)  # remainder


a = "Hello World"
b = 'Python is fun'
c = """Life is too short, You need python"""
d = '''Life is too short, You need python'''

print(type(a))
print(type(b))
print(type(c))
print(type(d))


food = "Python's favorite food is perl"
say = '"Python is very easy." he says.'
food1 = 'Python\'s favorite food is perl'
say2 = "\"Python is very easy.\" he says."

print(food)
print(say)
print(food1)
print(say2)


a = 'Life is too short, \nYou need python'
print(a)
print(a[0])
print(a[1])
print(a[2])
print(a[-1])
print(a[0:4])

multiline = '''
Life is too short
You need python
'''
print(multiline)


a = "Python"
b = "is fun!"
print(a + b)
print(a * 100)


a = "Life is too short"
print(len(a))
print(a[0])


a = "I eat %d apples." % 3
print(a)

a = "I eat %s apples." % "five"
print(a)

number = 3
a = "I eat %d apples." % number
print(a)

number = 10
day = "three"
a = "I ate %d apples. so I was sick for %s days." % (number, day)
print(a)

a = "%10s" % "hi"
print(a)

a = "%-10sjane." % 'hi'
print(a)

a = "%0.4f" % 3.42134234
print(a)





