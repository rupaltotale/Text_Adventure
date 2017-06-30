
print("\n")

print("You go to a restaurant with a friend. Do you order a cheesy burrito or an expensive, plain salad? ")
FoodChoice = int(input("Enter 1 for burrito or 2 for salad \n"))
if FoodChoice == 1:
    print("Your stomach makes funny noises 10 minutes after eating the burrito. Do you go to the restroom or just sit there? ")
    StomachPain = int(input("Enter 1 for restroom or 2 for Sitting \n"))
    if StomachPain == 1:
        print("The rest room is full. Do you want to go to the boys' restroom or wait for 15 minutes?")
        BoyOrWait = int(input("Enter 1 for boys' restroom or 2 for waiting \n"))
        if BoyOrWait == 1:
            print("Your crush walks in!! HAHA THE JOKE IS ON YOU! \n")
        if BoyOrWait == 2:
            print("Your stomach makes noises and you barf on the person ahead of you! :(\n")
    if StomachPain == 2:
        print("You fart and it stinks up the whole room. Your friend walks away and you are left alone.\n")
