total_score = 0
count = 0
for counter in range(10):
    score = int(input('Enter a score: '))
    if counter %2 ==0 :
        count = count + 1
        total_score = total_score + score
print('Total Score: ',total_score)

