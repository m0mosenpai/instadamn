package com.facebook.cameracore.mediapipeline.arengineservices.utils;

import X.C09170dP;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;

/* loaded from: classes4.dex */
public final class ManifestUtils {
    public static final ManifestUtils INSTANCE = new Object();
    public static boolean forceSOLoad;

    public static final native int[] filterNeededServicesNative(String str, String str2, int[] iArr, ARExperimentConfig aRExperimentConfig);

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils, java.lang.Object] */
    static {
        C09170dP.A0C("arengineservicesutils");
    }
}
