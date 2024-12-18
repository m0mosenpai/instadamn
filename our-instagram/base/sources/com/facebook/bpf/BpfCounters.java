package com.facebook.bpf;

import X.C09270dc;
import X.C0CR;
import X.C0K8;
import java.util.HashMap;

/* loaded from: classes.dex */
public class BpfCounters {
    public static final boolean A00;

    public static native void closeBpfMapImpl(int i);

    public static native void getBpfCountersImpl(HashMap hashMap, int i);

    public static native int openBpfMapImpl(String str);

    static {
        boolean z = false;
        if (!C0CR.A00.isEmpty()) {
            try {
                C09270dc.A03("bpfcounters");
                z = true;
            } catch (UnsatisfiedLinkError e) {
                C0K8.A06(BpfCounters.class, "Could not load bpfcounters library", e);
                C0K8.A03(BpfCounters.class, "Consider adding dependency on bpfcounters-jni");
            }
        }
        A00 = z;
    }
}
