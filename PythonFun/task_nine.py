total_score =0;
for number in range(10):
    score = int(input('Enter a score: '))

    if (score >=0 and score <=100 ):
        total_score = total_score + score
print("Total Score: ", total_score)
