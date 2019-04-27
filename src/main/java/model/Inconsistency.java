package model;

import java.util.Date;

public class Inconsistency {
    private String year;
    private String claim;
    private String reference;
    private String rec;
    private String SSD;
    private String creationDate;
    private String openMonth;
    private String closeMonth;
    private String project;
    private String grav;
    private String cons;
    private String amount;
    private String rnk;
    private String defectExplain;
    private String causeOfNonDetect;
    private String actionPlanCP;
    private String dateOfFirstOK;
    private String rootCause;
    private String ASESitem;
    private String sourceofDetect;
    private String getActionPlanKD;
    private String date;
    private String endofClaim;
    private String statusClosed;

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getClaim() {
        return claim;
    }

    public void setClaim(String claim) {
        this.claim = claim;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getMonth() {
        return openMonth;
    }

    public void setMonth(String month) {
        this.openMonth = month;
    }

    public String getCloseMonth() {
        return closeMonth;
    }

    public void setCloseMonth(String closeMonth) {
        this.closeMonth = closeMonth;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getGrav() {
        return grav;
    }

    public void setGrav(String grav) {
        this.grav = grav;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRnk() {
        return rnk;
    }

    public void setRnk(String rnk) {
        this.rnk = rnk;
    }

    public String getDefectExplain() {
        return defectExplain;
    }

    public void setDefectExplain(String defectExplain) {
        this.defectExplain = defectExplain;
    }

    public String getCauseOfNonDetect() {
        return causeOfNonDetect;
    }

    public void setCauseOfNonDetect(String causeOfNonDetect) {
        this.causeOfNonDetect = causeOfNonDetect;
    }

    public String getActionPlanCP() {
        return actionPlanCP;
    }

    public void setActionPlanCP(String actionPlanCP) {
        this.actionPlanCP = actionPlanCP;
    }

    public String getDateOfFirstOK() {
        return dateOfFirstOK;
    }

    public void setDateOfFirstOK(String dateOfFirstOK) {
        this.dateOfFirstOK = dateOfFirstOK;
    }

    public String getRootCause() {
        return rootCause;
    }

    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }

    public String getASESitem() {
        return ASESitem;
    }

    public void setASESitem(String ASESitem) {
        this.ASESitem = ASESitem;
    }

    public String getSourceofDetect() {
        return sourceofDetect;
    }

    public void setSourceofDetect(String sourceofDetect) {
        this.sourceofDetect = sourceofDetect;
    }

    public String getGetActionPlanKD() {
        return getActionPlanKD;
    }

    public void setGetActionPlanKD(String getActionPlanKD) {
        this.getActionPlanKD = getActionPlanKD;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEndofClaim() {
        return endofClaim;
    }

    public void setEndofClaim(String endofClaim) {
        this.endofClaim = endofClaim;
    }

    public String getStatusClosed() {
        return statusClosed;
    }

    public void setStatusClosed(String statusClosed) {
        this.statusClosed = statusClosed;
    }

    @Override
    public String toString() {
        return "Inconsistency{" +
                "year='" + year + '\'' +
                ", claim='" + claim + '\'' +
                ", reference='" + reference + '\'' +
                ", rec='" + rec + '\'' +
                ", SSD='" + SSD + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", openMonth='" + openMonth + '\'' +
                ", closeMonth='" + closeMonth + '\'' +
                ", project='" + project + '\'' +
                ", grav='" + grav + '\'' +
                ", cons='" + cons + '\'' +
                ", amount='" + amount + '\'' +
                ", rnk='" + rnk + '\'' +
                ", defectExplain='" + defectExplain + '\'' +
                ", causeOfNonDetect='" + causeOfNonDetect + '\'' +
                ", actionPlanCP='" + actionPlanCP + '\'' +
                ", dateOfFirstOK='" + dateOfFirstOK + '\'' +
                ", rootCause='" + rootCause + '\'' +
                ", ASESitem='" + ASESitem + '\'' +
                ", sourceofDetect='" + sourceofDetect + '\'' +
                ", getActionPlanKD='" + getActionPlanKD + '\'' +
                ", date='" + date + '\'' +
                ", endofClaim='" + endofClaim + '\'' +
                ", statusClosed='" + statusClosed + '\'' +
                '}';
    }
}
