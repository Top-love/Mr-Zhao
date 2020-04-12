/**
  * Copyright 2020 bejson.com 
  */
package com.zxd.myprojects.bean;

/**
 * Auto-generated: 2020-04-10 17:23:20
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private String conclusion;
    private String analysis;
    public void setConclusion(String conclusion) {
         this.conclusion = conclusion;
     }
     public String getConclusion() {
         return conclusion;
     }

    public void setAnalysis(String analysis) {
         this.analysis = analysis;
     }
     public String getAnalysis() {
         return analysis;
     }

    @Override
    public String toString() {
        return "Data{" +
                "conclusion='" + conclusion + '\'' +
                ", analysis='" + analysis + '\'' +
                '}';
    }
}