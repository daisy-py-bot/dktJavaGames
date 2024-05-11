import turtle
getrude = turtle.Turtle()
getrude1 = turtle.Turtle()
getrude2 = turtle.Turtle()
def drawBoard(getrude):    
    
    getrude.speed(400)
    getrude.penup()
    getrude.forward(300)
    getrude.left(90)
    getrude.forward(300)
    getrude.left(90)
    getrude.pendown()
    for i in range(4):
        getrude.forward(600)
        getrude.left(90)
    getrude.color("green")
    getrude.begin_fill()
    for i in range(4):        
        getrude.forward(250) 
        getrude.left(90)
    getrude.end_fill()
         
    getrude.penup()
    getrude.goto(-300,300)

    getrude.color("red")
    getrude.pendown()
    getrude.begin_fill()
    for i in range(4):
        getrude.left(90)
        getrude.forward(250)
    getrude.end_fill()


    getrude.penup()
    getrude.goto(-300,-300)

    getrude.color("blue")
    getrude.pendown()
    getrude.begin_fill()
    for i in range(4):
        getrude.right(90)
        getrude.forward(250)
    getrude.end_fill()


    getrude.penup()
    getrude.goto(300,-300)

    getrude.color("yellow")
    getrude.pendown()
    getrude.begin_fill()
    for i in range(4):
        getrude.forward(250)
        getrude.right(90)
    getrude.end_fill()

    getrude.penup()
    my_point1 = getrude.goto(50,50)
    getrude.pendown()
    for i in range(4):
        getrude.forward(100)
        getrude.left(90)

    getrude.color('green')
    getrude.forward(100)
    getrude.begin_fill()
    getrude.left(45)
    getrude.goto(0,0)
    getrude.left(180)
    getrude.goto(50,50)
    getrude.end_fill()

    getrude.penup()
    getrude.goto(50,50)
    getrude.right(135)
    getrude.color('yellow')
    getrude.forward(100)
    getrude.begin_fill()
    getrude.left(45)
    getrude.goto(0,0)
    getrude.left(180)
    getrude.goto(50,50)
    getrude.end_fill()

    getrude.penup()
    getrude.goto(-50,-50)
    getrude.color('red')
    getrude.right(135)
    getrude.left(90)
    getrude.forward(100)
    getrude.begin_fill()
    getrude.left(45)
    getrude.goto(0,0)
    getrude.left(180)
    getrude.goto(-50,-50)
    getrude.end_fill()

    getrude.penup()
    getrude.goto(-50,-50)
    getrude.left(45)
    getrude.color('blue')
    getrude.forward(100)
    getrude.begin_fill()
    getrude.left(45)
    getrude.goto(0,0)
    getrude.left(180)
    getrude.goto(-50,-50)
    getrude.end_fill()
    getrude.right(45)
    getrude.color('black')
    getrude.right(180)

    #home colors yellow
    getrude.color('yellow')
    getrude.penup()
    getrude.goto(50,17)
    getrude.pendown()
    getrude.begin_fill()
    getrude.forward(208.4)
    getrude.right(90)
    getrude.forward(67)
    getrude.right(90)
    getrude.forward(41.6)
    getrude.right(90)
    getrude.forward(33)
    getrude.left(90)
    getrude.forward(166.8)
    getrude.right(90)
    getrude.forward(34)
    getrude.end_fill()

    #inner home color(yellow)
    getrude.penup()
    getrude.goto(50,8.5)
    getrude.right(90)
    getrude.color('white')
    getrude.pendown()
    getrude.begin_fill()
    getrude.forward(200)
    getrude.right(90)
    getrude.forward(58.5)
    getrude.right(90)
    getrude.forward(24.6)
    getrude.right(90)
    getrude.forward(41.5)
    getrude.left(90)
    getrude.forward(175.4)
    getrude.right(90)
    getrude.forward(17)
    getrude.end_fill()
    



    #home color red
    getrude.left(90)    
    getrude.color('red')
    getrude.penup()
    getrude.goto(-50,-17)
    getrude.pendown()
    getrude.begin_fill()
    getrude.forward(208.4)
    getrude.right(90)
    getrude.forward(67)
    getrude.right(90)
    getrude.forward(41.6)
    getrude.right(90)
    getrude.forward(33)
    getrude.left(90)
    getrude.forward(166.8)
    getrude.right(90)
    getrude.forward(34)
    getrude.end_fill()

    #inner home color(red)
    getrude.penup()
    getrude.goto(-50,-8.5)
    getrude.right(90)
    getrude.color('white')
    getrude.pendown()
    getrude.begin_fill()
    getrude.forward(200)
    getrude.right(90)
    getrude.forward(58.5)
    getrude.right(90)
    getrude.forward(24.6)
    getrude.right(90)
    getrude.forward(41.5)
    getrude.left(90)
    getrude.forward(175.4)
    getrude.right(90)
    getrude.forward(17)
    getrude.end_fill()



    #home color blue
    #getrude.left(90)    
    getrude.color('blue')
    getrude.penup()
    getrude.goto(17,-50)
    getrude.pendown()
    getrude.begin_fill()
    getrude.forward(208.4)
    getrude.right(90)
    getrude.forward(67)
    getrude.right(90)
    getrude.forward(41.6)
    getrude.right(90)
    getrude.forward(33)
    getrude.left(90)
    getrude.forward(166.8)
    getrude.right(90)
    getrude.forward(34)
    getrude.end_fill()

    #inner home color(red)
    getrude.penup()
    getrude.goto(8.5,-50)
    getrude.right(90)
    getrude.color('white')
    getrude.pendown()
    getrude.begin_fill()
    getrude.forward(200)
    getrude.right(90)
    getrude.forward(58.5)
    getrude.right(90)
    getrude.forward(24.6)
    getrude.right(90)
    getrude.forward(41.5)
    getrude.left(90)
    getrude.forward(175.4)
    getrude.right(90)
    getrude.forward(17)
    getrude.end_fill()



    #home colors green
    getrude.left(90)
    getrude.color('green')
    getrude.penup()
    getrude.goto(-17,50)
    getrude.pendown()
    getrude.begin_fill()
    getrude.forward(208.4)
    getrude.right(90)
    getrude.forward(67)
    getrude.right(90)
    getrude.forward(41.6)
    getrude.right(90)
    getrude.forward(33)
    getrude.left(90)
    getrude.forward(166.8)
    getrude.right(90)
    getrude.forward(34)
    getrude.end_fill()

    #inner home color(green)
    getrude.penup()
    getrude.goto(-8.5,50)
    getrude.right(90)
    getrude.color('white')
    getrude.pendown()
    getrude.begin_fill()
    getrude.forward(200)
    getrude.right(90)
    getrude.forward(58.5)
    getrude.right(90)
    getrude.forward(24.6)
    getrude.right(90)
    getrude.forward(41.5)
    getrude.left(90)
    getrude.forward(175.4)
    getrude.right(90)
    getrude.forward(17)
    getrude.end_fill()


    
    getrude.left(270)
    #inner lines1
    getrude.color('black')
    getrude.penup()
    getrude.goto(300,50)
    getrude.pendown()
    #getrude.left(225)
    getrude.left(90)

    getrude.forward(250)
    getrude.penup()
    getrude.forward(100)
    getrude.pendown()
    getrude.forward(250)

    getrude.left(90)
    getrude.forward(33)
    getrude.left(90)
    getrude.forward(250)
    getrude.penup()
    getrude.forward(100)
    getrude.pendown()
    getrude.forward(250)

    getrude.penup()
    getrude.goto(300,-50)
    getrude.pendown()
    getrude.left(180)

    getrude.forward(250)
    getrude.penup()
    getrude.forward(100)
    getrude.pendown()
    getrude.forward(250)

    getrude.right(90)
    getrude.forward(33)
    getrude.right(90)
    getrude.forward(250)
    getrude.penup()
    getrude.forward(100)
    getrude.pendown()
    getrude.forward(250)


    getrude.penup()
    getrude.goto(50,300)
    getrude.right(90)

    getrude.forward(250)
    getrude.penup()
    getrude.forward(100)
    getrude.pendown()
    getrude.forward(250)

    getrude.right(90)
    getrude.forward(33)
    getrude.right(90)
    getrude.forward(250)
    getrude.penup()
    getrude.forward(100)
    getrude.pendown()
    getrude.forward(250)

    getrude.penup()
    getrude.goto(-50,300)
    getrude.left(180)

    getrude.forward(250)
    getrude.penup()
    getrude.forward(100)
    getrude.pendown()
    getrude.forward(250)

    getrude.left(90)
    getrude.forward(33)
    getrude.left(90)
    getrude.forward(250)
    getrude.penup()
    getrude.forward(100)
    getrude.pendown()
    getrude.forward(250)

    getrude.penup()
    getrude.goto(50,50)
    getrude.pendown()
    getrude.forward(250)
    getrude.penup()
    getrude.goto(-50,50)
    getrude.pendown()
    getrude.forward(250)

    getrude.right(90)
    acc_coordinates1 = [91.6,133.2,174.8,216.4,258]
    for i in range(5):
        getrude.penup()
        getrude.goto(-50,acc_coordinates1[i])
        getrude.pendown()
        getrude.forward(100)
        

    getrude.penup()
    getrude.goto(-50,-50)
    acc_coordinates2 = [-91.6,-133.2,-174.8,-216.4,-258]
    for i in range(5):
        getrude.penup() 
        getrude.goto(-50,acc_coordinates2[i])
        getrude.pendown()
        getrude.forward(100)

    getrude.left(90)
    for i in range(5):
        getrude.penup() 
        getrude.goto(acc_coordinates2[i],-50)
        getrude.pendown()
        getrude.forward(100)

    for i in range(5):
        getrude.penup()
        getrude.goto(acc_coordinates1[i],-50)
        getrude.pendown()
        getrude.forward(100)


    getrude.color('white')

    getrude.penup()
    getrude.goto(258,80)
    getrude.pendown()
    getrude.begin_fill()
    for i in range(4):
        getrude.forward(166)
        getrude.left(90)    
    getrude.end_fill()

    getrude.penup()
    getrude.goto(-258,80)
    getrude.pendown()
    getrude.begin_fill()
    for i in range(4):
        getrude.forward(166)
        getrude.right(90)    
    getrude.end_fill()

    getrude.penup()
    getrude.goto(-258,-80)
    getrude.pendown()
    getrude.left(180)
    getrude.begin_fill()
    for i in range(4):
        getrude.forward(166)
        getrude.left(90)    
    getrude.end_fill()
        
    
    getrude.penup()
    getrude.goto(258,-80)
    getrude.pendown()
    getrude.begin_fill()
    for i in range(4):
        getrude.forward(166)
        getrude.right(90)    
    getrude.end_fill()

    getrude.penup()
    getrude.color('white')
    getrude.goto(0,0)
    




