package com.constraint.interfacedemo;

/**
 * Created by S Soft on 04-Sep-17.
 */

public class InterfaceModelClass {
    private static InterfaceModelClass mInstance;
    private OnCustomStateListener mListener;
    private OnCustomStateListener2 mListener2;
    private boolean mState;

    /* interface declaration */
    public interface OnCustomStateListener {
        void implementForFirstFragment();
    }
    public interface OnCustomStateListener2 {
        void implementForFirstActivity();
    }
    /* default constructor */
    private InterfaceModelClass() {}

    /* static method to get instance */
    public static InterfaceModelClass getInstance() {
        if(mInstance == null) {
            mInstance = new InterfaceModelClass();
        }
        return mInstance;
    }

    /* method to set listener */
    public void setListener(OnCustomStateListener listener) {
        mListener = listener;
    }
    public void setListener2(OnCustomStateListener2 listener2) {
        mListener2 = listener2;
    }
    public void callInSecondActivitToImplementInFirstFragment(){
        mListener.implementForFirstFragment();
    }
    public void callInSecondActivityImplementInFirstActivity(){
        mListener2.implementForFirstActivity();
    }

}
