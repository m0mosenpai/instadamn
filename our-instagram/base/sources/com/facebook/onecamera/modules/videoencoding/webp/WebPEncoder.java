package com.facebook.onecamera.modules.videoencoding.webp;

import X.AbstractC166997dE;
import X.C09170dP;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class WebPEncoder {
    public final AtomicBoolean mDestructed = AbstractC166997dE.A17();
    public HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    public native int addFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    public native ByteBuffer assemble();

    public native int prepare(int i, int i2, boolean z);

    static {
        C09170dP.A0C("webpencoder-native");
    }
}
