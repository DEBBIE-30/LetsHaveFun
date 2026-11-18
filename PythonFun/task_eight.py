total_score =0
count =0
while (count <=10):
    score = int(input('Enter a score: '))
    if (score >0 and score <100):
        count = count + 1
        total_score = total_score + score
print('Total Score: ',total_score)
