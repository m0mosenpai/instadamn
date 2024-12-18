package com.facebook.jni;

import X.C09270dc;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class CpuCapabilitiesJni {
    public static native boolean nativeDeviceSupportsNeon();

    public static native boolean nativeDeviceSupportsVFPFP16();

    public static native boolean nativeDeviceSupportsX86();

    public static native ArrayList nativeGetArmFeatures();

    static {
        C09270dc.A03("fb");
    }
}
