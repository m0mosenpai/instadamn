package com.facebook.cameracore.logging.spars.xplatimpl;

import X.C09170dP;
import X.C0L6;
import X.C14360o3;
import X.C150646qJ;
import X.InterfaceC150636qH;
import com.facebook.jni.HybridData;

/* loaded from: classes3.dex */
public final class XplatSparsLogger {
    public static final C150646qJ Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static final native boolean consistencyHelperHasError();

    public static final native int consistencyHelperNumProcessedSessions();

    public static final native void debugExpectSessionOpen(String str);

    public static final native void flushAndDestroyConsistencyHelper();

    public static final native void flushConsistencyHelper();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public static final XplatSparsLogger makeInstance(InterfaceC150636qH interfaceC150636qH) {
        return C150646qJ.A00(interfaceC150636qH);
    }

    public void logSessionClosure(String str, boolean z) {
        C14360o3.A0B(str, 0);
        logSessionClosureNative(str, z);
    }

    public final native void logSessionClosureNative(String str, boolean z);

    public void logSessionCreation(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        C14360o3.A0B(str5, 4);
        C14360o3.A0B(str6, 6);
        logSessionCreationNative(C0L6.A01(), str, str2, str3, str4, str5, z, str6);
    }

    public final native void logSessionCreationNative(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7);

    public final native void setRawEventLogger(XplatRawEventLogger xplatRawEventLogger);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6qJ, java.lang.Object] */
    static {
        C09170dP.A0C("camera-xplat-spars-jni");
    }

    public static final XplatSparsLogger makeInstance(XplatRawEventLogger xplatRawEventLogger) {
        if (xplatRawEventLogger != null) {
            return new XplatSparsLogger(xplatRawEventLogger);
        }
        return new XplatSparsLogger();
    }

    public XplatSparsLogger(XplatRawEventLogger xplatRawEventLogger) {
        setRawEventLogger(xplatRawEventLogger);
    }

    public XplatSparsLogger() {
    }

    public static final XplatSparsLogger makeInstance() {
        return new XplatSparsLogger();
    }
}
