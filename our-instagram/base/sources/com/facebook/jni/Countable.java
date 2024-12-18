package com.facebook.jni;

import X.C09270dc;

/* loaded from: classes.dex */
public class Countable {
    public long mInstance = 0;

    public native void dispose();

    static {
        C09270dc.A03("fb");
    }

    public void finalize() {
        dispose();
    }
}
