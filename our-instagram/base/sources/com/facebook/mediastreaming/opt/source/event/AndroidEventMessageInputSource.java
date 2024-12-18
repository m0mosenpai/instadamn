package com.facebook.mediastreaming.opt.source.event;

import X.C09170dP;
import X.C53703Nos;
import com.facebook.jni.HybridClassBase;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class AndroidEventMessageInputSource extends HybridClassBase {
    public static final C53703Nos Companion = new Object();

    private final native void initHybrid();

    public final native void sendEventMessage(long j, ByteBuffer byteBuffer, long j2, long j3);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Nos, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming");
    }

    public AndroidEventMessageInputSource() {
        initHybrid();
    }
}
