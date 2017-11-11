public class NBody {


    public static void main(String[] args) {
    	/*
    	/*
		Collecting All Needed Input 
    	*/
    	double T = Double.parseDouble(args[0]);
    	double dt = Double.parseDouble(args[1]);
    	String fileName = args[2];
    	double radius = readRadius(fileName);
    	Planet[] planets = readPlanets(fileName);
    	
    	/*
		Drawing the Background
    	*/
		StdDraw.setScale(-radius, radius);
		StdDraw.clear();
		StdDraw.picture(0,0,"images/starfield.jpg");

		/*
		Drawing All of the Planets 
		*/
		int num_drawing = 0;
		while(num_drawing < T){
			planets[num_drawing].draw();
			num_drawing++;
		}

		/*
		Creating an Animation
		*/

		/*
		Create a time variable and set it to 0. Set up a loop to loop until this time variable is T.
		*/
		double time = 0;

		/*
		For each time through the loop, do the following:
		*/

		while(time < T){
			/* 
			Create an xForces array and yForces array. 
			*/
			double[] xForces = new double[planets.length];
			double[] yForces = new double[planets.length];

			/*
			Calculate the net x and y forces for each planet, 
			storing these in the xForces and yForces arrays respectively.
			*/

			int nth_planet = 0;
			while(nth_planet < planets.length){
				xForces[nth_planet]= planets[nth_planet].calcNetForceExertedByX(planets);
				yForces[nth_planet]= planets[nth_planet].calcNetForceExertedByY(planets);
				nth_planet++;
			}

			/*
			Call update on each of the planets. 
			This will update each planet's position, velocity, and acceleration.
			*/
			int counter = 0;
			while(counter < planets.length){
				planets[counter].update(dt, xForces[counter], yForces[counter]);
				counter++;
			}

			/*
			Draw the background image.
			*/
			StdDraw.picture(0, 0, "images/starfield.jpg");

			/*
			Draw all of the planets.
			*/
			int count = 0;
			while(count < T){
				planets[count].draw();
				count++;
			}	

			/*
			Pause the animation for 10 milliseconds
			*/
			StdDraw.show(10);
			/*
			Increase your time variable by dt.
			*/
			time = time +dt;
		}

    }

    public static double readRadius(String fileName){
    /*
     Inspired by InDemo.java given in the example folder
     Radius is the second number in fileName.
    */
        In in = new In(fileName);
        int num_planets = in.readInt();
        double radius = in.readDouble();
        return radius;
    }
    
    public static Planet[] readPlanets(String fileName){
        /*
         Inspired by InDemo.java given in the example folder
         The first number is the number of planets in fileName
         The second numebr is the radius of the universe in fileName
         In each row, it contains the data for every planet, which is:
            1. xxPos
            2. yyPos
            3. xxVel
            4. yyVel
            5. mass
            6. imgFileName
        Each planet object (aka Planet[i]) is defined as Planet object = new Planet(xxPos, yyPos, xxVel, yyVel, mass, imgFileName)
         */
        In in = new In(fileName);
        int num_planets = in.readInt();

        /*
		We do not assign a variable for in.readDouble() because we do not need it in this method.
		It will be placed into the garbage collection of Java. 
        */

        in.readDouble();

        Planet new_planet[] = new Planet[num_planets];
        int nth_planet = 0;
     	while(nth_planet < num_planets){
     		double xxPos = in.readDouble();
     		double yyPos = in.readDouble();
     		double xxVel = in.readDouble();
     		double yyVel = in.readDouble();
     		double mass  = in.readDouble();
     		String imgFileName = in.readString();
     		new_planet[nth_planet] = new Planet(xxPos, yyPos, xxVel, yyVel, mass ,imgFileName);
     		nth_planet++;
     	}
     	return new_planet;   
    }
 }
