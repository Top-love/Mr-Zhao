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
public class QQTest {

    private int error_code;
    private String reason;
    private Result result;
    public void setError_code(int error_code) {
         this.error_code = error_code;
     }
     public int getError_code() {
         return error_code;
     }

    public void setReason(String reason) {
         this.reason = reason;
     }
     public String getReason() {
         return reason;
     }

    public void setResult(Result result) {
         this.result = result;
     }
     public Result getResult() {
         return result;
     }

    @Override
    public String toString() {
        return "QQTest{" +
                "error_code=" + error_code +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }
}