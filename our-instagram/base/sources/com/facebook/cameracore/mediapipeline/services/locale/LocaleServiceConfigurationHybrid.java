package com.facebook.cameracore.mediapipeline.services.locale;

import X.C90T;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class LocaleServiceConfigurationHybrid extends ServiceConfiguration {
    public final C90T mConfiguration;

    public static native HybridData initHybrid(LocaleDataSource localeDataSource);

    public LocaleServiceConfigurationHybrid(C90T c90t) {
        super(initHybrid(c90t.A00));
        this.mConfiguration = c90t;
    }
}
