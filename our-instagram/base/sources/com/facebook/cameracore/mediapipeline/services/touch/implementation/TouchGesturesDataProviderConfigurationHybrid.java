package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import X.AbstractC2039690j;
import X.C2039490h;
import X.C2039590i;
import X.C224979wM;
import X.C9YK;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes4.dex */
public final class TouchGesturesDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C224979wM Companion = new Object();
    public final C2039490h configuration;
    public final TouchGesturesDelegateWrapper delegate;

    public static final native HybridData initHybrid(TouchGesturesDelegateWrapper touchGesturesDelegateWrapper);

    public TouchGesturesDataProviderConfigurationHybrid(C2039490h c2039490h) {
        List list;
        this.configuration = c2039490h;
        TouchGesturesDelegateWrapper touchGesturesDelegateWrapper = new TouchGesturesDelegateWrapper();
        this.delegate = touchGesturesDelegateWrapper;
        AbstractC2039690j abstractC2039690j = c2039490h.A00;
        if (abstractC2039690j instanceof C2039590i) {
            list = ((C2039590i) abstractC2039690j).A03;
        } else {
            list = ((C9YK) abstractC2039690j).A01;
        }
        list.add(touchGesturesDelegateWrapper);
        this.mHybridData = initHybrid(touchGesturesDelegateWrapper);
    }
}
