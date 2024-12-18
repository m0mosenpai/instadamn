package com.facebook.video.videostreaming.eventlog;

import X.C09170dP;
import X.S1X;
import com.facebook.jni.HybridClassBase;
import com.facebook.proxygen.EventBase;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes10.dex */
public abstract class VideoProtocolEventLog extends HybridClassBase {
    public static final S1X Companion = new Object();

    private final native void initHybrid(EventBase eventBase, XAnalyticsHolder xAnalyticsHolder);

    public final native String[] getLogLines();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.S1X] */
    static {
        C09170dP.A0C("android-video-protocol-eventlog");
    }
}
