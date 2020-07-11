import turtle
'''
def drawtriangle(x,y,z, pen):
    #pen.up()
    if(x==2 or y==2):
        return x=2 && y=2
    else
        pen.goto(x,y)
        pen.down()
    
        pen.goto(x+z,y-z)
        pen.goto(0,0)
    #pen.goto(x+64,y)
    #pen.goto(x-
    #pen.up()
        drawtriangle(x/2,y/2)
'''

def sierpinski(level, x,y, pen):
    '''
    This function recursively draws a Sierpinski Triangle.
    x: the x coordinate of the bottom left corner of the current triangle
    y: the y coordinate of the bottom left corner of the current triangle
    pen: the pen used to draw the triangle
    '''
    # TO DO: Write a break-out condition here
    if(level ==5):
        return
    # place the pen in the correct location for this triangle
    pen.up()
    pen.goto(x, y)
    pen.down()

    # draw the three sides of the triangle
  #  drawtriangle(points,pen)
    for i in range(3):
 
        
        # #TO DO: Remove "pass" and write two lines to move the pen forward and then turn the pen
        # print "in pass
        pen.forward(256/2**level)
        pen.left(120)
        
    
        
    # TO DO: make 3 recursive calls to draw the right, left,
    # and top sub-triangles    
    sierpinski(level+1,0,0,pen) 
#create a pen
print ("in create pen")
p = turtle.Pen()
window = turtle.Screen()
sierpinski(1,0,0,p)
sierpinski(2,32,59,p)
turtle.exitonclick()