drawBoard(getrude)
####################################################################
####################################################################
####################################################################
import random
takeplayer={}
play=True
previousPlayer=""
previousPlay=0
print('Welcome to your favorite game: Ludo!! Let the first player get us going.\n')
identity1=input('First player should enter his name: ')
identity2=input('Second player should enter his name: ')
enter1='R1'
enter2='R2'


def playDie(takeplayer,play,player,previousPlayer,previousPlay,identity,enter):

  #player one plays:
    currentplay = input(f'{identity} should play by typing {enter}:\n ')
    while currentplay != enter:
      currentplay = input(f'-------------------\nUh Oh! That was a wrong input. Play again by typing {enter}:\n ')
    if currentplay == enter:
      dieValue = random.randint(1,6)
      previousPlay = dieValue
      
      if dieValue == 6 and player not in takeplayer.keys():
        takeplayer[player]=56
        print(f'Great!! {identity} has started.')
      elif player in takeplayer.keys():
        if previousPlay> takeplayer[player]:
          print(f'Sorry, cannot play the move of value {dieValue}. Let us wait for next chance as we are left with only {takeplayer[player]} step(s) to win.\n')
        else:
          takeplayer[player]=takeplayer[player]-dieValue
      previousPlayer = player
      if  player in takeplayer and takeplayer[player] == 0:
        print(f'{identity} has won. Game is over\n')
        play = False
      if player in takeplayer and play != False and previousPlay <= takeplayer[player] + dieValue:
          print(f'{identity} got {dieValue}. {takeplayer[player]} steps more to go\n\n----------------------------')
      elif player in takeplayer and play == False:
        print('We got a winner!!!')
      elif player not in takeplayer.keys():
        print('Oops!! That was not 6. No shiver, let us wait for next chance.\n-----------------')
    return takeplayer,play,previousPlayer,previousPlay

