package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.C8zr;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class UIControlServiceConfigurationHybrid extends ServiceConfiguration {
    public final C8zr mConfiguration;
    public final UIControlServiceDelegateWrapper mWrapper;

    public static native HybridData initHybrid(UIControlServiceDelegateWrapper uIControlServiceDelegateWrapper, float f, int i);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UIControlServiceConfigurationHybrid(X.C8zr r4) {
        /*
            r3 = this;
            com.facebook.cameracore.mediapipeline.services.uicontrol.UIControlServiceDelegateWrapper r2 = r4.A01
            r1 = 0
            r0 = -1
            com.facebook.jni.HybridData r0 = initHybrid(r2, r1, r0)
            r3.<init>(r0)
            r3.mConfiguration = r4
            r3.mWrapper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.uicontrol.UIControlServiceConfigurationHybrid.<init>(X.8zr):void");
    }
}
