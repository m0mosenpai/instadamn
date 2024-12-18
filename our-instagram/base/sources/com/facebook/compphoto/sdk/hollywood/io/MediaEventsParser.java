package com.facebook.compphoto.sdk.hollywood.io;

import X.C09170dP;
import X.C72541Xg9;
import com.facebook.compphoto.sdk.hollywood.data.MediaEvents;
import com.facebook.jni.HybridData;

/* loaded from: classes12.dex */
public final class MediaEventsParser {
    public static final C72541Xg9 Companion = new Object();
    public final HybridData mHybridData = initHybridNative();

    private final native HybridData initHybridNative();

    private final native MediaEvents parseFileNative(String str);

    private final native MediaEvents parseJsonNative(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Xg9] */
    static {
        C09170dP.A0C("compphoto-hollywood-io");
    }
}
