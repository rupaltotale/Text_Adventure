
print("\n")

    print("You go to a restaurant on a blind date. Do you order a cheesy burrito or an expensive, plain salad? ")
    FoodChoice = int(input("Enter 1 for burrito or 2 for salad \n"))
    if FoodChoice == 1:
        print("Your stomach makes funny noises 10 minutes after eating the burrito. Do you go to the restroom or just sit there? ")
        StomachPain = int(input("Enter 1 for restroom or 2 for Sitting \n"))
        if StomachPain == 1:
            print("The rest room is full. Do you want to go to the boys' restroom or wait for 15 minutes?")
            BoyOrWait = int(input("Enter 1 for boys' restroom or 2 for waiting \n"))
            if BoyOrWait == 1:
                print("Your date walks in!! HAHA THE JOKE IS ON YOU! \n")
            if BoyOrWait == 2:
                print("Your stomach makes noises and you barf on the person ahead of you and your date catches you :(\n")
        if StomachPain == 2:
            print("You fart and it stinks up the whole room. Your date walks away and you are left alone.\n")

    if FoodChoice == 2:
        print("You received your salad, but you see that it tastes very plain, so you don't feel like eating it. You want to call over a waiter, but the staff is super busy. You want additional food. Do you continue to eat the plain salad or wait for a waiter to serve you?")
        EatOrWait = int(input("Enter 1 to continue eating or 2 for waiting \n"))
        if EatOrWait == 1:
            print("You are not full. Do you sit there hungry or leave your date and eat somewhere else?")
            EatOrLeave = int(input("Enter 1 to sit there hungry throughout the date or 2 to leave your date"))
            if EatOrLeave == 1:
                print("The blind date did not end well anyways. :( \n")
            if EatOrLeave == 2:
                print("You are full and ate delicious food  :) \n")
        if EatOrWait == 2:
            print("You've waited for 10 minutes for a waiter to serve you. The waiter offers to give you nachos and beans free of charge, but it will take 30 more minutes.\n")
            print("Do you wait for the meal or go home and cook after the date?\n")
            MealOrCook = int(input("Enter 1 to wait or 2 to go home \n"))
            if MealOrCook == 1:
                print("Yay! You finally got a delicious meal. :D \n")
            if MealOrCook == 2:
                print("The blind date did not end well anyways, so you are tired and hungry while going home. :( \n")
