from operator import itemgetter
import socket
import sys

current_word = None
current_count = 0
word = None
word2cont = {}


for line in sys.stdin:
    
    line = line.strip()

    
    word, count = line.split('\t', 1)

    
    try:
        count = int(count)
    except ValueError:
        
        continue


    try:
        word2cont[word] = word2cont[word]+count
    except:
        word2cont[word] = count


arq = open('kay.txt', 'r')
chave = arq.readlines()

lista = chave[0].split("+")

lista.pop(len(lista) - 1)

t = []

encontros = ""

for word in word2cont.keys():
    for pl in lista:
    	if(word==pl):
    		t.append(word+" - "+str(word2cont[word]))
    		encontros = encontros + word+" - "+str(word2cont[word]) + " * "
            
            #print ("%s\t%s"% (word, word2cont[word]))



for p in t:
    print ("%s"% (p))

print ("%s"% (encontros))


HOST = '192.168.0.113'
PORT = 7001           

tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

dest = (HOST, PORT)

tcp.connect(dest)

tcp.send(encontros.encode()) 

tcp.close()
