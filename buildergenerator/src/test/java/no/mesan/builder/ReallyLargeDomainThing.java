package no.mesan.builder;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Domain object.
 */
public class ReallyLargeDomainThing implements Serializable {
    private final static long serialVersionUID = 3206093459760846163L;
    private String allocatedRes;
    private String appointmentID;
    private int appointmentType;
    private int appSubtype;
    private java.lang.String appSubtypeLimit;
    private int appSubTypeStatus;
    private boolean authorized;
    private java.util.Date authorizedDate;
    private String carChassisNumber;
    private int carKm;
    private String carRegNumber;
    private String changedBy;
    private String comment;
    private String createdBy;
    private String customerAddress;
    private String customerEmail;
    private String customerName;
    private String customerTlf;
    private String customerTlfToday;
    private boolean customerWaiting;
    private String dateChanged;
    private String dateCreated;
    private String endTime;
    private int eventtype;
    private String fnr;
    private short gjgAar;
    private int gjgNr;
    private boolean hasVcoInSession;
    private java.lang.String holidayCode;
    private String interruptedDescription;
    private int intStatus1 = 0;
    private int intStatus2 = 0;
    private float invoicePrice = 0;
    private int jobStatus;
    private java.util.List<?> list = new ArrayList<>();
    private int mainResource;
    private boolean mechanicianControl = false;
    private int mechanicianStatus;
    private java.lang.String mverkOrderNumber;
    private short OppdragNr;
    private boolean orderConnected = false;
    private String orderText;
    private int partsStatus;
    private boolean qualityControl = false;
    private int serieID;
    private double soldHoursAmount;
    private String startTime;
    private String strStatus1 = null;
    private String strStatus2 = null;
    private java.sql.Timestamp timeStampCreated;

    public ReallyLargeDomainThing(List<?> v, String allocatedRes,
            String appointmentID, String carChassisNumber, int carKm,
            String carRegNumber, String changedBy, String createdBy,
            String customerAddress, String customerEmail, String customerName,
            String customerTlf, String customerTlfToday, String dateChanged,
            String dateCreated, String endTime, String fnr, int intStatus1,
            int intStatus2, float invoicePrice, int jobStatus,
            int mainResource, boolean mechanicianControl,
            int mechanicianStatus, boolean orderConnected, String orderText,
            int partsStatus, boolean qualityControl, String startTime,
            String strStatus1, String strStatus2, Timestamp timeStampCreated,
            String comment, int serieID, int appointmentType, int eventtype,
            boolean customerWaiting, String interruptedDescription,
            short oppdragNr, int gjgNr, short gjgAar, String mverkOrderNumber,
            String appSubtypeLimit, int appSubtype, int appSubTypeStatus,
            double soldHoursAmount, String holidayCode, boolean authorized,
            Date authorizedDate, boolean hasVcoInSession) {
        this.list = v;
        this.allocatedRes = allocatedRes;
        this.appointmentID = appointmentID;
        this.carChassisNumber = carChassisNumber;
        this.carKm = carKm;
        this.carRegNumber = carRegNumber;
        this.changedBy = changedBy;
        this.createdBy = createdBy;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerTlf = customerTlf;
        this.customerTlfToday = customerTlfToday;
        this.dateChanged = dateChanged;
        this.dateCreated = dateCreated;
        this.endTime = endTime;
        this.fnr = fnr;
        this.intStatus1 = intStatus1;
        this.intStatus2 = intStatus2;
        this.invoicePrice = invoicePrice;
        this.jobStatus = jobStatus;
        this.mainResource = mainResource;
        this.mechanicianControl = mechanicianControl;
        this.mechanicianStatus = mechanicianStatus;
        this.orderConnected = orderConnected;
        this.orderText = orderText;
        this.partsStatus = partsStatus;
        this.qualityControl = qualityControl;
        this.startTime = startTime;
        this.strStatus1 = strStatus1;
        this.strStatus2 = strStatus2;
        this.timeStampCreated = timeStampCreated;
        this.comment = comment;
        this.serieID = serieID;
        this.appointmentType = appointmentType;
        this.eventtype = eventtype;
        this.customerWaiting = customerWaiting;
        this.interruptedDescription = interruptedDescription;
        OppdragNr = oppdragNr;
        this.gjgNr = gjgNr;
        this.gjgAar = gjgAar;
        this.mverkOrderNumber = mverkOrderNumber;
        this.appSubtypeLimit = appSubtypeLimit;
        this.appSubtype = appSubtype;
        this.appSubTypeStatus = appSubTypeStatus;
        this.soldHoursAmount = soldHoursAmount;
        this.holidayCode = holidayCode;
        this.authorized = authorized;
        this.authorizedDate = authorizedDate;
        this.hasVcoInSession = hasVcoInSession;
    }

