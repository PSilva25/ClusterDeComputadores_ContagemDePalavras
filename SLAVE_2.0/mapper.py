from operator import itemgetter
import sys
import os


# input comes from STDIN (standard input)

current_word = None
current_count = 0
word = None
word2cont = {}


arq = open('novo2.txt', 'r')
texto = arq.readlines()

for line in texto:
    
    line = line.strip()
    
    words = line.split()
    
    for word in words: 
        print("%s\t%s" % (word, 1))




