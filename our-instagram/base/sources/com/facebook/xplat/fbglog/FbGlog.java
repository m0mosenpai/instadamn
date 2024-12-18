package com.facebook.xplat.fbglog;

import X.C09270dc;
import X.C0K8;
import X.C0K9;
import java.util.List;

/* loaded from: classes.dex */
public class FbGlog {
    public static C0K9 sCallback;

    public static native void setLogLevel(int i);

    public static native void setSkipSubscribe(boolean z);

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0K9, java.lang.Object] */
    public static synchronized void ensureSubscribedToBLogLevelChanges() {
        synchronized (FbGlog.class) {
            if (sCallback == null) {
                ?? obj = new Object();
                sCallback = obj;
                List list = C0K8.A00;
                synchronized (C0K8.class) {
                    list.add(obj);
                }
                setLogLevel(C0K8.A01.getMinimumLoggingLevel());
            }
        }
    }

    static {
        C09270dc.A03("fb");
    }
}