#############################################################

def replayDie(takeplayer,play,player,previousPlayer,previousPlay,identity,enter):
    currentplay = input(f'{identity} should play again by typing {enter}:\n ')
    while currentplay != enter:
      currentplay = input(f'-------------------\nUh Oh! That was a wrong input. Play again by typing {enter}:\n ')
    if currentplay == enter:
      dieValue = random.randint(1,6)
      previousPlay = dieValue
      if previousPlay > takeplayer[player]:
        print(f'Sorry, cannot play the move of value {dieValue}. Let us wait for next chance as we are left with only {takeplayer[player]} step(s) to win.\n')
      else:
        takeplayer[player] = takeplayer[player] - dieValue
      previousPlayer = player
      if  player in takeplayer and takeplayer[player]==0:
        print(f'{identity} has won. Game is over\n')

        
          
        play=False
      if player in takeplayer and play!=False and previousPlay<=takeplayer[player]+dieValue:
          print(f'{identity} got {dieValue}. {takeplayer[player]} steps more to go\n\n----------------------------')
      elif "P1" in takeplayer and play==False:
        print('We got a winner!!!')
      elif player not in takeplayer.keys():
        print('Oops!! That was not 6. No shiver, let us wait for next chance.\n-----------------')
    return takeplayer,play,previousPlayer,previousPlay

