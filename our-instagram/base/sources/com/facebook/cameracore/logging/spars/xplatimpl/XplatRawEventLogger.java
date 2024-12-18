package com.facebook.cameracore.logging.spars.xplatimpl;

import X.C09170dP;
import X.C14360o3;
import X.C150626qG;
import X.C150656qL;
import X.InterfaceC150636qH;
import com.facebook.jni.HybridData;

/* loaded from: classes3.dex */
public final class XplatRawEventLogger {
    public static final C150656qL Companion = new Object();
    public final InterfaceC150636qH logWriter;
    public final HybridData mHybridData;

    public XplatRawEventLogger(InterfaceC150636qH interfaceC150636qH) {
        C14360o3.A0B(interfaceC150636qH, 1);
        this.logWriter = interfaceC150636qH;
        this.mHybridData = initHybrid();
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6qL, java.lang.Object] */
    static {
        C09170dP.A0C("camera-xplat-spars-jni");
    }

    public final void logEvent(String str, String str2) {
        C150626qG c150626qG = (C150626qG) this.logWriter;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        c150626qG.A00.logRawEvent(str, str2);
    }
}
