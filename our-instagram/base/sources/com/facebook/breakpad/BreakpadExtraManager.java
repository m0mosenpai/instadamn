package com.facebook.breakpad;

import X.C09170dP;
import X.C0K8;

/* loaded from: classes.dex */
public class BreakpadExtraManager {
    public static native boolean appendSessionIdInTombstone(String str);

    static {
        try {
            C09170dP.A0C("breakpad_extra");
        } catch (UnsatisfiedLinkError e) {
            C0K8.A0F("BreakpadExtra", "Failed to load breakpad extra jni library: ", e);
        }
    }
}
