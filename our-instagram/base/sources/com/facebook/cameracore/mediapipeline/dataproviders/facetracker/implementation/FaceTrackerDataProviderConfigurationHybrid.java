package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation;

import X.AnonymousClass910;
import X.C224729vx;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class FaceTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C224729vx Companion = new Object();
    public final AnonymousClass910 configuration;

    public static final native HybridData initHybrid(int i, String[] strArr, String[] strArr2, String str, FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler faceTrackerDataProviderConfiguration$FaceTrackerErrorHandler, boolean z, Integer num, Integer num2);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FaceTrackerDataProviderConfigurationHybrid(X.AnonymousClass910 r9) {
        /*
            r8 = this;
            java.lang.Integer r0 = r9.A01
            int r0 = X.AbstractC200588u1.A00(r0)
            java.lang.String[] r1 = r9.A06
            X.C14360o3.A07(r1)
            java.lang.String[] r2 = r9.A05
            java.lang.String r3 = r9.A04
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler r4 = r9.A00
            boolean r5 = r9.A07
            java.lang.Integer r6 = r9.A02
            java.lang.Integer r7 = r9.A03
            com.facebook.jni.HybridData r0 = initHybrid(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.<init>(r0)
            r8.configuration = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid.<init>(X.910):void");
    }
}
