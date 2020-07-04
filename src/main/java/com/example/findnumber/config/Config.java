package com.example.findnumber.config;

import com.example.findnumber.beans.Competitor;
import java.io.Serializable;

public class Config implements Serializable {
    
    private Competitor competitor;
    
    public Config(){
    
    }
    
    public Config(Competitor competitor){
        this.competitor = competitor;
    }

    public Competitor getCompetitor() {
        return competitor;
    }

    public void setCompetitor(Competitor competitor) {
        this.competitor = competitor;
    }
    
}
