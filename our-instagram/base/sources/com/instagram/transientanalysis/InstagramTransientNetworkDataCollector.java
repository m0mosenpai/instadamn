package com.instagram.transientanalysis;

import X.AbstractC09440dt;
import X.AbstractC72462XeA;
import X.C09270dc;
import X.C10T;
import X.C14360o3;
import X.C24021Fq;
import X.C24031Fr;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import com.facebook.jni.HybridData;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class InstagramTransientNetworkDataCollector {
    public static final C24021Fq Companion = new Object();
    public static final String TAG = "InstagramTransientNetworkDataCollector";
    public static final InterfaceC09390do instance$delegate;
    public static final AtomicBoolean isInitialized;
    public final AtomicBoolean _isTracingActive;
    public final HybridData mHybridData;

    public /* synthetic */ InstagramTransientNetworkDataCollector(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native HybridData initHybrid();

    public static final void initialize(UserSession userSession) {
        Companion.A00();
    }

    private final native void setTraceId(String str);

    public void setAppDeviceInfo(AbstractC72462XeA abstractC72462XeA) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1Fq] */
    static {
        C09270dc.A03("igtransientdatacollector");
        instance$delegate = AbstractC09440dt.A00(EnumC09460dv.A04, C24031Fr.A00);
        isInitialized = new AtomicBoolean(false);
    }

    public static final InstagramTransientNetworkDataCollector get() {
        return (InstagramTransientNetworkDataCollector) instance$delegate.getValue();
    }

    public boolean isTracking(File file) {
        return this._isTracingActive.get();
    }

    public void startDataCollection(File file, boolean z) {
        String str;
        if (!(!this._isTracingActive.compareAndSet(false, true))) {
            C10T A00 = C10T.A00();
            synchronized (A00) {
                str = A00.A01;
                if (str.equals("UNKNOWN_TRACEID")) {
                    str = "UNKNOWN_SESSIONID";
                }
            }
            C14360o3.A07(str);
            setTraceId(str);
        }
    }

    public void stopDataCollection(File file) {
        setTraceId("");
        this._isTracingActive.set(false);
    }

    public InstagramTransientNetworkDataCollector() {
        this._isTracingActive = new AtomicBoolean(false);
        this.mHybridData = initHybrid();
    }
}
