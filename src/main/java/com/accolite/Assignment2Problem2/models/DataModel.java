package com.accolite.Assignment2Problem2.models;

import java.util.Date;

public class DataModel {

    private String date;
    private String month;
    private String team;
    private String panelName;
    private String round;
    private String skill;
    private String time;
    private String candidateCurrentLocation;
    private String candidatePreferedLocation;
    private String candidateName;
    public DataModel(String date, String month, String team, String panelName, String round, String skill,String time, String candidateCurrentLocation, String candidatePreferedLocation, String candidateName){
        this.date=date;
        this.month=month;
        this.team=team;
        this.panelName=panelName;
        this.skill=skill;
        this.time=time;
        this.candidateCurrentLocation=candidatePreferedLocation;
        this.candidatePreferedLocation=candidatePreferedLocation;
        this.candidateName=candidateName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPanelName() {
        return panelName;
    }

    public void setPanelName(String panelName) {
        this.panelName = panelName;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCandidateCurrentLocation() {
        return candidateCurrentLocation;
    }

    public void setCandidateCurrentLocation(String candidateCurrentLocation) {
        this.candidateCurrentLocation = candidateCurrentLocation;
    }

    public String getCandidatePreferedLocation() {
        return candidatePreferedLocation;
    }

    public void setCandidatePreferedLocation(String candidatePreferedLocation) {
        this.candidatePreferedLocation = candidatePreferedLocation;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "date=" + date +
                ", month='" + month + '\'' +
                ", team='" + team + '\'' +
                ", panelName='" + panelName + '\'' +
                ", round='" + round + '\'' +
                ", skill='" + skill + '\'' +
                ", time='" + time + '\'' +
                ", candidateCurrentLocation='" + candidateCurrentLocation + '\'' +
                ", candidatePreferedLocation='" + candidatePreferedLocation + '\'' +
                ", candidateName='" + candidateName + '\'' +
                '}';
    }

    public DataModel(){

    }
}
