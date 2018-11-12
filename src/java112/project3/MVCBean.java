package java112.project3;

/**
 *  This is a JavaBean to demonstrate using beans with JSP.
 *
 *@author bschwartz2
 */
public class MVCBean {

    private String activity;
    private String location;
    private double miles;

    /**
     *  Constructor for the BeanOne object
     */
    public MVCBean() {
        activity = "null";
        location = "null";
        miles = 0.0;
    }

    /**
     *  Gets the Data attribute of the BeanOne object
     *
     *@return    The Data value
     */
    public String getData() {
        return data;
    }

    /**
     *  Sets the Data attribute of the BeanOne object
     *
     *@param  data  The new Data value
     */
    public void setData(String data) {
        this.data = data;
    }
}