    // OBS. Alternative constructor, if you want to test having two of them
    public ReallyLargeDomainThing(final String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public java.lang.String getAllocatedRes() {
        return allocatedRes;
    }

    public java.lang.String getAppointmentID() {
        return appointmentID;
    }

    public int getAppointmentType() {
        return appointmentType;
    }

    public int getAppSubtype() {
        return appSubtype;
    }

    public java.lang.String getAppSubtypeLimit() {
        return appSubtypeLimit;
    }

    public int getAppSubTypeStatus() {
        return appSubTypeStatus;
    }

    public java.util.Date getAuthorizedDate() {
        return authorizedDate;
    }

    public java.lang.String getCarChassisNumber() {
        return carChassisNumber;
    }

    public int getCarKm() {
        return carKm;
    }

    public java.lang.String getCarRegNumber() {
        return carRegNumber;
    }

    public java.lang.String getChangedBy() {
        return changedBy;
    }

    public java.lang.String getComment() {
        return comment;
    }

    public java.lang.String getCreatedBy() {
        return createdBy;
    }

    public java.lang.String getCustomerAddress() {
        return customerAddress;
    }

    public java.lang.String getCustomerEmail() {
        return customerEmail;
    }

    public java.lang.String getCustomerName() {
        return customerName;
    }

    public java.lang.String getCustomerTlf() {
        return customerTlf;
    }

    public java.lang.String getCustomerTlfToday() {
        return customerTlfToday;
    }

    public boolean getCustomerWaiting() {
        return customerWaiting;
    }

    public java.lang.String getDateChanged() {
        return dateChanged;
    }

    public java.lang.String getDateCreated() {
        return dateCreated;
    }

    public java.lang.String getEndTime() {
        return endTime;
    }

    public int getEventtype() {
        return eventtype;
    }

    public java.lang.String getFnr() {
        return fnr;
    }

    public short getGjgAar() {
        return gjgAar;
    }

    public int getGjgNr() {
        return gjgNr;
    }

    public java.lang.String getHolidayCode() {
        return holidayCode;
    }

    public java.lang.String getInterruptedDescription() {
        return interruptedDescription;
    }

    public int getIntStatus1() {
        return intStatus1;
    }

    public int getIntStatus2() {
        return intStatus2;
    }

    public float getInvoicePrice() {
        return invoicePrice;
    }

    public int getJobStatus() {
        return jobStatus;
    }

    public java.util.List<?> getList() {
        return list;
    }

    public int getMainResource() {
        return mainResource;
    }

    public boolean getMechanicianControl() {
        return mechanicianControl;
    }

    public int getMechanicianStatus() {
        return mechanicianStatus;
    }

    public java.lang.String getMverkOrderNumber() {
        return mverkOrderNumber;
    }

    public short getOppdragNr() {
        return OppdragNr;
    }

    public boolean getOrderConnected() {
        return orderConnected;
    }

    public java.lang.String getOrderText() {
        return orderText;
    }

    public int getPartsStatus() {
        return partsStatus;
    }

    public boolean getQualityControl() {
        return qualityControl;
    }

    public int getSerieID() {
        return serieID;
    }

    public double getSoldHoursAmount() {
        return soldHoursAmount;
    }

    public java.lang.String getStartTime() {
        return startTime;
    }

    public java.lang.String getStrStatus1() {
        return strStatus1;
    }

    public java.lang.String getStrStatus2() {
        return strStatus2;
    }

    public java.sql.Timestamp getTimeStampCreated() {
        return timeStampCreated;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public boolean isHasVcoInSession() {
        return hasVcoInSession;
    }
}