def pawnplace1(getrude1,takeplayer,player):
    
    cord_dict1 = {56:(33.5,237),55:(33.5,195.4),54:(33.5,153.8),53:(33.5,112.2),52:(33.5,70.6),51:(70.8,33.5),50:(112.4,33.5),49:(154,33.5),48:(195.6,33.5),47:(237.2,33.5),46:(278.8,33.5),45:(278.8,0),44:(278.8,-33.5),43:(237.2,-33.5),42:(195.6,-33.5),41:(154,-33.5),40:(112.4,-33.5),39:(70.8,-33.5),38:(33.5,-70.6),37:(33.5,-112.2),36:(33.5,-153.8),35:(33.5,-195.4),34:(33.5,-273),33:(33.5,-278.8),32:(0,-278.8),31:(-33.5,-278.8),30:(-33.5,-273),29:(-33.5,-195.4),28:(-33.5,-153.8),27:(-33.5,-112.2),26:(-33.5,-70.6),25:(-70.8,-33.5),24:(-112.4,-33.5),23:(-154,-33.5),22:(-195.6,-33.5),21:(-237.2,-33.5),20:(-278.8,-33.5),19:(-278.8,0),18:(-278.8,33.5),17:(-237.2,33.5),16:(-195.6,33.5),15:(-154,33.5),14:(-112.4,33.5),13:(-70.8,33.5),12:(-33.5,70.6),11:(-33.5,112.2),10:(-33.5,153.8),9:(-33.5,195.4),8:(-33.5,237),7:(-33.5,278.8),6:(0,278.8),5:(0,237),4:(0,195.4),3:(0,154),2:(0,112.2),1:(0,70.8),0:(0,0)}
    my_keys1 = cord_dict1.keys()
    if len(takeplayer) != 0 and player in takeplayer:
      my_coordinates1 = cord_dict1.get(takeplayer[player])
    #if takeplayer[player] != my_keys1 :
       #getrude.penup()
    
      if takeplayer[player] in my_keys1 :
        getrude1.pendown()
        getrude1.color('white')
        getrude1.dot()
        getrude1.penup()
        getrude1.goto(my_coordinates1)
        getrude1.color('green')
        getrude1.pendown()
        getrude1.dot()  
    getrude1.penup()
    

