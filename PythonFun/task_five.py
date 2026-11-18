total_score = 0
count = 0
for counter in range(10):
    score = int(input('Enter a score: '))
    if score %2 ==0 :
        count = count + 1
        total_score = total_score + score
average = total_score /count
print('Total Score: ',total_score)

