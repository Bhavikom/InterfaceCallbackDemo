package com.constraint.interfacedemobest;

/**
 * Created by S Soft on 15-Dec-17.
 */

public class CallbackClass {
    ICallback ic;

    CallbackClass(ICallback ic,String s){
        this.ic = ic;
    }
    void callCallback(){
        ic.callback("this is callback");
    }


}
interface ICallback {
        public void callback(String s);
        }
