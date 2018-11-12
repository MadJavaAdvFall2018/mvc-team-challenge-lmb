package java112.project3;

/**
 *  This is a JavaBean to keep track of miles, location and activity completed.
 *
 *@author bschwartz2
 *@author sailormary13
 *@author lucaskostecki
 */
public class MVCBean {

///////////////////////Instance Variables///////////////////////////////////
    private String activity;
    private String location;
    private double miles;



/////////////////////Constructor Method/////////////////////////////////////
    /**
    *  Constructor for the MVC object
    */
    public MVCBean() {
        activity = "null";
        location = "null";
        miles = 0.0;
    }



/////////////////////////Get Methods/////////////////////////////////////////
    /**
    *  Gets the activity attribute of the MVCDemo object
    *
    *@return The activity value
    */
    public String getActivity() {
        return activity;
    }

    /**
    *Gets the location attribute of MVCDemo object
    *
    *@return The location value
    */
    public String getLocation() {
        return location;
    }


    /**
    *Gets the miles attribute of MVCDemo object
    *
    *@return The miles value
    */
    public double getMiles() {
        return miles;
    }



///////////////////////Set Methods//////////////////////////////////////////
    /**
    *  Sets the activity attribute of the MVCDemo object
    *
    *@param  activity  The new activity value
    */
    public void setActivity(String activity) {
        this.activity = activity;
    }


    /**
    *  Sets the location attribute of the MVCDemo object
    *
    *@param  location  The new location value
    */
    public void setLocation(String location) {
        this.location = location;
    }


    /**
    *  Sets the miles attribute of the MVCDemo object
    *
    *@param  miles  The new miles value
    */
    public void setMiles(double miles) {
        this.miles = miles;
    }
}