def pawnplace2(getrude2,takeplayer,player):
    
    cord_dict2 = {56:(-33.5,-237),55:(-33.5,-195.4),54:(-33.5,-153.8),53:(-33.5,-112.2),52:(-33.5,-70.6),51:(-70.8,-33.5),50:(-112.4,-33.5),49:(-154,-33.5),48:(-195.6,-33.5),47:(-237.2,-33.5),46:(-278.8,-33.5),45:(-278.8,0),44:(-278.8,33.5),43:(-237.2,33.5),42:(-195.6,33.5),41:(-154,33.5),40:(-112.4,33.5),39:(-70.8,33.5),38:(-33.5,70.6),37:(-33.5,112.2),36:(-33.5,153.8),35:(-33.5,195.4),34:(-33.5,273),33:(-33.5,278.8),32:(0,278.8),31:(33.5,278.8),30:(33.5,273),29:(33.5,195.4),28:(33.5,153.8),27:(33.5,112.2),26:(33.5,70.6),25:(70.8,33.5),24:(112.4,33.5),23:(154,33.5),22:(195.6,33.5),21:(237.2,33.5),20:(278.8,33.5),19:(278.8,0),18:(278.8,-33.5),17:(237.2,-33.5),16:(195.6,-33.5),15:(154,-33.5),14:(112.4,-33.5),13:(70.8,-33.5),12:(33.5,-70.6),11:(33.5,-112.2),10:(33.5,-153.8),9:(33.5,-195.4),8:(33.5,-237),7:(33.5,-278.8),6:(0,-278.8),5:(0,-237),4:(0,-195.4),3:(0,-154),2:(0,-112.2),1:(0,-70.8),0:(0,0)}
    my_keys2 = cord_dict2.keys()
    if len(takeplayer) != 0 and player in takeplayer:
      my_coordinates2 = cord_dict2.get(takeplayer[player])
    #if takeplayer[player] != my_keys1 :
       #getrude.penup()
    
      if takeplayer[player] in my_keys2 :
        getrude2.pendown()
        getrude2.color('white')
        getrude2.dot()
        getrude2.penup()
        getrude2.goto(my_coordinates2)
        getrude2.color('blue')
        getrude2.pendown()
        getrude2.dot()
    getrude2.penup()   

while play:
  if previousPlayer!='P1' and previousPlay!=6:
    
    takeplayer,play,previousPlayer,previousPlay = playDie(takeplayer,play,'P1',previousPlayer,previousPlay,identity1,enter1)
    #if 'P1' in takeplayer and takeplayer['P1']==56:
    
  elif previousPlayer=='P1' and previousPlay==6:
    takeplayer,play,previousPlayer,previousPlay = replayDie(takeplayer,play,'P1',previousPlayer,previousPlay,identity1,enter1)
  elif previousPlayer=='P1':
    takeplayer,play,previousPlayer,previousPlay = playDie(takeplayer,play,'P2',previousPlayer,previousPlay,identity2,enter2)
    #if 'P2' in takeplayer and takeplayer['P2']==56:
     #pawnplace2(getrude,takeplayer,'P2')
  elif previousPlayer=='P2' and previousPlay==6:
    takeplayer,play,previousPlayer,previousPlay = replayDie(takeplayer,play,'P2',previousPlayer,previousPlay,identity2,enter2)
  pawnplace1(getrude1,takeplayer,'P1')
  pawnplace2(getrude2,takeplayer,'P2')


else:
   
   screen = turtle.Screen()
   screen.clear()
   getrude.color("black")

    # Create a turtle
    # pen = turtle.Turtle()

    # Write text on the screen
   if previousPlayer=='P1': 
    getrude.write(f"       Game is over !!!\n  {identity1} has won 🥳🥳\n\nBetter luck next time {identity2}", align="center", font=("Arial", 60, "bold italic"))
   elif previousPlayer=='P2': 
    getrude.write(f"       Game is over !!!\n   {identity2} has won 🥳🥳\n\nBetter luck next time {identity1}", align="center", font=("Arial", 60, "bold italic "))
   

    # Keep the window open until closed by the user
   screen.mainloop()
   screen.exitonclick()
