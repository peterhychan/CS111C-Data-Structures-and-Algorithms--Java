/*
 Solo-Project by Peter Ho Yeung Chan
 */

public class Planet {
    double xxPos;
    double yyPos;
    double xxVel;
    double yyVel;
    double mass;
    String imgFileName;
    
    public Planet(double xP, double yP, double xV,
                  double yV, double m, String img){
        xxPos = xP;
        yyPos = yP;
        xxVel = xV;
        yyVel = yV;
        mass  = m;
        imgFileName =img;
    }
    
    public Planet(Planet p){
        xxPos = p.xxPos;
        yyPos = p.yyPos;
        xxVel = p.xxVel;
        yyVel = p.yyVel;
        mass  = p.mass;
        imgFileName = p.imgFileName;
    }
    
    public double calcDistance(Planet p){
        /*
         Distance(r) = sqrt((x2-x1)^2 + (y2-y1)^2)
        */
        
        return Math.sqrt((this.xxPos - p.xxPos)*(this.xxPos- p.xxPos)
                       + (this.yyPos - p.yyPos)*(this.yyPos-p.yyPos));
    }
    
    public double calcForceExertedBy(Planet p){
        /*
        F = gForce * this.mass * p.mass/r^2
        r can be calculated by calcDistance above
        Math.pow(x,y) = x^y
        gForce is given as 6.67 * 10^-11 (unit)
         */
        
        double gForce = 6.67*Math.pow(10,-11);
        double r2 = calcDistance(p)*calcDistance(p);
        return gForce*this.mass*p.mass/r2;
    }
    
    public double calcForceExertedByX(Planet p){
        /*
        Fx = F * dx/r
        dx = |p.xxPos- this.xxPos|
        r  can be calculated by CalcDistance above
        */
        
        double F = calcForceExertedBy(p);
        double dx = 0;
        dx = p.xxPos - this.xxPos;
        double r = calcDistance(p);
        return F*dx/r;
    }
    
    public double calcForceExertedByY(Planet p){
        /*
         Fy = F * dy/r
         dy = |p.yyPos- this.yyPos|
         r  can be calculated by CalcDistance above
         */
        
        double F = calcForceExertedBy(p);
        double dy = 0;
        dy = p.yyPos - this.yyPos;
        double r = calcDistance(p);
        return F*dy/r;
    }
    
    
    public double calcNetForceExertedByX(Planet[] p){
        /*
         Fnet,x = Fx1 +... + Fxn
         Exclude Fx,i when Fx,i == Fx,this
         */
        
        int i =0;
        double calX = 0;
        while(i< p.length-1){
            if(this != p[i]){
                calX+=calcForceExertedByX(p[i]);
            }
            i++;
        }
        return calX;
    }
    
    public double calcNetForceExertedByY(Planet[] p){
        /*
         Fnet,y = Fy1 +... + Fyn
         Exclude Fy,i when Fy,i == Fy.this
         */
    
        int i =0;
        double calY = 0;
        while(i <p.length-1){
            if(this != p[i]){
                calY+=calcForceExertedByY(p[i]);
            }
            i++;
        }
        return calY;
    }
    
    public void update(double dt, double fX, double fY){
        double aX = fX/mass;
        double aY = fY/mass;
        xxVel = xxVel +dt*aX;
        yyVel = yyVel + dt*aY;
        xxPos = xxPos + dt*xxVel;
        yyPos = yyPos + dt*yyVel;
    }
    
    public void draw(){
        String imgLocation = "images/" + imgFileName;
        StdDraw.picture(xxPos, yyPos, imgLocation);
    }
}
