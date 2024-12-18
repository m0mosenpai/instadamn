package com.instagram.debug.devoptions.debughead.data.provider;

import android.view.MotionEvent;
import com.instagram.debug.devoptions.apiperf.TouchEventProvider;
import com.instagram.debug.devoptions.debughead.data.delegates.TouchEventDelegate;

/* loaded from: classes12.dex */
public class DebugHeadTouchListener implements TouchEventProvider {
    public static final DebugHeadTouchListener INSTANCE = new Object();
    public TouchEventDelegate mListener;

    @Override // com.instagram.debug.devoptions.apiperf.TouchEventProvider
    public void onTouchEvent(MotionEvent motionEvent) {
        TouchEventDelegate touchEventDelegate = this.mListener;
        if (touchEventDelegate != null) {
            touchEventDelegate.onTouchEvent(motionEvent);
        }
    }

    public static DebugHeadTouchListener getInstance() {
        return INSTANCE;
    }

    public void setDelegate(TouchEventDelegate touchEventDelegate) {
        this.mListener = touchEventDelegate;
    }
}
